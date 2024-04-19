package main.Metodos.MenuMethodF.ZapatoMethodF;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.Clases.Products.ZapatoF.Casual;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class CasualMethod {

    static int selectZapato = 0;

    static ArrayList<Casual> casualArray = new ArrayList<>();

    public static void zapatoCasual(){
        do{
                //Try catch para evitar que el programa termine si hay un error
            try{
                selectZapato = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        1. Insertar
                        2. Borrar
                        3. Buscar
                        4. Imprimir
                        5. Editar
                        6. Salir
                        ""","Ingrese un numero"));

                switch(selectZapato){
                    case 1:
                    inputZapatoCasual();
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    printZapatoCasual();
                    break;
                    
                    case 5:
                    break;

                    case 6:
                    ZapatoMethod.zapato();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }

        }while(selectZapato != 6);
    }

    public static void inputZapatoCasual(){ 

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantos zapatos casual desea ingresar?"));

        for(int i = 0; i < count; i++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del Zapato Casual " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio del Zapato Casual " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color del Zapato Casual " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca del Zapato Casual " +  (i+1) + ":", "MARCA");

            double talla = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese la talla del Zapato Casual " +  (i+1) + ":", "00"));

            String material = JOptionPane.showInputDialog(null,"Ingrese el material del Zapato Casual " +  (i+1) + ":", "MATERIAL");

            String categoria = JOptionPane.showInputDialog(null,"Ingrese la categoria del Zapato Casual " +  (i+1) + ":", "CATEGORIA");

            Casual nuevoCasual = new Casual(nombre, precio, color, marca, talla, material, categoria);

            casualArray.add(nuevoCasual); 

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos del Zapato Casual " + (i+1), "Confirmacion de datos", 1);
        }
        
    }


    public static void printZapatoCasual(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Zapatos Casuales:\n");

        for (Casual casual : casualArray) {
            sb.append(casual.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Zapatos Casuales", 1);

    }
    
}
