package main.Metodos.MenuMethodF.ZapatoMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.ZapatoF.Casual;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class CasualMethod {

    static int selectZapato = 0;

    static Casual[] casualArray = new Casual[10];

    //static ArrayList<Casual> casualArray = new ArrayList<>();

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
                    break;

                    case 2:
                    findZapatoCasual();
                    break;

                    case 3:
                    printZapatoCasual();
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

    public static void inputZapatoCasual(){ 

        int count = Integer.valueOf(JOptionPane.showInputDialog("Cuantos zapatos casual desea ingresar?", "01"));

        for(int i = 0; i < count; i++){

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

    public static void findZapatoCasual(){

        int codigoFint = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el codigo del Producto", "000"));

        boolean fint = false;

         for (Casual casual : casualArray) {
            if(casual != null && casual.getCodigo() == codigoFint){
                JOptionPane.showMessageDialog(null, "Zapato encontrado: \n" + casual.toString(), "Búsqueda Exitosa", 1);
                fint = true;
                break;
            }
        }

        if(!fint){
            JOptionPane.showMessageDialog(null, "El zapato con código " + codigoFint + " no ha sido encontrado.", "Búsqueda Fallida", 2);
        }

    } 
    
}
