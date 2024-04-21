package main.Metodos.MenuMethodF.ZapatoMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.ZapatoF.Casual;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class CasualMethod {

    static int selectZapato = 0;

    static Casual[] casualArray = new Casual[3];

    static int almacen = 0;

    public static void zapatoCasual(){
        do{
                //Try catch para evitar que el programa termine si hay un error
            try{
                Object[] options = {"Insertar", "Borrar", "Buscar", "Imprimir", "Editar", "Regresar"};

                selectZapato = JOptionPane.showOptionDialog(null,
                        "Seleccione una opción:",
                        "Zapato Tenis Menu",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);

                switch(selectZapato){
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

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Ups! Error!",
                "CASUAL", JOptionPane.WARNING_MESSAGE);
            }

        }while(selectZapato != 5);
    }

    public static void inputZapatoCasual(){ 

        int count = Integer.valueOf(JOptionPane.showInputDialog(
            "¿Cuántos zapatos casuales desea ingresar?", 
            "01"));

        /* if (casualArray[almacen] != null) {

            JOptionPane.showMessageDialog(null, 
            "1El almacen de zapatos casuales está lleno. No se pueden agregar más productos.", 
            "Advertencia", JOptionPane.WARNING_MESSAGE);

            input = false;
        
        } */

        

        for (int i = 0; i < count; i++) {
            
            if (almacen >= casualArray.length) {
                JOptionPane.showMessageDialog(null, 
                "El almacen de está lleno. No se pueden agregar más productos.", 
                "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                return;

            } else { 

                String nombre = JOptionPane.showInputDialog(null, 
                "Ingrese el nombre del Zapato Casual " + (almacen + 1) + ":",
                "nombre");

                double precio = Double.valueOf(JOptionPane.showInputDialog(null, 
                "Ingrese el precio del Zapato Casual " + (almacen + 1) + ":", 
                "00"));

                String color = JOptionPane.showInputDialog(null, 
                "Ingrese el color del Zapato Casual " + (almacen + 1) + ":", 
                "COLOR");

                String marca = JOptionPane.showInputDialog(null, 
                "Ingrese la marca del Zapato Casual " + (almacen + 1) + ":", 
                "MARCA");

                double talla = Double.valueOf(JOptionPane.showInputDialog(null, 
                "Ingrese la talla del Zapato Casual " + (almacen + 1) + ":", 
                "00"));

                String material = JOptionPane.showInputDialog(null, 
                "Ingrese el material del Zapato Casual " + (almacen + 1) + ":", 
                "MATERIAL");

                String categoria = JOptionPane.showInputDialog(null, 
                "Ingrese la categoría del Zapato Casual " + (almacen + 1) + ":", 
                "CATEGORÍA");

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

        /* int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantos zapatos casual desea ingresar?", "01"));

        int almacen = 0;

        for(int i = 0; i < count; i++){

            almacen ++;

            if (almacen >= casualArray.length) {
                JOptionPane.showMessageDialog(null,
                "El almacen de zapatos casuales está lleno. No se pueden agregar más productos.",
                "Almacen Lleno", 
                JOptionPane.WARNING_MESSAGE);
                break;
            }

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del Zapato Casual " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio del Zapato Casual " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color del Zapato Casual " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca del Zapato Casual " +  (i+1) + ":", "MARCA");

            double talla = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese la talla del Zapato Casual " +  (i+1) + ":", "00"));

            String material = JOptionPane.showInputDialog(null,"Ingrese el material del Zapato Casual " +  (i+1) + ":", "MATERIAL");

            String categoria = JOptionPane.showInputDialog(null,"Ingrese la categoria del Zapato Casual " +  (i+1) + ":", "CATEGORIA");

            Casual nuevoCasual = new Casual(nombre, precio, color, marca, talla, material, categoria);

            casualArray[i] = nuevoCasual; 

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos del Zapato Casual " + (i+1), "Confirmacion de datos", 1);
        } */
        
    }

    public static void eraseZapatoCasual(){

        int codeToErase = Integer.valueOf(
            JOptionPane.showInputDialog(
            "Ingrese el codigo del Zapato Casual a eliminar"));

        Casual zapatoErase = new Casual(codeToErase);

        for (int i = 0; i < casualArray.length; i++) {

            if (casualArray[i]!= null && casualArray[i].equals(zapatoErase)) {

                int confirmacion = JOptionPane.showConfirmDialog(
                    null, 
                    "¿Estás seguro de que deseas eliminar el siguiente Zapato Casual?\n" + 
                    casualArray[i].toString(), 
                    "Confirmar Eliminación", 
                    JOptionPane.YES_NO_OPTION
                );

                JOptionPane.showMessageDialog(
                    null, 
                    "Zapato Casual eliminado: \n " +
                    casualArray[i].toString(), 
                    "Eliminacion Existosa", 
                    JOptionPane.INFORMATION_MESSAGE
                );

                if(confirmacion == JOptionPane.NO_OPTION) {
                    return;
                }

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
            JOptionPane.WARNING_MESSAGE
        );

    }

    public static void findZapatoCasual(){

        /* int codigoFint = Integer.valueOf(JOptionPane.showInputDialog(
            "Ingrese el codigo del Producto", "000"));

        boolean fint = false;

        for (Casual casual : casualArray) {
            if(casual != null && casual.getCodigo() == codigoFint){
                JOptionPane.showMessageDialog(null, 
                "Zapato encontrado: \n" + casual.toString(), 
                "Búsqueda Exitosa", 1);

                //fint = true;
                return;
            }
        }

        if(!fint){
            JOptionPane.showMessageDialog(null, 
            "El zapato con código " + codigoFint + " no ha sido encontrado.", 
            "Búsqueda Fallida", 2);
        } */

        int codigoFind = Integer.valueOf(JOptionPane.showInputDialog(
                "Ingrese el código del Producto", 
                "000"));
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

    } 


    public static void printZapatoCasual(){

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

    }

    public static void editZapatoCasual(){

        Integer codeToEdit = Integer.valueOf(
            JOptionPane.showInputDialog(
            "Ingrese el codigo del Zapato Casual que va a cambiar"
            )
        );

        Casual zapatoFind = new Casual(codeToEdit);
    
        for (int i = 0; i < casualArray.length; i++) {
            if (casualArray[i]!= null && casualArray[i].equals(zapatoFind)) {

                int confirmacion = JOptionPane.showConfirmDialog(
                    null, 
                    "¿Estás seguro de que deseas editar el siguiente Zapato Casual?\n" + 
                    casualArray[i].toString(), 
                    "Confirmar Edición", 
                    JOptionPane.YES_NO_OPTION
                );

                if(confirmacion == JOptionPane.YES_OPTION){

                    String nombre = JOptionPane.showInputDialog(null, 
                    "Ingrese el nombre del Zapato Casual " + (i + 1) + ":",
                    "nombre");

                    double precio = Double.valueOf(JOptionPane.showInputDialog(null, 
                    "Ingrese el precio del Zapato Casual " + (i + 1) + ":", 
                    "00"));

                    String color = JOptionPane.showInputDialog(null, 
                    "Ingrese el color del Zapato Casual " + (i + 1) + ":", 
                    "COLOR");

                    String marca = JOptionPane.showInputDialog(null, 
                    "Ingrese la marca del Zapato Casual " + (i + 1) + ":", 
                    "MARCA");

                    double talla = Double.valueOf(JOptionPane.showInputDialog(null, 
                    "Ingrese la talla del Zapato Casual " + (i + 1) + ":", 
                    "00"));

                    String material = JOptionPane.showInputDialog(null, 
                    "Ingrese el material del Zapato Casual " + (i + 1) + ":", 
                    "MATERIAL");

                    String categoria = JOptionPane.showInputDialog(null, 
                    "Ingrese la categoría del Zapato Casual " + (i + 1) + ":", 
                    "CATEGORÍA");
        
                    Casual newCasual = new Casual(nombre, 
                    precio, color, marca, talla, material, categoria);

                    casualArray[i] = newCasual;
        
                    JOptionPane.showMessageDialog(null, 
                        "Zapato Casual actualizado: \n" + 
                        newCasual.toString(), 
                        "Actualizacion Exitosa", 
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    printZapatoCasual();

                    return;
                }

            }
        }
    
        JOptionPane.showMessageDialog(null, 
            "El Zapato Casual " + 
            codeToEdit + " no ha sido encontrada.", 
            "Búsqueda Fallida", 
            JOptionPane.WARNING_MESSAGE
        );

    }
    
}
