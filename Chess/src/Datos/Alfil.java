package Datos;

public class Alfil extends Ficha{

    public Alfil(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public boolean MovimientoValido(int x, int y) {
        
        //si el movimiento en X es igual a el movimiento en Y o viceversa. 
        if(!((x-getX()==y-getY())||(y-getY()==getX()-x))){
            return false;
        }
        else{
            //verificar si se mueve correctamente
            /*si la cantidad de movimiento en x es igual a la cantidad de movimiento en y el movimiento es válido
            */
            int mx,my;

            if((x-getX()==y-getY())||(x-getX()==getY()-y)||(x-getX()==0)||(y-getY()==0)){

                //verificar cada hacia dónde se mueve la ficha
                if(x<getX()){mx=-1;}
                else {mx=1;}

                if(y<getY()){my=-1;}
                else {my=1;}


                //verificar casillas intermedias vacías
                int vY=getY()+my;//posiciones en y
                for(int vX=getX()+mx;vX!=x;vX=vX+mx){//recorrer cada posicion en x
                    if(Tablero.CasillaOcupada(vX,vY)!=0){//si está ocupada
                        return false;//movimiento no válido
                    }
                    vY+=my;

                }

                //verificar si casilla de llegada no ocupada
                return vercasilla(x,y);
            }
            else{
                return false;
            }
        }
    
    }
    
}
