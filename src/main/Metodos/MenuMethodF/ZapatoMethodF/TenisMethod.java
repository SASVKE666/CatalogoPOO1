package main.Metodos.MenuMethodF.ZapatoMethodF;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.Clases.Products.ZapatoF.Tenis;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class TenisMethod {

    static int selectZapato = 0;

    static ArrayList<Tenis> tenisArray = new ArrayList<>();

    public static void zapatoTenis(){
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
                    inputZapatoTenis();
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    printZapatoTenis();
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

    public static void inputZapatoTenis(){

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantos zapatos tenis desea ingresar?"));

        for(int i = 0; i < count; i++){

            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del Zapato Tenis " +  (i+1) + ":", "NOMBRE");

            double precio = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el precio del Zapato Tenis " +  (i+1) + ":", "00"));

            String color = JOptionPane.showInputDialog(null,"Ingrese el color del Zapato Tenis " +  (i+1) + ":", "COLOR");

            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca del Zapato Tenis " +  (i+1) + ":", "MARCA");

            double talla = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese la talla del Zapato Tenis " +  (i+1) + ":", "00"));

            String material = JOptionPane.showInputDialog(null,"Ingrese el material del Zapato Tenis " +  (i+1) + ":", "MATERIAL");

            String deporte = JOptionPane.showInputDialog(null,"Ingrese el deporte del Zapato Tenis " +  (i+1) + ":", "DEPORTE");

            Tenis nuevoTenis = new Tenis(nombre, precio, color, marca, talla, material, deporte);

            tenisArray.add(nuevoTenis); 

            JOptionPane.showMessageDialog(null, "Se han ingresado correctamente los datos del Zapato Tenis " + (i+1), "Confirmacion de datos", 1);
        }

    }

    public static void printZapatoTenis(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Zapatos Tenis:\n");

        for (Tenis tenis : tenisArray) {
            sb.append(tenis.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Zapatos Tenis", 1);

    }

}
