package main.Metodos.MenuMethodF.CamisaMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.CamisaF.Ella;
import main.Metodos.MenuMethodF.CamisaMethod;

public class EllaMethod {

    static Ella[] ellaArray = new Ella[3];

    static int selectCamisa = 0;

    static int almacen = 0;

    public static void camisaElla() {
        do {
            // Try catch para evitar que el programa termine si hay un error
            try {
                Object[] options = { "Insertar", "Borrar", "Buscar", "Imprimir", "Editar", "Regresar" };

                selectCamisa = JOptionPane.showOptionDialog(null,
                        "Seleccione una opción:",
                        "Camisa Ella Menu",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);

                switch (selectCamisa) {
                    case 0:
                        inputCamisaElla();
                        break;

                    case 1:
                        eraseCamisaElla();
                        break;

                    case 2:
                        findCamisaElla();
                        break;

                    case 3:
                        printCamisaElla();
                        break;

                    case 4:
                        editCamisaElla();
                        break;

                    case 5:
                        CamisaMethod.camisa();
                        return;

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ups! Error!",
                        "Camisa Ella Menu", JOptionPane.WARNING_MESSAGE);
            }
        } while (selectCamisa != 5);
    }

    public static void inputCamisaElla() {

        try {
                int count;

                while (true) {
                        try {

                                String input = JOptionPane.showInputDialog(
                                                "Cuantas camisas para ella desea ingresar?",
                                                "01");

                                if (input == null) {
                                        JOptionPane.showMessageDialog(null, "Ingreso Cancelado",
                                                        "Ingresar Camisa Ella",
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

                if (almacen >= ellaArray.length) {
                    JOptionPane.showMessageDialog(null,
                            "El almacen está lleno. No se pueden agregar más productos.",
                            "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                    return;

                } else {
                        String nombre = JOptionPane.showInputDialog(null,
                        "Ingrese el nombre de la Camisa para Ella " + (almacen + 1) + ":",
                        "NOMBRE");
        if (nombre == null) {
                throw new NullPointerException();
        }
        double precio;
        while (true) {
                try {
                        precio = Double.valueOf(JOptionPane.showInputDialog(null,
                                        "Ingrese el precio de la Camisa para Ella "
                                                        + (almacen + 1) + ":",
                                        "00"));
                        break;
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }

        String color = JOptionPane.showInputDialog(null,
                        "Ingrese el color de la Camisa para Ella " + (almacen + 1) + ":",
                        "COLOR");
        if (color == null) {
                throw new NullPointerException();
        }
        String marca = JOptionPane.showInputDialog(null,
                        "Ingrese la marca de la Camisa para Ella " + (almacen + 1) + ":",
                        "MARCA");
        if (marca == null) {
                throw new NullPointerException();
        }
        String talla = JOptionPane.showInputDialog(null,
                        "Ingrese la talla de la Camisa para Ella " + (almacen + 1) + ":",
                        "TALLA");
        if (talla == null) {
                throw new NullPointerException();
        }
        String tela = JOptionPane.showInputDialog(null,
                        "Ingrese el material de la Camisa para Ella " + (almacen + 1) + ":",
                        "MATERIAL");
        if (tela == null) {
                throw new NullPointerException();
        }
        String estilo = JOptionPane.showInputDialog(null,
                        "Ingrese la categoria de la Camisa para Ella " + (almacen + 1) + ":",
                        "ESTILO");
        if (estilo == null) {
                throw new NullPointerException();
        }

                    Ella nuevoElla = new Ella(nombre,
                            precio, color, marca, talla, tela, estilo);

                    ellaArray[almacen] = nuevoElla;

                    JOptionPane.showMessageDialog(null,
                            "Camisa Ella " + (almacen + 1) + " :\n" +
                                    nuevoElla.toString(),
                            "Confirmacion de datos", JOptionPane.INFORMATION_MESSAGE);
                }

                almacen++;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso Cancelado",
                    "Ingresar Camisa Ella", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void eraseCamisaElla() {

        try {
                int codeToErase;
                while (true) {
                        try {
                                String input = JOptionPane.showInputDialog(null,
                                                "Ingrese el codigo de la Camisa Ella a eliminar",
                                                "000");

                                if (input == null) {
                                        JOptionPane.showMessageDialog(null, "Eliminacion Cancelada",
                                                        "Eliminar Camisa Ella",
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

            Ella ellaErase = new Ella(codeToErase);

            for (int i = 0; i < ellaArray.length; i++) {

                if (ellaArray[i] != null && ellaArray[i].equals(ellaErase)) {

                    int confirmacion = JOptionPane.showConfirmDialog(
                            null,
                            "¿Estás seguro de que deseas eliminar la siguiente Camisa Ella?\n" +
                                    ellaArray[i].toString(),
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
                            "Camisa Ella eliminado: \n " +
                                    ellaArray[i].toString(),
                            "Eliminacion Existosa",
                            JOptionPane.INFORMATION_MESSAGE);

                    for (int j = i; j < ellaArray.length - 1; j++) {
                        ellaArray[j] = ellaArray[j + 1];
                    }

                    ellaArray[ellaArray.length - 1] = null;

                    almacen--;

                    printCamisaElla();
                    return;
                }
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Camisa Ella " + codeToErase + " no ha sido encontrado.",
                    "Búsqueda Fallida",
                    JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Eliminacion Cancelado",
                    "Eliminar Camisa Ella", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void findCamisaElla() {

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
            Ella ellaFind = new Ella(codigoFind);

            for (Ella ella : ellaArray) {
                if (ella != null && ella.equals(ellaFind)) {
                    JOptionPane.showMessageDialog(null,
                            "Camisa encontrada: \n" + ella.toString(),
                            "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }

            JOptionPane.showMessageDialog(null,
                    "La camisa para Ella con código " + codigoFind + " no ha sido encontrado.",
                    "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Busqueda Cancelada",
                    "Buscar Camisa Ella", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void printCamisaElla() {

        try {
            StringBuilder sb = new StringBuilder();

            sb.append("Lista de Camisas para Ella:\n");

            for (Ella ella : ellaArray) {
                if (ella != null) {
                    sb.append(ella.toString()).append("\n");
                }
            }

            JOptionPane.showMessageDialog(null,
                    sb.toString(), "Camisas Ella", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lista Cancelada",
                    "Lista Camisa Ella", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void editCamisaElla() {

        try {
                Integer codeToEdit;
                while (true) {
                        try {
                                String input = JOptionPane.showInputDialog(
                                                "Ingrese el codigo de la Camisa Ella que va a cambiar",
                                                "000");

                                if (input == null) {
                                        JOptionPane.showMessageDialog(null, "Edicion Cancelada",
                                                        "Editar Camisa Ella",
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

            Ella ellaFind = new Ella(codeToEdit);

            for (int i = 0; i < ellaArray.length; i++) {
                if (ellaArray[i] != null && ellaArray[i].equals(ellaFind)) {

                    int confirmacion = JOptionPane.showConfirmDialog(
                            null,
                            "¿Estás seguro de que deseas editar la siguiente Camisa Ella?\n" +
                                    ellaArray[i].toString(),
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
                                                                "Ingrese el nombre de la Camisa para Ella "
                                                                                + (almacen + 1) + ":",
                                                                "NOMBRE");
                                                if (nombre == null) {
                                                        throw new NullPointerException();
                                                }
                                                double precio;
                                                while (true) {
                                                        try {
                                                                precio = Double.valueOf(JOptionPane.showInputDialog(
                                                                                null,
                                                                                "Ingrese el precio de la Camisa para Ella "
                                                                                                + (almacen + 1) + ":",
                                                                                "00"));
                                                                break;
                                                        } catch (NumberFormatException e) {
                                                                JOptionPane.showMessageDialog(null, "Ingrese un número",
                                                                                "Error",
                                                                                JOptionPane.ERROR_MESSAGE);
                                                        }
                                                }

                                                String color = JOptionPane.showInputDialog(null,
                                                                "Ingrese el color de la Camisa para Ella "
                                                                                + (almacen + 1) + ":",
                                                                "COLOR");
                                                if (color == null) {
                                                        throw new NullPointerException();
                                                }
                                                String marca = JOptionPane.showInputDialog(null,
                                                                "Ingrese la marca de la Camisa para Ella "
                                                                                + (almacen + 1) + ":",
                                                                "MARCA");
                                                if (marca == null) {
                                                        throw new NullPointerException();
                                                }
                                                String talla = JOptionPane.showInputDialog(null,
                                                                "Ingrese la talla de la Camisa para Ella "
                                                                                + (almacen + 1) + ":",
                                                                "TALLA");
                                                if (talla == null) {
                                                        throw new NullPointerException();
                                                }
                                                String tela = JOptionPane.showInputDialog(null,
                                                                "Ingrese el material de la Camisa para Ella "
                                                                                + (almacen + 1) + ":",
                                                                "MATERIAL");
                                                if (tela == null) {
                                                        throw new NullPointerException();
                                                }
                                                String estilo = JOptionPane.showInputDialog(null,
                                                                "Ingrese la categoria de la Camisa para Ella "
                                                                                + (almacen + 1) + ":",
                                                                "ESTILO");
                                                if (estilo == null) {
                                                        throw new NullPointerException();
                                                }

                        ellaArray[i].setNombre(nombre);
                        ellaArray[i].setPrecio(precio);
                        ellaArray[i].setColor(color);
                        ellaArray[i].setMarca(marca);
                        ellaArray[i].setTalla(talla);
                        ellaArray[i].setTela(tela);
                        ellaArray[i].setEstilo(estilo);

                        JOptionPane.showMessageDialog(
                                null,
                                "Camisa Ella actualizada: \n" +
                                        ellaArray[i].toString(),
                                "Actualizacion exitosa",
                                JOptionPane.INFORMATION_MESSAGE);

                        printCamisaElla();
                        return;
                    }

                }
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Camisa Ella " +
                            codeToEdit + " no ha sido encontrado.",
                    "Busqueda Fallida",
                    JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Edicion Cancelada",
                    "Editar Camisa Ella", JOptionPane.WARNING_MESSAGE);
        }

    }

}
