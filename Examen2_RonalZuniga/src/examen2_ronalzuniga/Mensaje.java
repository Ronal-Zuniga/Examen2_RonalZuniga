
package examen2_ronalzuniga;

import java.util.Date;

public class Mensaje {
    private String contenido;
    private Date fecha;
    private Date hora;
    private boolean leido;

    public Mensaje() {
    }

    public Mensaje(String contenido, Date fecha, Date hora, boolean leido) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
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
