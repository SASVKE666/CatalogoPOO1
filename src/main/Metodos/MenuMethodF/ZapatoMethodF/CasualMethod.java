package main.Metodos.MenuMethodF.ZapatoMethodF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import main.Clases.Products.ZapatoF.Casual;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class CasualMethod {

        static int selectZapato = 0;

        static Casual[] casualArray = new Casual[5];

        static int almacen = 0;
        /*
         * variable estática tipo File. Esta variable representa un archivo en el
         * sistema.
         */
        static File infoZapatoCasual = new File("src\\InfoProductos\\infoZapatoCasual.txt");
        /*
         * variable estática tipo FileWriter. Variable se utilizará para escribir en el
         * archivo.
         */
        static FileWriter escribir;
        /*
         * variable estática tipo PrintWriter. Variable se utilizará para imprimir texto
         * en el archivo.
         */
        static PrintWriter imprimir;

        public static void readerFileCasual() {
                try (FileReader lector = new FileReader(infoZapatoCasual);
                                BufferedReader almacen = new BufferedReader(lector)) {

                        for (int i = 0; i < casualArray.length; i++) {

                                String nombre = almacen.readLine();

                                if (nombre == null) {
                                        break;
                                }

                                double precio = Double.parseDouble(almacen.readLine());
                                String color = almacen.readLine();
                                String marca = almacen.readLine();
                                double talla = Double.valueOf(almacen.readLine());
                                String material = almacen.readLine();
                                String categoria = almacen.readLine();

                                
                                Casual newCasual = new Casual(
                                                nombre,
                                                precio,
                                                color,
                                                marca,
                                                talla,
                                                material,
                                                categoria);
                                casualArray[i] = newCasual;
                        }

                        for (Casual casual : casualArray) {
                                if (casual != null) {
                                        System.out.println(casual.toString());
                                }
                        }

                } catch (IOException | NumberFormatException e) {
                        System.out.println(e);
                }
        }

        public static void zapatoCasual() {
                do {
                        // Try catch para evitar que el programa termine si hay un error
                        try {
                                Object[] options = { "Insertar", "Borrar", "Buscar", "Imprimir", "Editar", "Regresar" };

                                selectZapato = JOptionPane.showOptionDialog(null,
                                                "Seleccione una opción:",
                                                "Zapato Casual Menu",
                                                JOptionPane.DEFAULT_OPTION,
                                                JOptionPane.INFORMATION_MESSAGE,
                                                null,
                                                options,
                                                options[0]);

                                switch (selectZapato) {
                                        case 0:
                                                inputZapatoCasual();
                                                break;

                                        case 1:
                                                eraseZapatoCasual();
                                                break;

                                        case 2:
                                                findZapatoCasual();
                                                break;

                                        case 3:
                                                printZapatoCasual();
                                                break;

                                        case 4:
                                                editZapatoCasual();
                                                break;

                                        case 5:
                                                ZapatoMethod.zapato();
                                                return;

                                }

                        } catch (Exception e) {
                                JOptionPane.showMessageDialog(null,
                                                "Ups! Error!",
                                                "Zapato Casual Menu",
                                                JOptionPane.WARNING_MESSAGE);
                        }

                } while (selectZapato != 5);
        }

        public static void writeToFileCasual() {
                try {
                        /*
                         * Se crea un nuevo objeto File llamado infoZapatoCasual que representa el
                         * archivo "infoZapatoCasual.txt" en el sistema de archivos.
                         */
                        // infoZapatoCasual = new File("src\\InfoProductos\\infoZapatoCasual.txt");

                        /*
                         * Se comprueba si el archivo "infoZapatoCasual.txt" ya existe en el sistema de
                         * archivos.
                         */
                        /*
                         * if (infoZapatoCasual.exists()) {
                         * 
                         * infoZapatoCasual.delete();
                         * }
                         */

                        /*
                         * Se comprueba si el archivo "infoZapatoCasual.txt" no existe en el sistema de
                         * archivos.
                         */
                        if (!infoZapatoCasual.exists()) {
                                /*
                                 * Si el archivo no existe, se crea un nuevo archivo con el nombre
                                 * "infoZapatoCasual.txt".
                                 */
                                infoZapatoCasual.createNewFile();
                        }

                        /*
                         * Se crea un nuevo objeto FileWriter llamado escribir, que se utilizará para
                         * escribir en el archivo "infoZapatoCasual.txt". El parámetro true indica que
                         * se añadirán los datos al final del archivo si este ya existe.
                         */
                        escribir = new FileWriter(infoZapatoCasual, true);

                        /*
                         * Se crea un nuevo objeto PrintWriter llamado imprimir, que se utilizará para
                         * imprimir en el archivo utilizando el objeto FileWriter previamente creado.
                         */
                        imprimir = new PrintWriter(escribir);

                        /*
                         * El siguiente bloque de código recorre un array de objetos de la clase Casual
                         * llamado casualArray y escribe los atributos de cada objeto en el archivo
                         * "infoZapatoCasual.txt" utilizando el objeto PrintWriter:
                         */
                        for (Casual casual : casualArray) {
                                if (casual != null) {
                                        imprimir.println(casual.getNombre());
                                        imprimir.println(casual.getPrecio());
                                        imprimir.println(casual.getColor());
                                        imprimir.println(casual.getMarca());
                                        imprimir.println(casual.getTalla());
                                        imprimir.println(casual.getMaterial());
                                        imprimir.println(casual.getCategoria());
                                }
                        }

                        /*
                         * Se cierra el objeto PrintWriter, lo que asegura que todos los datos
                         * pendientes se escriban en el archivo y se liberen los recursos asociados.
                         */
                        imprimir.close();
                        /*
                         * Se cierra el objeto FileWriter, lo que asegura que todos los datos pendientes
                         * se escriban en el archivo y se liberen los recursos asociados.
                         */
                        escribir.close();
                        /*
                         * catch of the first try, if a general error is found in the method it will
                         * release the warning
                         */
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al escribir en el archivo",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                }
        }

        public static void inputZapatoCasual() {

                try {
                        int count;
                        while (true) {
                                try {

                                        String input = JOptionPane.showInputDialog(
                                                        "Cuantos zapatos casuales desea ingresar?",
                                                        "01");

                                        if (input == null) {
                                                JOptionPane.showMessageDialog(null, "Ingreso Cancelado",
                                                                "Ingresar zapato casual",
                                                                JOptionPane.WARNING_MESSAGE);
                                                return;
                                        }
                                        count = Integer.valueOf(input);

                                        if (count <= 0) {
                                                JOptionPane.showMessageDialog(
                                                                null,
                                                                "Debe ingresar obligatoriamente un número entero.",
                                                                "Error",
                                                                JOptionPane.ERROR_MESSAGE);

                                        } else {
                                                // Rompe el bucle while una vez que se ha obtenido un valor válido para
                                                // count.
                                                break;
                                        }
                                } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(
                                                        null,
                                                        "Debe ingresar obligatoriamente un número entero.",
                                                        "Error",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                        }

                        for (int i = 0; i < count; i++) {

                                if (almacen >= casualArray.length) {
                                        JOptionPane.showMessageDialog(null,
                                                        "El almacen de está lleno. No se pueden agregar más productos.",
                                                        "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                                        return;

                                } else {

                                        String nombre = JOptionPane.showInputDialog(null,
                                                        "Ingrese el nombre del Zapato Casual " + (almacen + 1) + ":",
                                                        "NOMBRE");
                                        // Verifica si el usuario ha presionado "Cancelar" en el cuadro de diálogo de
                                        // entrada y lanza una excepción NullPointerException si es así.
                                        if (nombre == null) {
                                                throw new NullPointerException();
                                        }

                                        double precio;
                                        while (true) {
                                                try {
                                                        precio = Double.valueOf(JOptionPane.showInputDialog(null,
                                                                        "Ingrese el precio del Zapato Casual "
                                                                                        + (almacen + 1) + ":",
                                                                        "00"));
                                                        break;
                                                } catch (NumberFormatException e) {
                                                        JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                                        "Error", JOptionPane.ERROR_MESSAGE);
                                                }
                                        }

                                        String color = JOptionPane.showInputDialog(null,
                                                        "Ingrese el color del Zapato Casual " + (almacen + 1) + ":",
                                                        "COLOR");
                                        if (color == null) {
                                                throw new NullPointerException();
                                        }

                                        String marca = JOptionPane.showInputDialog(null,
                                                        "Ingrese la marca del Zapato Casual " + (almacen + 1) + ":",
                                                        "MARCA");
                                        if (marca == null) {
                                                throw new NullPointerException();
                                        }

                                        double talla;
                                        while (true) {
                                                try {
                                                        talla = Double.valueOf(JOptionPane.showInputDialog(null,
                                                                        "Ingrese la talla del Zapato Casual "
                                                                                        + (almacen + 1) + ":",
                                                                        "00"));
                                                        break;
                                                } catch (NumberFormatException e) {
                                                        JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                                        "Error", JOptionPane.ERROR_MESSAGE);
                                                }
                                        }

                                        String material = JOptionPane.showInputDialog(null,
                                                        "Ingrese el material del Zapato Casual " + (almacen + 1) + ":",
                                                        "MATERIAL");
                                        if (material == null) {
                                                throw new NullPointerException();
                                        }

                                        String categoria = JOptionPane.showInputDialog(null,
                                                        "Ingrese la categoría del Zapato Casual " + (almacen + 1) + ":",
                                                        "CATEGORÍA");
                                        if (categoria == null) {
                                                throw new NullPointerException();
                                        }

                                        Casual nuevoCasual = new Casual(nombre,
                                                        precio, color, marca, talla, material, categoria);

                                        casualArray[almacen] = nuevoCasual;

                                        JOptionPane.showMessageDialog(null,
                                                        "Zapato Casual " + (almacen + 1) + " :\n" +
                                                                        nuevoCasual.toString(),
                                                        "Confirmación de datos", JOptionPane.INFORMATION_MESSAGE);
                                }

                                almacen++;
                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ingreso Cancelado",
                                        "Ingresar Zapato Casual", JOptionPane.WARNING_MESSAGE);
                }

        }

        public static void eraseZapatoCasual() {

                try {
                        int codeToErase;

                        while (true) {
                                try {
                                        String input = JOptionPane.showInputDialog(null,
                                                        "Ingrese el codigo del Zapato Casual a eliminar",
                                                        "000");

                                        if (input == null) {
                                                JOptionPane.showMessageDialog(null, "Eliminacion Cancelada",
                                                                "Eliminar Zapato Casual",
                                                                JOptionPane.WARNING_MESSAGE);
                                                return;
                                        }

                                        codeToErase = Integer.valueOf(input);
                                        if (codeToErase <= 0) {
                                                JOptionPane.showMessageDialog(
                                                                null,
                                                                "Debe ingresar obligatoriamente un número entero.",
                                                                "Error",
                                                                JOptionPane.ERROR_MESSAGE);

                                        } else {
                                                // Rompe el bucle while una vez que se ha obtenido un valor válido para
                                                // count.
                                                break;
                                        }

                                } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                        "Error", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                        Casual zapatoErase = new Casual(codeToErase);

                        for (int i = 0; i < casualArray.length; i++) {

                                if (casualArray[i] != null && casualArray[i].equals(zapatoErase)) {

                                        int confirmacion = JOptionPane.showConfirmDialog(
                                                        null,
                                                        "¿Estás seguro de que deseas eliminar el siguiente Zapato Casual?\n"
                                                                        +
                                                                        casualArray[i].toString(),
                                                        "Confirmar Eliminación",
                                                        JOptionPane.YES_NO_OPTION);

                                        if (confirmacion == JOptionPane.NO_OPTION) {
                                                JOptionPane.showMessageDialog(
                                                                null, "Eliminacion cancelada",
                                                                "Eliminacion Cancelada",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                                return;
                                        }

                                        JOptionPane.showMessageDialog(
                                                        null,
                                                        "Zapato Casual eliminado: \n " +
                                                                        casualArray[i].toString(),
                                                        "Eliminacion Existosa",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        for (int j = i; j < casualArray.length - 1; j++) {
                                                casualArray[j] = casualArray[j + 1];
                                        }
                                        casualArray[casualArray.length - 1] = null;

                                        almacen--;
                                        printZapatoCasual();
                                        return;

                                }
                        }

                        JOptionPane.showMessageDialog(
                                        null,
                                        "Zapato Casual " + codeToErase + " no ha sido encontrado.",
                                        "Búsqueda Fallida",
                                        JOptionPane.WARNING_MESSAGE);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Eliminar Cancelado",
                                        "Eliminar Zapato Casual", JOptionPane.WARNING_MESSAGE);
                }

        }

        public static void findZapatoCasual() {

                try {
                        int codigoFind;
                        while (true) {
                                try {
                                        String input = JOptionPane.showInputDialog(
                                                        "Ingrese el código del Producto",
                                                        "000");

                                        if (input == null) {
                                                JOptionPane.showMessageDialog(null, "Busqueda Cancelada",
                                                                "Buscar Producto",
                                                                JOptionPane.WARNING_MESSAGE);
                                                return;
                                        }
                                        codigoFind = Integer.valueOf(input);
                                        if (codigoFind <= 0) {
                                                JOptionPane.showMessageDialog(
                                                                null,
                                                                "Debe ingresar obligatoriamente un número entero.",
                                                                "Error",
                                                                JOptionPane.ERROR_MESSAGE);

                                        } else {
                                                // Rompe el bucle while una vez que se ha obtenido un valor válido para
                                                // count.
                                                break;
                                        }
                                } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                        "Error", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                        Casual zapatoFind = new Casual(codigoFind);

                        for (Casual casual : casualArray) {
                                if (casual != null && casual.equals(zapatoFind)) {
                                        JOptionPane.showMessageDialog(null,
                                                        "Zapato encontrado: \n" + casual.toString(),
                                                        "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                                        return;
                                }
                        }

                        JOptionPane.showMessageDialog(null,
                                        "El zapato Casual con código " + codigoFind + " no ha sido encontrado.",
                                        "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Busqueda Cancelada",
                                        "Buscar Zapato Casual", JOptionPane.WARNING_MESSAGE);
                }

        }

        public static void printZapatoCasual() {

                try {
                        StringBuilder sb = new StringBuilder();

                        sb.append("Lista de Zapatos Casuales:\n");

                        for (Casual casual : casualArray) {
                                if (casual != null) {
                                        sb.append(casual.toString()).append("\n");
                                }
                        }

                        JOptionPane.showMessageDialog(null,
                                        sb.toString(),
                                        "Zapatos Casuales", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lista Cancelada",
                                        "Lista Zapato Casual", JOptionPane.WARNING_MESSAGE);
                }

        }

        public static void editZapatoCasual() {

                try {
                        Integer codeToEdit;
                        while (true) {
                                try {
                                        String input = JOptionPane.showInputDialog(
                                                        "Ingrese el codigo del Zapato Casual que va a cambiar",
                                                        "000");

                                        if (input == null) {
                                                JOptionPane.showMessageDialog(null, "Edicion Cancelada",
                                                                "Editar Zapato Casual",
                                                                JOptionPane.WARNING_MESSAGE);
                                                return;
                                        }
                                        codeToEdit = Integer.valueOf(input);

                                        if (codeToEdit <= 0) {
                                                JOptionPane.showMessageDialog(
                                                                null,
                                                                "Debe ingresar obligatoriamente un número entero.",
                                                                "Error",
                                                                JOptionPane.ERROR_MESSAGE);

                                        } else {
                                                // Rompe el bucle while una vez que se ha obtenido un valor válido para
                                                // count.
                                                break;
                                        }

                                } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                        "Error", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                        Casual zapatoFind = new Casual(codeToEdit);

                        for (int i = 0; i < casualArray.length; i++) {
                                if (casualArray[i] != null && casualArray[i].equals(zapatoFind)) {

                                        int confirmacion = JOptionPane.showConfirmDialog(
                                                        null,
                                                        "¿Estás seguro de que deseas editar el siguiente Zapato Casual?\n"
                                                                        +
                                                                        casualArray[i].toString(),
                                                        "Confirmar Edición",
                                                        JOptionPane.YES_NO_OPTION);

                                        if (confirmacion == JOptionPane.NO_OPTION) {
                                                JOptionPane.showMessageDialog(
                                                                null, "Edicion cancelada",
                                                                "Editar Cancelada",
                                                                JOptionPane.INFORMATION_MESSAGE);
                                                return;
                                        }

                                        if (confirmacion == JOptionPane.YES_OPTION) {

                                                String nombre = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nombre del Zapato Casual " + (i + 1) + ":",
                                                                "NOMBRE");
                                                // Verifica si el usuario ha presionado "Cancelar" en el cuadro de
                                                // diálogo de
                                                // entrada y lanza una excepción NullPointerException si es así.
                                                if (nombre == null) {
                                                        throw new NullPointerException();
                                                }

                                                double precio;
                                                while (true) {
                                                        try {
                                                                precio = Double.valueOf(JOptionPane.showInputDialog(
                                                                                null,
                                                                                "Ingrese el precio del Zapato Casual "
                                                                                                + (i + 1) + ":",
                                                                                "00"));
                                                                break;
                                                        } catch (NumberFormatException e) {
                                                                JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                                                "Error",
                                                                                JOptionPane.ERROR_MESSAGE);
                                                        }
                                                }

                                                String color = JOptionPane.showInputDialog(null,
                                                                "Ingrese el color del Zapato Casual " + (i + 1) + ":",
                                                                "COLOR");
                                                if (color == null) {
                                                        throw new NullPointerException();
                                                }

                                                String marca = JOptionPane.showInputDialog(null,
                                                                "Ingrese la marca del Zapato Casual " + (i + 1) + ":",
                                                                "MARCA");
                                                if (marca == null) {
                                                        throw new NullPointerException();
                                                }

                                                double talla;
                                                while (true) {
                                                        try {
                                                                talla = Double.valueOf(JOptionPane.showInputDialog(null,
                                                                                "Ingrese la talla del Zapato Casual "
                                                                                                + (i + 1) + ":",
                                                                                "00"));
                                                                break;
                                                        } catch (NumberFormatException e) {
                                                                JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                                                "Error",
                                                                                JOptionPane.ERROR_MESSAGE);
                                                        }
                                                }

                                                String material = JOptionPane.showInputDialog(null,
                                                                "Ingrese el material del Zapato Casual " + (i + 1)
                                                                                + ":",
                                                                "MATERIAL");
                                                if (material == null) {
                                                        throw new NullPointerException();
                                                }

                                                String categoria = JOptionPane.showInputDialog(null,
                                                                "Ingrese la categoría del Zapato Casual " + (i + 1)
                                                                                + ":",
                                                                "CATEGORÍA");
                                                if (categoria == null) {
                                                        throw new NullPointerException();
                                                }

                                                casualArray[i].setNombre(nombre);
                                                casualArray[i].setPrecio(precio);
                                                casualArray[i].setColor(color);
                                                casualArray[i].setMarca(marca);
                                                casualArray[i].setTalla(talla);
                                                casualArray[i].setMaterial(material);
                                                casualArray[i].setCategoria(categoria);

                                                JOptionPane.showMessageDialog(null,
                                                                "Zapato Casual actualizado: \n" +
                                                                                casualArray[i].toString(),
                                                                "Actualizacion Exitosa",
                                                                JOptionPane.INFORMATION_MESSAGE);

                                                printZapatoCasual();

                                                return;
                                        }

                                }
                        }

                        JOptionPane.showMessageDialog(null,
                                        "El Zapato Casual " +
                                                        codeToEdit + " no ha sido encontrada.",
                                        "Búsqueda Fallida",
                                        JOptionPane.WARNING_MESSAGE);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Edicion Cancelada",
                                        "Editar Zapato Casual", JOptionPane.WARNING_MESSAGE);
                }

        }

}
