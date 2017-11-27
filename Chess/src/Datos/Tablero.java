package Datos;
import Datos.Peon;

public class Tablero {
    public static Ficha board[][]=new Ficha[8][8];
    public static Ficha muertas[][]=new Ficha[8][4];
    public Tablero() {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                switch(i){
                    case 0:
                        if(j==0){
                            this.board[i][j]=new Torre(i,j'n');
                        }
                        else if(j==1){
                            this.board[i][j]=new Caballo(i,j'n');
                        }
                        else if(j==2){
                            this.board[i][j]=new Alfil(i,j'n');
                        }
                        else if(j==3){
                            this.board[i][j]=new Reina(i,j'n');
                        }
                        else if(j==4){
                            this.board[i][j]=new Rey(i,j'n');
                        }
                        else if(j==5){
                            this.board[i][j]=new Alfil(i,j'n');
                        }
                        else if(j==6){
                            this.board[i][j]=new Caballo(i,j'n');
                        }
                        else if(j==7){
                            this.board[i][j]=new Torre(i,j'n');
                        }
                        else break;
                    case 1:
                        this.board[i][j]=new Peon(i,j,'n');
                        break;
                    case 6:
                        this.board[i][j]=new Peon(i,j,'b');
                        break;
                    case 7:
                         if(j==0){
                            this.board[i][j]=new Torre(i,j'b');
                        }
                        else if(j==1){
                            this.board[i][j]=new Caballo(i,j'b');
                        }
                        else if(j==2){
                            this.board[i][j]=new Alfil(i,j'b');
                        }
                        else if(j==3){
                            this.board[i][j]=new Reina(i,j'b');
                        }
                        else if(j==4){
                            this.board[i][j]=new Rey(i,j'b');
                        }
                        else if(j==5){
                            this.board[i][j]=new Alfil(i,j'b');
                        }
                        else if(j==6){
                            this.board[i][j]=new Caballo(i,j'b');
                        }
                        else if(j==7){
                            this.board[i][j]=new Torre(i,j'b');
                        }
                        else break;
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

    public static Ficha[][] getBoard() {
        return board;
    }

    public static void setBoard(Ficha[][] board) {
        Tablero.board = board;
    }

    public static Ficha[][] getMuertas() {
        return muertas;
    }

    public static void setMuertas(Ficha[][] muertas) {
        Tablero.muertas = muertas;
    }
    
    
    
    public static void Matar(int x, int y){
        //metodo para matar ficha
    }
    
}
