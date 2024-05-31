package main.Metodos;

import javax.swing.JOptionPane;

import main.Metodos.MenuMethodF.CamisaMethod;
import main.Metodos.MenuMethodF.PantalonMethod;
import main.Metodos.MenuMethodF.ZapatoMethod;
import main.Metodos.MenuMethodF.CamisaMethodF.ElMethod;
import main.Metodos.MenuMethodF.CamisaMethodF.EllaMethod;
import main.Metodos.MenuMethodF.PantalonMethodF.JeansMethod;
import main.Metodos.MenuMethodF.PantalonMethodF.OtrosMethod;
import main.Metodos.MenuMethodF.ZapatoMethodF.CasualMethod;
import main.Metodos.MenuMethodF.ZapatoMethodF.TenisMethod;

public class MenuMethod {
    
    static int selectMenu = 0;

    

    public static void menu(){
            //Try catch para evitar que el programa termine si hay un error
            do{
                try{

                    Object[] options = {"Zapato", "Camisa", "Pantalon", "Salir"};

                    selectMenu = JOptionPane.showOptionDialog(null,
                        "Seleccione una opción:",
                        "Menú",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);
                                            
                    switch(selectMenu){
                        case 0:
                        ZapatoMethod.zapato();
                        break;
    
                        case 1:
                        CamisaMethod.camisa();
                        break;
    
                        case 2:
                        PantalonMethod.pantalon();
                        break;
                        
                        case 3:
                        initializeMethods();
                        return;
                        
                    }
    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,
                    "Ups! Error!",
                    "ERROR MENU",JOptionPane.WARNING_MESSAGE);
                }
            }while(selectMenu != 3);
    }

    public static void initializeMethods(){
        EllaMethod.writeToFileElla();
        ElMethod.writeToFileEl();

        JeansMethod.writeToFileJeans();
        OtrosMethod.writeToFileOtros();

        CasualMethod.writeToFileCasual();
        TenisMethod.writeToFileTenis();
    }
}
