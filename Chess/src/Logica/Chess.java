package Logica;

import UI.Juego;
import UI.MenuPrincipal;
import Datos.Ficha;
import Datos.Tablero;

public class Chess {
    public static String jB,jN;
    public static String tjb,tjn;
    
    
    public static void main(String[] args) {
        MenuPrincipal.mainMenu();//inicio del programa
    }
    
    public static void inicio(String JB,String JN){//inicia el juego
        Tablero board=new Tablero();
        jB=JB;
        jN=JN;
        tjb="00:00:00:00";
        tjn="00:00:00:00";
        Juego.Juego(jB,jN,board);
    }
      
    
}
