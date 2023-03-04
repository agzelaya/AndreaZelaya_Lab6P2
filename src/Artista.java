
import java.util.ArrayList;

public class Artista extends Usuario{
    private String art_name;
    private ArrayList <Lanzamiento> my_releases = new ArrayList();

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


    public ArrayList<Lanzamiento> getMy_releases() {
        return my_releases;
    }

    public void setMy_releases(ArrayList<Lanzamiento> my_releases) {
        this.my_releases = my_releases;
    }

    @Override
    public String toString() {
        return super.toString() + " Nombre Artístico" + art_name + " Lanzamientos: " + my_releases;
    }
    
    
}
