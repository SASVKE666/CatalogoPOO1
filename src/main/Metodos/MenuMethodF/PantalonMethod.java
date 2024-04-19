package main.Metodos.MenuMethodF;

import javax.swing.JOptionPane;

import main.Metodos.MenuMethod;
import main.Metodos.MenuMethodF.PantalonMethodF.JeansMethod;
import main.Metodos.MenuMethodF.PantalonMethodF.OtrosMethod;

public class PantalonMethod {

    public static int selectPantalon = 0;

    public static void pantalon(){
        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                selectPantalon = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        1. Jeans
                        2. Otros
                        3. Regresar
                        ""","Ingrese un numero"));

            }catch(Exception e){
                selectPantalon = 0;
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
            
            switch(selectPantalon){
                case 1:
                JeansMethod.pantalonJeans();
                break;

                case 2:
                OtrosMethod.pantalonOtros();
                break;

                case 3:
                MenuMethod.menu();
                return;
                    
            }
        }while(selectPantalon != 3);
    }

}
