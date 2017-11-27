package Datos;
import Datos.*;

public class Tablero {
    public static Ficha board[][]=new Ficha[8][8];
    public static Ficha muertas[][]=new Ficha[8][4];
    public Tablero() {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                
                switch(i){
                    case 0:
                        switch(j){
                            case 0:
                            this.board[j][i]=new Torre(j,i,'n');
                        break;
                            case 1:
                            this.board[j][i]=new Caballo(j,i,'n');
                        break;
                            case 2:
                            this.board[j][i]=new Alfil(j,i,'n');
                        break;
                            case 3:
                            this.board[j][i]=new Reina(j,i,'n');
                        break;
                            case 4:
                            this.board[j][i]=new Rey(j,i,'n');
                        break;
                            case 5:
                            this.board[j][i]=new Alfil(j,i,'n');
                        break;
                            case 6:
                            this.board[j][i]=new Caballo(j,i,'n');
                        break;
                            case 7:
                            this.board[j][i]=new Torre(j,i,'n');
                            break;
                        }
                        break;
                    case 1:
                        this.board[j][i]=new Peon(j,i,'n');
                        break;
                    case 6:System.out.println(i+","+j);
                        System.out.println(board[0][0].toString()+board[0][0].getColor());
                        this.board[j][i]=new Peon(i,j,'b');
                        System.out.println(board[0][0].toString()+board[0][0].getColor());
                        System.out.println(board[i][j].toString()+board[i][j].getColor());
                        break;
                    case 7:
                        switch(i){
                            case 0:
                            this.board[j][i]=new Torre(i,j,'b');
                        break;
                            case 1:
                            this.board[j][i]=new Caballo(i,j,'b');
                        break;
                            case 2:
                            this.board[j][i]=new Alfil(i,j,'b');
                        break;
                            case 3:
                            this.board[j][i]=new Reina(i,j,'b');
                        break;
                            case 4:
                            this.board[j][i]=new Rey(i,j,'b');
                        break;
                            case 5:
                            this.board[j][i]=new Alfil(i,j,'b');
                        break;
                            case 6:
                            this.board[j][i]=new Caballo(i,j,'b');
                        break;
                            case 7:
                            this.board[j][i]=new Torre(i,j,'b');
                            break;
                        }
                        break;
                    default:
                        this.board[i][j]=null;
                        break;
                }
                System.out.print(this.board[0][0].getColor());
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
