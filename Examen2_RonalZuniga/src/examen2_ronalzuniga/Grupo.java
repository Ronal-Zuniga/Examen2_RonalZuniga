package examen2_ronalzuniga;

import java.util.ArrayList;

public class Grupo extends Chat{
    private String nombre;
    private ArrayList<Usuario> miembros;
    private Persona admin;

    public Grupo() {
        super();
    }

    public Grupo(String nombre, ArrayList<Usuario> miembros, Persona admin, ArrayList<Mensaje> mensajes) {
        super(mensajes);
        this.nombre = nombre;
        this.miembros = miembros;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Persona getAdmin() {
        return admin;
    }

    public void setAdmin(Persona admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return nombre;
    }
        
}
