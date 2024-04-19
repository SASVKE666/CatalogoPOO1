package main.Metodos.MenuMethodF.PantalonMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.PantalonF.Jeans;
import main.Metodos.MenuMethodF.PantalonMethod;

public class JeansMethod {

    static int selectPantalon = 0;

    static Jeans[] jeansArray = new Jeans[3];

    static int almacen = 0;
    

    public static void pantalonJeans(){
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
                    inputPantalonJeans();
                    break;

                    case 1:
                    break;

                    case 2:
                    findPantalonJeans();
                    break;

                    case 3:
                    printPantalonJeans();
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

    public static void inputPantalonJeans(){

        int count = Integer.valueOf(JOptionPane.showInputDialog(
            "Cuantos pantalones jeans desea ingresar?",
            "01"));

        for(int i = 0; i < count; i++){

            if (almacen >= jeansArray.length) {
                JOptionPane.showMessageDialog(null, 
                "El almacen de está lleno. No se pueden agregar más productos.", 
                "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                String nombre = JOptionPane.showInputDialog(null,
                "Ingrese el nombre del Pantalon Jean " +  (almacen + 1) + ":", 
                "NOMBRE");

                double precio = Double.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese el precio del Pantalon Jean " +  (almacen + 1) + ":", 
                "00"));

                String color = JOptionPane.showInputDialog(null,
                "Ingrese el color del Pantalon Jean " +  (almacen + 1) + ":", 
                "COLOR");

                String marca = JOptionPane.showInputDialog(null,
                "Ingrese la marca del Pantalon Jean " +  (almacen + 1) + ":", 
                "MARCA");

                int talla = Integer.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese la talla del Pantalon Jean " +  (almacen + 1) + ":", 
                "00"));

                String tela = JOptionPane.showInputDialog(null,
                "Ingrese el material del Pantalon Jean " +  (almacen + 1) + ":", 
                "MATERIAL");

                String corte = JOptionPane.showInputDialog(null,
                "Ingrese la categoria del Pantalon Jean " +  (almacen + 1) + ":", 
                "CORTE");

                Jeans nuevoJeans = new Jeans(nombre, 
                precio, color, marca, talla, tela, corte);

                jeansArray[almacen] = nuevoJeans;

                JOptionPane.showMessageDialog(null, 
                "Pantalon Jeans " + (almacen + 1), 
                "Confirmacion de datos", JOptionPane.INFORMATION_MESSAGE);
            }

            almacen ++;
            
        }
    }

    public static void findPantalonJeans(){

        int codigoFind = Integer.valueOf(JOptionPane.showInputDialog(
                "Ingrese el código del Producto", 
                "000"));
        Jeans jeansFind = new Jeans(codigoFind);

        for (Jeans jeans : jeansArray) {
            if (jeans != null && jeans.equals(jeansFind)) {
                JOptionPane.showMessageDialog(null, 
                "Pantalon encontrado: \n" + jeans.toString(), 
                "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, 
        "El pantalon Jeans con código " + codigoFind + " no ha sido encontrado.", 
        "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);

    } 

    public static void printPantalonJeans(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Pantalones Jeans:\n");

        for (Jeans jeans : jeansArray) {
            if(jeans != null){
                sb.append(jeans.toString()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString(), 
        "Pantalones Jeans", JOptionPane.INFORMATION_MESSAGE);
    }


    
}
