package Datos;
import Datos.Tablero;

public class Reina extends Ficha{
    public Reina(int x, int y, char color) {
        super(x, y, color);
    }
    
     @Override
    public boolean MovimientoValido(int x, int y) {
        int mx,my;
        
        //verificar si se mueve correctamente
        /*si la cantidad de movimiento en x es igual a la cantidad de movimiento en y o no se movió en alguno de los dos ejes
        el movimiento es válido
        */
        if((x-getX()==y-getY())||(x-getX()==getY()-y)||(x-getX()==0)||(y-getY()==0)){
            
            //verificar cada hacia dónde se mueve la ficha
            if(x<getX()){mx=-1;}
            else if(x>getX()){mx=1;}
            else{mx=0;}
            if(y<getY()){my=-1;}
            else if(y>getY()){my=1;}
            else{my=0;}
            
            boolean salir=false;
            
            //verificar casillas intermedias vacías
            int vY=getY()+my;//posiciones en y
            for(int vX=getX()+mx;(vX!=x&&mx!=0)&&!salir;vX=vX+mx){//recorrer cada posicion en x
                if(Tablero.CasillaOcupada(vX,vY)!=0){//si está ocupada
                    return false;//movimiento no válido
                }
                vY+=my;
                if(mx==0&&vY==y){salir=true;}//si no se mueve en x y ya recorrió cada y, salga de la validación
            }
            
            //verificar si casilla de llegada ocupada
            if(Tablero.CasillaOcupada(x,y)==0){
                return true;
            }
            else if(Tablero.CasillaOcupada(x,y)==getColor()){//si la está ocupando el mismo equipo
                return false;//movimiento no válido
            }
            else{//de lo contrario (la está ocupando el enemigo)
                //matar ficha
                return true;//movimiento valido
            }
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "q";
    }
}
