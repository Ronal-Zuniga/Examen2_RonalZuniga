
package examen2_ronalzuniga;

import java.util.ArrayList;

public class Privado extends Chat{
        private Usuario destino;

    public Privado() {
        super();
    }

    public Privado(Usuario destino, ArrayList<Mensaje> mensajes) {
        super(mensajes);
        this.destino = destino;
    }

    public Usuario getDestino() {
        return destino;
    }

    public void setDestino(Usuario destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return destino.getNombre();
    }
    
}
