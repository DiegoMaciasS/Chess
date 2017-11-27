
package Datos;

public abstract class Ficha {
    private static int x,y;
    private char color;
    private static boolean movido;

    public Ficha(int x, int y, char color) {
        setX (x);
        setY (y);
        setColor (color);
        setMovido (false);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public boolean isMovido() {
        return movido;
    }

    public void setMovido(boolean movido) {
        this.movido = movido;
    }
    
    public abstract boolean MovimientoValido(int x,int y);
    
    public boolean vercasilla(int x, int y){
        switch(Tablero.CasillaOcupada(x,y)){//verifica si la casilla está ocupada y quién la ocupa
            case '0': return true;
            case 'n':
                if(getColor()=='n')
                    return false;
                else
                    Tablero.Matar(x, y);
                    return true;
            case 'b':
                if(getColor()=='b')
                    return false;
                else
                    Tablero.Matar(x, y);
                    return true;
            default:
                return false;
        }
    }
    
    @Override
    public String toString() {
        return "";
    }
}
