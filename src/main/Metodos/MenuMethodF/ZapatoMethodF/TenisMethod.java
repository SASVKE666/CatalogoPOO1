package main.Metodos.MenuMethodF.ZapatoMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.ZapatoF.Tenis;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class TenisMethod {

    static int selectZapato = 0;

    static int almacen = 0;

    static Tenis[] tenisArray = new Tenis[3];

    public static void zapatoTenis(){
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
                    inputZapatoTenis();
                    break;

                    case 1:
                    break;

                    case 2:
                    findZapatoTenis();
                    break;

                    case 3:
                    printZapatoTenis();
                    break;
                    
                    case 4:
                    break;

                    case 5:
                    ZapatoMethod.zapato();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        }while(selectZapato != 5);
    }

    public static void inputZapatoTenis(){

        int count = Integer.valueOf(JOptionPane.showInputDialog(
            "¿Cuántos zapatos Tenis desea ingresar?", 
            "01"));

        for (int i = 0; i < count; i++) {
            
            if (almacen >= tenisArray.length) {
                JOptionPane.showMessageDialog(null, 
                "El almacen de está lleno. No se pueden agregar más productos.", 
                "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                return;

            } else { 

                String nombre = JOptionPane.showInputDialog(null, 
                "Ingrese el nombre del Zapato Tenis " + (almacen + 1) + ":", 
                "NOMBRE");

                double precio = Double.valueOf(JOptionPane.showInputDialog(null, 
                "Ingrese el precio del Zapato Tenis " + (almacen + 1) + ":", 
                "00"));

                String color = JOptionPane.showInputDialog(null, 
                "Ingrese el color del Zapato Tenis " + (almacen + 1) + ":", 
                "COLOR");

                String marca = JOptionPane.showInputDialog(null, 
                "Ingrese la marca del Zapato Tenis " + (almacen + 1) + ":", 
                "MARCA");

                double talla = Double.valueOf(JOptionPane.showInputDialog(null, 
                "Ingrese la talla del Zapato Tenis " + (almacen + 1) + ":", 
                "00"));

                String material = JOptionPane.showInputDialog(null, 
                "Ingrese el material del Zapato Tenis " + (almacen + 1) + ":", 
                "MATERIAL");

                String deporte = JOptionPane.showInputDialog(null, 
                "Ingrese el deporte del Zapato Tenis " + (almacen + 1) + ":", 
                "DEPORTE");

                Tenis nuevoTenis = new Tenis(nombre, 
                precio, color, marca, talla, material, deporte);

                tenisArray[almacen] = nuevoTenis;

                JOptionPane.showMessageDialog(null, 
                "Zapato Tenis " + (almacen + 1) + " :\n" + 
                nuevoTenis.toString(),
                "Confirmación de datos", JOptionPane.INFORMATION_MESSAGE);
            } 

            almacen++;
        }

    }

    public static void findZapatoTenis(){

        int codigoFind = Integer.valueOf(JOptionPane.showInputDialog(
                "Ingrese el código del Producto", 
                "000"));
        Tenis tenisFind = new Tenis(codigoFind);

        for (Tenis tenis : tenisArray) {
            if (tenis != null && tenis.equals(tenisFind)) {
                JOptionPane.showMessageDialog(null, 
                "Zapato encontrado: \n" + tenis.toString(), 
                "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, 
        "El zapato Tenis con código " + codigoFind + " no ha sido encontrado.", 
        "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);

    } 

    public static void printZapatoTenis(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Zapatos Tenis:\n");

        for (Tenis tenis : tenisArray) {
            if(tenis != null){
                sb.append(tenis.toString()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, 
        sb.toString(), "Zapatos Tenis", JOptionPane.INFORMATION_MESSAGE);

    }

}
