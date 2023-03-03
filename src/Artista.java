
import java.util.ArrayList;

public class Artista extends Usuario{
    private String art_name;
    private ArrayList <Cancion> my_songs = new ArrayList();
    private ArrayList <Album> my_releases = new ArrayList();

    public Artista() {
    }

    public Artista(String art_name, String username, String password, int edad) {
        super(username, password);
        this.art_name = art_name;
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 18){
        this.edad = edad;
        }
    }
    
    

    public String getArt_name() {
        return art_name;
    }

    public void setArt_name(String art_name) {
        this.art_name = art_name;
    }

    public ArrayList<Cancion> getMy_songs() {
        return my_songs;
    }

    public void setMy_songs(ArrayList<Cancion> my_songs) {
        this.my_songs = my_songs;
    }

    public ArrayList<Album> getMy_releases() {
        return my_releases;
    }

    public void setMy_releases(ArrayList<Album> my_releases) {
        this.my_releases = my_releases;
    }

    @Override
    public String toString() {
        return super.toString() + " Nombre Artístico" + art_name + " Canciones: " + my_songs + " Albumes: " + my_releases;
    }
    
    
}
