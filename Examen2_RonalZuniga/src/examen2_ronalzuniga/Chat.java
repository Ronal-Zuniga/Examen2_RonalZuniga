
package examen2_ronalzuniga;

import java.util.ArrayList;

public class Chat {
    private ArrayList<Mensaje> mensajes;

    public Chat() {
    }

    public Chat(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Chat{" + "mensajes=" + mensajes + '}';
    }
    
}
