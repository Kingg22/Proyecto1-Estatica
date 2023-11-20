package Class;

import javax.swing.JOptionPane;

public class Cola {
    private int frente, nfinal, max, cola[];
    
    // metodo que asigna el tamaño del arreglo
    public void AsignarTamano(int size) {
        max = size;
        cola = new int[size];
        frente = nfinal = -1;
    }

    public boolean ColaLlena() {
        return nfinal == max - 1;
    }
    public boolean ColaVacia() {
        return (frente == -1 && nfinal == -1);
    }
    public void Insertar(int dato) {
       if (!ColaLlena()) {
            nfinal++;
            cola [nfinal] = dato;
            if (nfinal == 0) {
                frente = 0;
            }
       } else {
        JOptionPane.showMessageDialog(null, 
            "Desbordamiento - Cola llena. No puede ingresar el numero " + dato, 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
       }
    }
    public int Extraer() {
        if (!ColaVacia()) {
            int informacion = cola [frente];
            cola[frente] = 0;
            if (frente == nfinal) {
                frente = nfinal = -1;
            } else {
                frente++;
            }
            return informacion;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public void ImprimirCola() {
        String colaSimple = "";
    
        if (!ColaVacia()) {
            for (int i = 0; i < cola.length; i++) {
                colaSimple += cola[i] + " ";
            }
        }
    
        if (ColaVacia()) {
            JOptionPane.showMessageDialog(null,
                    "Cola Vacia" + "\nFrente: -1\nFinal: -1",
                    "Cola Simple",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    colaSimple + "\nFrente: " + frente + "\nFinal: " + nfinal,
                    "Cola Simple",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }    
}
