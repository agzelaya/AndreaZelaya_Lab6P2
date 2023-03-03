
import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList<Cancion> liked_songs = new ArrayList();
    private ArrayList<Playlist> my_playlists = new ArrayList();
    private ArrayList<Playlist> liked_playlists = new ArrayList();

    public Cliente() {
    }

    public Cliente(String username, String password, int edad) {
        super(username, password);
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 12){
            this.edad = edad;
        }
    }
    
    public ArrayList<Cancion> getLiked_songs() {
        return liked_songs;
    }

    public void setLiked_songs(ArrayList<Cancion> liked_songs) {
        this.liked_songs = liked_songs;
    }

    public ArrayList<Playlist> getMy_playlists() {
        return my_playlists;
    }

    public void setMy_playlists(ArrayList<Playlist> my_playlists) {
        this.my_playlists = my_playlists;
    }

    public ArrayList<Playlist> getLiked_playlists() {
        return liked_playlists;
    }

    public void setLiked_playlists(ArrayList<Playlist> liked_playlists) {
        this.liked_playlists = liked_playlists;
    }

    @Override
    public String toString() {
        return super.toString() + " Canciones: " + liked_songs + " Mis playlists: " + my_playlists + " Liked playlists" + liked_playlists;
    }
    
    
}
