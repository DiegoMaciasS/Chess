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
                        
                        this.board[j][i]=new Peon(j,i,'b');
                        break;
                    case 7:
                        switch(j){
                            case 0:
                            this.board[j][i]=new Torre(j,i,'b');
                        break;
                            case 1:
                            this.board[j][i]=new Caballo(j,i,'b');
                        break;
                            case 2:
                            this.board[j][i]=new Alfil(j,i,'b');
                        break;
                            case 3:
                            this.board[j][i]=new Reina(j,i,'b');
                        break;
                            case 4:
                            this.board[j][i]=new Rey(j,i,'b');
                        break;
                            case 5:
                            this.board[j][i]=new Alfil(j,i,'b');
                        break;
                            case 6:
                            this.board[j][i]=new Caballo(j,i,'b');
                        break;
                            case 7:
                            this.board[j][i]=new Torre(j,i,'b');
                            break;
                        }
                        break;
                    default:
                        this.board[j][i]=null;
                        break;
                }
                /*System.out.print(this.board[0][1].getColor());
                System.out.print(this.board[0][2].getColor());
                System.out.print(this.board[0][0].getColor());*/
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
        if(board[x][y].toString()== "t" && board[x][y].getColor()=='b'){
            if(muertas[0][3]!=null){
                board[x][y]=muertas[7][3];
            }
            else{
                board[x][y]=muertas[0][3];
            }
        }
        
        if(board[x][y].toString()== "c" && board[x][y].getColor()=='b'){
            if(muertas[1][3]!=null){
                board[x][y]=muertas[6][3];
            }
            else{
                board[x][y]=muertas[6][3];
            }
        }
        
        if(board[x][y].toString()== "a" && board[x][y].getColor()=='b'){
            if(muertas[2][3]!=null){
                board[x][y]=muertas[5][3];
            }
            else{
                board[x][y]=muertas[2][3];
            }
        }
        
        if(board[x][y].toString()== "q" && board[x][y].getColor()=='b'){
            board[x][y]=muertas[3][3];
            }
        
        
        if(board[x][y].toString()== "t" && board[x][y].getColor()=='n'){
            if(muertas[0][0]!=null){
                board[x][y]=muertas[7][0];
            }
            else{
                board[x][y]=muertas[0][0];
            }
        }
    
        if(board[x][y].toString()== "c" && board[x][y].getColor()=='n'){
            if(muertas[1][0]!=null){
                board[x][y]=muertas[6][0];
            }
            else{
                board[x][y]=muertas[1][0];
            }
        }
    
        if(board[x][y].toString()== "a" && board[x][y].getColor()=='n'){
            if(muertas[2][0]!=null){
                board[x][y]=muertas[5][0];
            }
            else{
                board[x][y]=muertas[2][0];
            }
        }
    
        if(board[x][y].toString()== "q" && board[x][y].getColor()=='n'){
            board[x][y]=muertas[3][0];
        }
        

        if(board[x][y].toString()== "p" && board[x][y].getColor()=='n'){
            for(int h=0;h<8;h++){
                if(muertas[h][1]!=null){
                }
                else{
                    board[x][y]=muertas[h][1];
                }
         if(board[x][y].toString()== "p" && board[x][y].getColor()=='b'){
            for(int z=0;z<8;z++){
                if(muertas[z][2]!=null){
                }
                else{
                    board[x][y]=muertas[z][2];
                }
            }
            }
        }
        }
    }
}
