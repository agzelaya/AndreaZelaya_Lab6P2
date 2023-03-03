
import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento{
    private ArrayList <Cancion> canciones = new ArrayList();
    private int cant_canciones = canciones.size();

    public Album() {
    }

    public Album(String title, Date fecha, int likes) {
        super(title, fecha, likes);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCant_canciones() {
        return cant_canciones;
    }

    public void setCant_canciones(int cant_canciones) {
        this.cant_canciones = cant_canciones;
    }

    @Override
    public String toString() {
        return super.toString() + " Canciones: " + canciones + " Cantidad de canciones: " + cant_canciones;
    }
    
    
}
