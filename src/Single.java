
import java.util.Date;

public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
    }

    public Single(Cancion cancion, String title, String fecha) {
        super(title, fecha);
        this.cancion = cancion;
    }
    
    
    
    public Single(Cancion cancion, int likes) {
        this.cancion = cancion;
        this.likes = likes;
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
