package main.Metodos.MenuMethodF.PantalonMethodF;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.Clases.Products.PantalonF.Otros;
import main.Metodos.MenuMethodF.PantalonMethod;

public class OtrosMethod {

    static int selectPantalon = 0;

    static ArrayList<Otros> otrosArray = new ArrayList<>();

    public static void pantalonOtros(){
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
                    inputPantalonOtros();
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    printPantalonOtros();
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

    public static void inputPantalonOtros(){

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantos pantalones otros desea ingresar?"));

        for(int i = 0; i < count; i++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del Pantalon Otros " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio del Pantalon Otros " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color del Pantalon Otros " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca del Pantalon Otros " +  (i+1) + ":", "MARCA");

            int talla = Integer.valueOf(JOptionPane.showInputDialog(null,"Ingrese la talla del Pantalon Otros " +  (i+1) + ":", "00"));

            String tela = JOptionPane.showInputDialog(null,"Ingrese el material del Pantalon Otros " +  (i+1) + ":", "MATERIAL");

            String estilo = JOptionPane.showInputDialog(null,"Ingrese la categoria del Pantalon Otros " +  (i+1) + ":", "ESTILO");

            Otros nuevoOtros = new Otros(nombre, precio, color, marca, talla, tela, estilo);

            otrosArray.add(nuevoOtros); 

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos del Pantalon Otros " + (i+1), "Confirmacion de datos", 1);
        }
    }

    public static void printPantalonOtros(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Pantalos Otros:\n");

        for (Otros otros : otrosArray) {
            sb.append(otros.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Pantalos Otros", 1);

    }
    
}
