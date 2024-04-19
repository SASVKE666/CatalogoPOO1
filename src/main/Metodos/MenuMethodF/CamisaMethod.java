package main.Metodos.MenuMethodF;

import javax.swing.JOptionPane;

import main.Metodos.MenuMethod;
import main.Metodos.MenuMethodF.CamisaMethodF.*;

public class CamisaMethod {

    public static int selectCamisa = 0;

    public static void camisa(){
        
        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                selectCamisa = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        1. El
                        2. Ella
                        3. Regresar
                        ""","Ingrese un numero"));

                switch(selectCamisa){
                    case 1:
                    ElMethod.camisaEl();
                    break;

                    case 2:
                    EllaMethod.camisaElla();
                    break;

                    case 3:
                    MenuMethod.menu();
                    return;
                        
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        }while(selectCamisa != 3);
    }

}
