
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class bitacora {
     public ArrayList<Usuario> users = new ArrayList();
    public File archivo = null;

    public bitacora(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setArtistas(ArrayList<Usuario> users) {
        this.users = users;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + users;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);

            for (Usuario u : users) {
                if (u instanceof Artista) {
                    bw.write(u.getUsername() + "|");
                    bw.write(u.getPassword() + "|");
                    bw.write(u.getEdad() + "|");
                    bw.write(((Artista) u).getArt_name());
                    Date date = new Date();
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                    String strDate = dateFormat.format(date);
                    bw.write(strDate + "\n");
                }else{
                    bw.write(u.getUsername() + "|");
                    bw.write(u.getPassword() + "|");
                    bw.write(u.getEdad() + "\n");
                }
            }
            
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }

    public void leerArchivo() {

        users = new ArrayList();

        if (archivo.exists()) {
            try {
                Scanner sc = new Scanner(archivo);

                while (sc.hasNextLine()) {
                    String[] array = sc.nextLine().split("\\|");
                    
                    if(array.length == 4){
                        Artista a = new Artista();
                        a.setArt_name(array[3]);
                        a.setUsername(array[0]);
                        a.setPassword(array[1]);
                        a.setEdad(Integer.parseInt(array[2]));
                        
                        users.add(a);
                    }else{
                        Cliente c = new Cliente();
                        c.setUsername(array[0]);
                        c.setPassword(array[1]);
                        c.setEdad(Integer.parseInt(array[2]));
                        
                        users.add(c);
                    }

                }
                System.out.println(users);
                
                sc.close();
            } catch (Exception e) {
            }

        } else {
            System.out.println("no existe");
        }
    }
}
