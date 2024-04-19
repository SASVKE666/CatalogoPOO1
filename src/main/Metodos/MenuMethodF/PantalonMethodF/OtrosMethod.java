package main.Metodos.MenuMethodF.PantalonMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.PantalonF.Otros;
import main.Metodos.MenuMethodF.PantalonMethod;

public class OtrosMethod {

    static int selectPantalon = 0;

    static Otros[] otrosArray = new Otros[3];

    static int almacen = 0;

    public static void pantalonOtros(){
        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                Object[] options = {"Insertar", "Borrar", "Buscar", "Imprimir", "Editar", "Regresar"};

                selectPantalon = JOptionPane.showOptionDialog(null,
                        "Seleccione una opción:",
                        "Zapato Tenis Menu",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);

                switch(selectPantalon){
                    case 0:
                    inputPantalonOtros();
                    break;

                    case 1:
                    break;

                    case 2:
                    findPantalonOtros();
                    break;

                    case 3:
                    printPantalonOtros();
                    break;
                    
                    case 4:
                    
                    break;

                    case 5:
                    PantalonMethod.pantalon();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        } while(selectPantalon != 5);
    }

    public static void inputPantalonOtros(){

        int count = Integer.valueOf(JOptionPane.showInputDialog(
            "Cuantos pantalones otros desea ingresar?",
            "01"));

        for(int i = 0; i < count; i++){

            if (almacen >= otrosArray.length) {
                JOptionPane.showMessageDialog(null, 
                "El almacen de está lleno. No se pueden agregar más productos.", 
                "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                String nombre = JOptionPane.showInputDialog(null,
                "Ingrese el nombre del Pantalon Otros " +  (almacen + 1) + ":", 
                "NOMBRE");

                double precio = Double.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese el precio del Pantalon Otros " +  (almacen + 1) + ":", 
                "00"));

                String color = JOptionPane.showInputDialog(null,
                "Ingrese el color del Pantalon Otros " +  (almacen + 1) + ":", 
                "COLOR");

                String marca = JOptionPane.showInputDialog(null,
                "Ingrese la marca del Pantalon Otros " +  (almacen + 1) + ":", 
                "MARCA");

                int talla = Integer.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese la talla del Pantalon Otros " +  (almacen + 1) + ":", 
                "00"));

                String tela = JOptionPane.showInputDialog(null,
                "Ingrese el material del Pantalon Otros " +  (almacen + 1) + ":", 
                "MATERIAL");

                String estilo = JOptionPane.showInputDialog(null,
                "Ingrese la categoria del Pantalon Otros " +  (almacen + 1) + ":", 
                "ESTILO");

                Otros nuevoOtros = new Otros(nombre, 
                precio, color, marca, talla, tela, estilo);

                otrosArray[almacen] = nuevoOtros; 

                JOptionPane.showMessageDialog(null, 
                "Se han ingresado correctamente los datos del Pantalon Otros " + (i+1), 
                "Confirmacion de datos", 1);
            }

            almacen ++;
        }
    }

    public static void findPantalonOtros(){

        int codigoFind = Integer.valueOf(JOptionPane.showInputDialog(
                "Ingrese el código del Producto", 
                "000"));
        Otros otrosFind = new Otros(codigoFind);

        for (Otros otros : otrosArray) {
            if (otros != null && otros.equals(otrosFind)) {
                JOptionPane.showMessageDialog(null, 
                "Pantalon encontrado: \n" + otros.toString(), 
                "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, 
        "El pantalon Otros con código " + codigoFind + " no ha sido encontrado.", 
        "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);

    } 

    public static void printPantalonOtros(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Pantalos Otros:\n");

        for (Otros otros : otrosArray) {
            if(otros != null){
                sb.append(otros.toString()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString(), 
        "Pantalos Otros", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
