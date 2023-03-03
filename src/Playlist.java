
import java.util.ArrayList;

public class Playlist {
    private String title;
    private int likes;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Playlist() {
    }

    public Playlist(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Titulo: " + title + " Likes: " + likes + " Canciones: " + canciones;
    }
    
    
    
}
