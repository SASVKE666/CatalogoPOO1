package main.Metodos;

import javax.swing.JOptionPane;

import main.Metodos.MenuMethodF.CamisaMethod;
import main.Metodos.MenuMethodF.PantalonMethod;
import main.Metodos.MenuMethodF.ZapatoMethod;

public class MenuMethod {
    
    static int selectMenu = 0;

    public static void menu(){
            //Try catch para evitar que el programa termine si hay un error
            do{
                try{
                    selectMenu = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                            1. Zapato
                            2. Camisa
                            3. Pantalon
                            4. Salir
                            ""","Ingrese un numero"));
                                            
                    switch(selectMenu){
                        case 1:
                        ZapatoMethod.zapato();
                        break;
    
                        case 2:
                        CamisaMethod.camisa();
                        break;
    
                        case 3:
                        PantalonMethod.pantalon();
                        break;
                        
                        case 4:
                        //JOptionPane.showMessageDialog(null, "Bye Bye", "Adios", 2);
                        return;
                        
                    }
    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Ups! Error!","ERROR",0);
                }
            }while(selectMenu != 4);
    }
}
