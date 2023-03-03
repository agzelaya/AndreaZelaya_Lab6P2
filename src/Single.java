
import java.util.Date;

public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
    }

    public Single(String title, String fecha, int likes) {
        super(title, fecha, likes);
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString() + " Cancion: " + cancion;
    }
    
    
}
