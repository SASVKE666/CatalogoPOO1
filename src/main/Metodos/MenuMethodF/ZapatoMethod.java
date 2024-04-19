package main.Metodos.MenuMethodF;

import javax.swing.JOptionPane;

import main.Metodos.MenuMethod;
import main.Metodos.MenuMethodF.ZapatoMethodF.CasualMethod;
import main.Metodos.MenuMethodF.ZapatoMethodF.TenisMethod;

public class ZapatoMethod{
    
    public static int selectZapato = 0;

    public static void zapato(){

        do{
            //Try catch para evitar que el programa termine si hay un error
            try{
                selectZapato = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        1. Casual
                        2. Tenis
                        3. Regresar
                        ""","Ingrese un numero"));

                switch(selectZapato){
                    case 1:
                    CasualMethod.zapatoCasual();
                    break;
                        
                    case 2:
                    TenisMethod.zapatoTenis();
                    break;

                    case 6:
                    MenuMethod.menu();
                    return;
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ups! Error!");
            }
        }while(selectZapato != 3);
    }

    public static int getSelectZapato() {
        return selectZapato;
    }

    public static void setSelectZapato(int select) {
        ZapatoMethod.selectZapato = select;
    }

}
