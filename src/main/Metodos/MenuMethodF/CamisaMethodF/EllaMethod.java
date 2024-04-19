package main.Metodos.MenuMethodF.CamisaMethodF;

import javax.swing.JOptionPane;

import main.Clases.Products.CamisaF.Ella;
import main.Metodos.MenuMethodF.CamisaMethod;

public class EllaMethod {
    
    static Ella[] ellaArray = new Ella[3];
    
    static int selectCamisa = 0;

    static int almacen = 0;

    public static void camisaElla(){
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
                    inputCamisaElla();
                    break;

                    case 1:
                    break;

                    case 2:
                    findCamisaElla();
                    break;

                    case 3:
                    printCamisaElla();
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

    public static void inputCamisaElla(){

        int count = Integer.valueOf(JOptionPane.showInputDialog(
            "Cuantas camisas para ella desea ingresar?", 
            "01"));

        for(int i = 0; i < count; i++){

            if (almacen >= ellaArray.length) {
                JOptionPane.showMessageDialog(null, 
                "El almacen está lleno. No se pueden agregar más productos.", 
                "Almacen Lleno", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                String nombre = JOptionPane.showInputDialog(null,
                "Ingrese el nombre de la Camisa para Ella " +  (almacen + 1) + ":", 
                "NOMBRE");

                double precio = Double.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese el precio de la Camisa para Ella " +  (almacen + 1) + ":", 
                "00"));

                String color = JOptionPane.showInputDialog(null,
                "Ingrese el color de la Camisa para Ella " +  (almacen + 1) + ":", 
                "COLOR");

                String marca = JOptionPane.showInputDialog(null,
                "Ingrese la marca de la Camisa para Ella " +  (almacen + 1) + ":", 
                "MARCA");

                String talla = JOptionPane.showInputDialog(null,
                "Ingrese la talla de la Camisa para Ella " +  (almacen + 1) + ":", 
                "TALLA");

                String tela = JOptionPane.showInputDialog(null,
                "Ingrese el material de la Camisa para Ella " +  (almacen + 1) + ":", 
                "MATERIAL");

                String estilo = JOptionPane.showInputDialog(null,
                "Ingrese la categoria de la Camisa para Ella " +  (almacen + 1) + ":", 
                "ESTILO");

                Ella nuevoElla = new Ella(nombre, 
                precio, color, marca, talla, tela, estilo);

                ellaArray[almacen] = nuevoElla;

                JOptionPane.showMessageDialog(null, 
                "Camisa Ella " + (almacen + 1) + " :\n" +
                nuevoElla.toString(), 
                "Confirmacion de datos", JOptionPane.INFORMATION_MESSAGE);
            }

            almacen ++;
 
        }


    }

    public static void findCamisaElla(){

        int codigoFind = Integer.valueOf(JOptionPane.showInputDialog(
                "Ingrese el código del Producto", 
                "000"));
        Ella ellaFind = new Ella(codigoFind);

        for (Ella ella : ellaArray) {
            if (ella != null && ella.equals(ellaFind)) {
                JOptionPane.showMessageDialog(null, 
                "Camisa encontrada: \n" + ella.toString(), 
                "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, 
        "La camisa para Ella con código " + codigoFind + " no ha sido encontrado.", 
        "Búsqueda Fallida", JOptionPane.WARNING_MESSAGE);

    } 

    public static void printCamisaElla(){

        StringBuilder sb = new StringBuilder();

        sb.append("Lista de Camisas para Ella:\n");

        for(Ella ella : ellaArray){
            if(ella != null){
                sb.append(ella.toString()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, 
        sb.toString(), "Camisas Ella", 1);

    }

}
