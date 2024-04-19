package main.Metodos.MenuMethodF.CamisaMethodF;


import javax.swing.JOptionPane;

import main.Clases.Products.CamisaF.El;
import main.Metodos.MenuMethodF.CamisaMethod;

public class ElMethod {

    static El [] elArray = new El[3];

    static int selectCamisa = 0;

    static int almacen = 0;
    
    public static void camisaEl(){
        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                Object[] options = {"Insertar", "Borrar", "Buscar", "Imprimir", "Editar", "Regresar"};

                selectCamisa = JOptionPane.showOptionDialog(null,
                        "Seleccione una opción:",
                        "Zapato Tenis Menu",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);

                switch(selectCamisa){
                    case 0:
                    inputCamisaEl();
                    break;

                    case 1:
                    break;

                    case 2:
                    findCamisaEl();
                    break;

                    case 3:
                    printCamisaEl();
                    break;
                    
                    case 4:
                    
                    break;

                    case 5:
                    CamisaMethod.camisa();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        }while(selectCamisa != 5);
    }

    public static void inputCamisaEl(){

        int count = Integer.valueOf(JOptionPane.showInputDialog(
            "Cuantas camisas para el desea ingresar?",
            "01"));

        for(int i = 0; i < count; i++){

            if (almacen >= elArray.length) {
                JOptionPane.showMessageDialog(null, 
                "El almacen de camisas para el está lleno. No se pueden agregar más productos.", 
                "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                String nombre = JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la Camisa para El " +  (almacen + 1) + ":", 
                "NOMBRE");

                double precio = Double.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese el precio de la Camisa para El " +  (almacen + 1) + ":", 
                "00"));

                String color = JOptionPane.showInputDialog(null,
                "Ingrese el color de la Camisa para El " +  (almacen + 1) + ":", 
                "COLOR");

                String marca = JOptionPane.showInputDialog(null,
                "Ingrese la marca de la Camisa para El " +  (almacen + 1) + ":", 
                "MARCA");

                String talla = JOptionPane.showInputDialog(null,
                "Ingrese la talla de la Camisa para El " +  (almacen + 1) + ":", 
                "TALLA");

                String tela = JOptionPane.showInputDialog(null,
                "Ingrese el material de la Camisa para El " +  (almacen + 1) + ":", 
                "MATERIAL");

                String tipo = JOptionPane.showInputDialog(null,
                "Ingrese la categoria de la Camisa para El " +  (almacen + 1) + ":", 
                "CORTE");

                El nuevoEl = new El(nombre, 
                precio, color, marca, talla, tela, tipo);

                elArray[almacen] = nuevoEl;

                JOptionPane.showMessageDialog(null, 
                "Camisa El " + (almacen + 1) + " :\n" +
                nuevoEl.toString(), 
                "Confirmacion de datos", JOptionPane.INFORMATION_MESSAGE);
            }

            almacen ++;
            
        }

    }

    public static void findCamisaEl(){

        int codigoFind = Integer.valueOf(JOptionPane.showInputDialog(
                "Ingrese el código del Producto", 
                "000"));
        El elFind = new El(codigoFind);

        for (El tenis : elArray) {
            if (tenis != null && tenis.equals(elFind)) {
                JOptionPane.showMessageDialog(null, 
                "Camisa encontrada: \n" + tenis.toString(), 
                "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, 
        "La Camisa para El con código " + codigoFind + " no ha sido encontrado.", 
        "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);

    } 

    public static void printCamisaEl(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Cammisas para El:\n");

        for(El el : elArray){
            if(el != null){
                sb.append(el.toString()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString(), 
        "Camisas El", JOptionPane.INFORMATION_MESSAGE);
    }
}
