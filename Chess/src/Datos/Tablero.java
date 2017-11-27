package Datos;
import Datos.Peon;

public class Tablero {
    public static Ficha board[][]=new Ficha[8][8];
    public static Ficha muertas[][]=new Ficha[8][4];
    public Tablero() {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                switch(i){
                    case 1:
                        break;
                    case 2:
                        this.board[i][j]=new Peon(i,j,'n');
                        break;
                    case 7:
                        this.board[i][j]=new Peon(i,j,'b');
                        break;
                    case 8:
                        break;
                    default:
                        this.board[i][j]=null;
                        break;
                }
            }
        }
    }
    
    public static char CasillaOcupada(int x, int y){
        if(board[x][y]!=null){
            return board[x][y].getColor();
        }
        else{
            return '0';
        }
    }
    
    public static void Matar(int x, int y){
        //metodo para matar ficha
    }
    
}
