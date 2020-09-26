
package examen2_ronalzuniga;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable{
    private String contenido;
    private String fecha;
    private String hora;
    private boolean leido;

    public Mensaje() {
    }

    public Mensaje(String contenido,  String fecha, String hora, boolean leido) {
        this.contenido = contenido;
        this.fecha = fecha;
        this.hora = hora;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "contenido=" + contenido + ", fecha=" + fecha + ", hora=" + hora + ", leido=" + leido + '}';
    }    
}
