package examen2_ronalzuniga;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean vive;
    int valor;

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        while (vive) {
            barra.setValue(barra.getValue() + 1);
            if (barra.getValue() == valor) {
                vive = false;
                JOptionPane.showMessageDialog(null, "Mensaje enviado");
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }

}
