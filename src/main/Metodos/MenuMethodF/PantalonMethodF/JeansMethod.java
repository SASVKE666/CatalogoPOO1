package main.Metodos.MenuMethodF.PantalonMethodF;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.Clases.Products.PantalonF.Jeans;
import main.Metodos.MenuMethodF.PantalonMethod;

public class JeansMethod {

    static int selectPantalon = 0;

    static ArrayList<Jeans> jeansArray = new ArrayList<>();
    

    public static void pantalonJeans(){
        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                selectPantalon = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        1. Insertar
                        2. Borrar
                        3. Buscar
                        4. Imprimir
                        5. Editar
                        6. Salir
                        ""","Ingrese un numero"));

                switch(selectPantalon){
                    case 1:
                    inputPantalonJeans();
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    printPantalonJeans();
                    break;
                    
                    case 5:
                    
                    break;

                    case 6:
                    PantalonMethod.pantalon();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        } while(selectPantalon != 6);
    }

    public static void inputPantalonJeans(){

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantos pantalones jeans desea ingresar?"));

        for(int i = 0; i < count; i++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del Pantalon Jean " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio del Pantalon Jean " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color del Pantalon Jean " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca del Pantalon Jean " +  (i+1) + ":", "MARCA");

            int talla = Integer.valueOf(JOptionPane.showInputDialog(null,"Ingrese la talla del Pantalon Jean " +  (i+1) + ":", "00"));

            String tela = JOptionPane.showInputDialog(null,"Ingrese el material del Pantalon Jean " +  (i+1) + ":", "MATERIAL");

            String corte = JOptionPane.showInputDialog(null,"Ingrese la categoria del Pantalon Jean " +  (i+1) + ":", "CORTE");

            Jeans nuevoJeans = new Jeans(nombre, precio, color, marca, talla, tela, corte);

            jeansArray.add(nuevoJeans); 

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos del Pantalon Jean " + (i+1), "Confirmacion de datos", 1);
        }
    }

    public static void printPantalonJeans(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Pantalones Jeans:\n");

        for (Jeans jeans : jeansArray) {
            sb.append(jeans.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Pantalones Jeans", 1);
    }


    
}
