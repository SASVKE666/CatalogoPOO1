package main.Metodos.MenuMethodF.CamisaMethodF;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.Clases.Products.CamisaF.Ella;
import main.Metodos.MenuMethodF.CamisaMethod;

public class EllaMethod {
    
    static ArrayList<Ella> ellaArray = new ArrayList<>();
    
    static int selectCamisa = 0;

    public static void camisaElla(){
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
                    inputCamisaElla();
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    printCamisaElla();
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

    public static void inputCamisaElla(){

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantas camisas para ella desea ingresar?"));

        for(int i = 0; i < count; i++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre de la Camisa para Ella " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio de la Camisa para Ella " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color de la Camisa para Ella " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca de la Camisa para Ella " +  (i+1) + ":", "MARCA");

            String talla = JOptionPane.showInputDialog(null,"Ingrese la talla de la Camisa para Ella " +  (i+1) + ":", "TALLA");

            String tela = JOptionPane.showInputDialog(null,"Ingrese el material de la Camisa para Ella " +  (i+1) + ":", "MATERIAL");

            String estilo = JOptionPane.showInputDialog(null,"Ingrese la categoria de la Camisa para Ella " +  (i+1) + ":", "ESTILO");

            Ella nuevoElla = new Ella(nombre, precio, color, marca, talla, tela, estilo);

            ellaArray.add(nuevoElla);

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos de la Camisa para Ella " + (i+1), "Confirmacion de datos", 1);
        }


    }

    public static void printCamisaElla(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Camisas para Ella:\n");

        for(Ella ella : ellaArray){
            sb.append(ella.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Camisas Ella", 1);

    }

}
