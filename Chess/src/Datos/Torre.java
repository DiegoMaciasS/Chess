package Datos;
import Datos.Tablero;

public class Torre extends Ficha {
    
    public Torre (int x, int y, char color) {
        super(x, y, color);
}
 @Override
    public boolean MovimientoValido(int x, int y) {
        //verificar si esta ocupada la casilla.
        int mx,my; 
        if ((x-getX()==0)||(y-getY()==0)){
        
       if(x<getX()){mx=-1;}
            else if(x>getX()){mx=1;}
            else{mx=0;}
            if(y<getY()){my=-1;}
            else if(y>getY()){my=1;}
            else{my=0;}
            boolean salir=false;
            int vY=getY()+my ;
           for(int vX=getX()+mx;(vX!=x&&mx!=0)||(vY!=y&&my!=0);vX=vX+mx){//recorrer cada posicion en x
                if(Tablero.CasillaOcupada(vX,vY)!=0){//si está ocupada
                    return false;//movimiento no válido
                }
            vY=vY+my;
            }
          return  vercasilla(x,y);
        }
        else{
                return false;
                }
        
    }
    
    @Override
    public String toString() {
        return "t";
    }
}

