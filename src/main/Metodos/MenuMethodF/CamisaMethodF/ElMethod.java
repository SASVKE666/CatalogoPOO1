package main.Metodos.MenuMethodF.CamisaMethodF;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.Clases.Products.CamisaF.El;
import main.Metodos.MenuMethodF.CamisaMethod;

public class ElMethod {

    static ArrayList<El> elArray = new ArrayList<>();

    static int selectCamisa = 0;
    
    public static void camisaEl(){
        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                selectCamisa = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        1. Insertar
                        2. Borrar
                        3. Buscar
                        4. Imprimir
                        5. Editar
                        6. Salir
                        ""","Ingrese un numero"));

                switch(selectCamisa){
                    case 1:
                    inputCamisaEl();
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    printCamisaEl();
                    break;
                    
                    case 5:
                    
                    break;

                    case 6:
                    CamisaMethod.camisa();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        }while(selectCamisa != 6);
    }

    public static void inputCamisaEl(){

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantas camisas para el desea ingresar?"));

        for(int i = 0; i < count; i++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Camisa para El " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio de la Camisa para El " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color de la Camisa para El " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca de la Camisa para El " +  (i+1) + ":", "MARCA");

            String talla = JOptionPane.showInputDialog(null,"Ingrese la talla de la Camisa para El " +  (i+1) + ":", "TALLA");

            String tela = JOptionPane.showInputDialog(null,"Ingrese el material de la Camisa para El " +  (i+1) + ":", "MATERIAL");

            String tipo = JOptionPane.showInputDialog(null,"Ingrese la categoria de la Camisa para El " +  (i+1) + ":", "CORTE");

            El nuevoEl = new El(nombre, precio, color, marca, talla, tela, tipo);

            elArray.add(nuevoEl); 

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos de la Camisa para El " + (i+1), "Confirmacion de datos", 1);
        }

    }

    public static void printCamisaEl(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Cammisas para El:\n");

        for(El el : elArray){
            sb.append(el.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Camisas El", 1);
    }
}
