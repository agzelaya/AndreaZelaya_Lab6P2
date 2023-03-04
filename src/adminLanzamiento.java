
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class adminLanzamiento {
    
    public ArrayList<Lanzamiento> lanzamientos = new ArrayList();
    public File archivo = null;
    
    public adminLanzamiento(String path) {
        archivo = new File(path);
    }

    public ArrayList<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamiento(ArrayList<Lanzamiento> canciones) {
        this.lanzamientos = canciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);

            for (Lanzamiento l : lanzamientos) {
                bw.write(l.getTitle() + "|");
                bw.write(l.getFecha()+ "|");
                bw.write(l.getLikes()+ "|");
                if(l instanceof Single){
                    bw.write("Single");
                }else{
                    bw.write("Album");
                }
                bw.write("\n");

            }

            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }
    
    public void leerArchivo() {

        lanzamientos = new ArrayList();

        if (archivo.exists()) {
            try {
                Scanner sc = new Scanner(archivo);

                while (sc.hasNextLine()) {
                    String[] array = sc.nextLine().split("\\|");

                    Lanzamiento l = new Lanzamiento();
                    l.setTitle(array[0]);
                    l.setFecha(array[1]);
                    l.setLikes(Integer.parseInt(array[2]));

                    lanzamientos.add(l);

                }
                System.out.println(lanzamientos);

                sc.close();
            } catch (Exception e) {
            }

        } else {
            System.out.println("no existe");
        }
    }
}
