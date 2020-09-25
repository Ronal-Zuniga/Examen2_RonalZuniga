
package examen2_ronalzuniga;

import java.util.ArrayList;

public class Privado extends Chat{
    private String receptor;

    public Privado() {
        super();
    }

    public Privado(String receptor, ArrayList<Mensaje> mensajes) {
        super(mensajes);
        this.receptor = receptor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Privado{" + "receptor=" + receptor + '}';
    }  
    
}
