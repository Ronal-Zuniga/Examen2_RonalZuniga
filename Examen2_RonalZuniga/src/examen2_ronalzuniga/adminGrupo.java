package examen2_ronalzuniga;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminGrupo {
    private ArrayList<Chat> listaGrupos = new ArrayList();
    private File archivo = null;
    
    public adminGrupo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Chat> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Chat> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminGrupo{" + "listaGrupos=" + listaGrupos + ", archivo=" + archivo + '}';
    }
    
    public void setGrupo(Grupo p) {
        this.listaGrupos.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaGrupos = new ArrayList();
            Grupo temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Grupo) objeto.readObject()) != null) {
                        listaGrupos.add(temp);
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
            for (Chat t : listaGrupos) {
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
