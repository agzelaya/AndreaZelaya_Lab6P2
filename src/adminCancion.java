
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class adminCancion {

    public ArrayList<Cancion> canciones = new ArrayList();
    public File archivo = null;

    public adminCancion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);

            for (Cancion c : canciones) {
                bw.write(c.getTitle() + "|");
                bw.write(c.getDuracion() + "|");
                bw.write(c.getAlbum() + "|");
                bw.write("\n");

            }

            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }

    public void leerArchivo() {

        canciones = new ArrayList();

        if (archivo.exists()) {
            try {
                Scanner sc = new Scanner(archivo);

                while (sc.hasNextLine()) {
                    String[] array = sc.nextLine().split("\\|");

                    Cancion c = new Cancion();
                    c.setTitle(array[0]);
                    c.setDuracion(array[1]);
                    c.setAlbum(array[2]);

                    canciones.add(c);

                }
                System.out.println(canciones);

                sc.close();
            } catch (Exception e) {
            }

        } else {
            System.out.println("no existe");
        }
    }

}
