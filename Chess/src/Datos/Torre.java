package Datos;
import Datos.Tablero;

public class Torre extends Ficha {
    
    public Torre (int x, int y, char color) {
        super(x, y, color);
}
 @Override
    public boolean MovimientoValido(int x, int y) {
        //verificar si esta ocupada la casilla.
        if (x==getX()){
            int a = -1; 
            if (y>getY()){
            // Va a sumar.
            a = 1; 
            } 
            
            for (int b = getY()+a; b < y; b=b+a ){
            
            
            }
            
        }
        return true; //CAAAAAAAAAAMBIIIIIIAAAAARRRRRRRRRRKJIEFNBÑOBIUEF
    }
    
    @Override
    public String toString() {
        return "t";
    }
}
