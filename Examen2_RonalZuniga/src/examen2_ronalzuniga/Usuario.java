
package examen2_ronalzuniga;

import java.util.ArrayList;

public class Usuario extends Persona{
    private String usuario;
    private String password;
    private ArrayList<Persona> amigos;
    private int calidad;
    private ArrayList<Chat> chats;

    public Usuario() {
        super();
    }

    public Usuario(String usuario, String password, ArrayList<Persona> amigos, int calidad, ArrayList<Chat> chats, String nombre, String apellido, int telefono) {
        super(nombre, apellido, telefono);
        this.usuario = usuario;
        this.password = password;
        this.amigos = amigos;
        this.calidad = calidad;
        this.chats = chats;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Persona> amigos) {
        this.amigos = amigos;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    @Override
    public String toString() {
        return usuario;
    }
   
    @Override
    public double Enviar(int emisor, int receptor) {
        double tiempo = ((receptor*0.6) + (emisor*0.85));
        return tiempo;
    }
    
}
