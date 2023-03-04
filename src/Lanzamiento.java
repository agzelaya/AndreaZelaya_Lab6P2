
import java.util.Date;

public class Lanzamiento {
    private String title;
    private String fecha;
    protected int likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String title, String fecha) {
        this.title = title;
        this.fecha = fecha;
    }
    
    

    public Lanzamiento(String title, String fecha, int likes) {
        this.title = title;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Titulo: " + title + " Fecha: " + fecha + " Likes: " + likes;
    }
    
    
}
