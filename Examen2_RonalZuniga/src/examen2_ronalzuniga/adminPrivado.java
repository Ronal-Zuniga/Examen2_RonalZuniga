
package examen2_ronalzuniga;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPrivado {
    private ArrayList<Chat> listaPrivados = new ArrayList();
    private File archivo = null;
    
    public adminPrivado(String path) {
        archivo = new File(path);
    }

    public ArrayList<Chat> getListaPrivados() {
        return listaPrivados;
    }

    public void setListaPrivados(ArrayList<Chat> listaPrivados) {
        this.listaPrivados = listaPrivados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminPrivado{" + "listaPrivados=" + listaPrivados + ", archivo=" + archivo + '}';
    }
    
    public void setPrivado(Privado p) {
        this.listaPrivados.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaPrivados = new ArrayList();
            Privado temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Privado) objeto.readObject()) != null) {
                        listaPrivados.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Chat t : listaPrivados) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
