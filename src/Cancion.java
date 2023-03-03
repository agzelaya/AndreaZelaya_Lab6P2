public class Cancion {
    private String title;
    private String duracion;
    private String album;

    public Cancion() {
    }

    public Cancion(String title, String duracion, String album) {
        this.title = title;
        this.duracion = duracion;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return " Titulo: " + title + " Duracion: " + duracion + " Album:" + album ;
    }
    
    
}
