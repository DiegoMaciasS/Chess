
package Datos;

public class Peon extends Ficha{

    public Peon(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public boolean MovimientoValido(int x, int y) {
        //verifica si la ficha (según el color) se movió hacia el lugar correcto y la cantidad correcta
        char color=getColor();
        if((getColor()=='n'&& y-1==getY())||(getColor()=='b'&& y+1==getY())){
            if(Tablero.CasillaOcupada(x,y)!=0){return false;}
            else{return true;}
        }
        else if(((getColor()=='n'&&y==getY()+2)||(getColor()=='b'&&y==getY()-2))&&!isMovido()){
            if(Tablero.CasillaOcupada(x,y)!=0){
            if((getColor()=='n'&&Tablero.CasillaOcupada(x,y-1)==0)||(getColor()=='b'&&Tablero.CasillaOcupada(x,y+1)==0)){//verifica si la casilla anterior está ocupada
                return true;
            }
            else{
                return false;
            }}
            else{return false;}
        }
        else if((getX()==x+1||getX()==x-1)&&((getY()==y+1&&color=='n')||(getY()==y-1&&color=='b'))){
            return vercasilla(x,y);
        }
        else{
            return false;
        }
    }
    
}
