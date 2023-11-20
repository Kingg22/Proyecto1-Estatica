package Class;

import javax.swing.JOptionPane;

public class Circular {
    private int frente, nFinal, max, colaC[];
    
    // metodo que nos da el tamaño del arreglo
    public void AsignarTamano(int size) {
        max = size;
        colaC = new int[max];
        frente = nFinal = -1;
    }

    // metodo que verifica si la cola esta vacia
    public boolean ColaCircularVacia() {
        return (frente == -1 && nFinal == -1);
    }

    // metodo que verifica si la cola esta llena
    public boolean ColaCircularLlena() {
        return (((nFinal == max - 1) && frente == 0) || nFinal + 1 == frente);
     }

    public void Agregar(int numero) {
        if (!ColaCircularLlena()) {
            if (nFinal == max - 1) {
                nFinal = 0;
            } else {
                nFinal++;
            }
            colaC[nFinal] = numero;
        } else {
            JOptionPane.showMessageDialog(null, 
            "Desbordamiento - Cola llena. No puede ingresar el numero " + numero, 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int Extraer() {
        if (!ColaCircularVacia()) {
            int informacion = colaC [frente];
            if (frente == nFinal) {
                frente = nFinal = -1;
            } else {
                if (ColaCircularLlena()) {
                    frente = 0;
                } else {
                    frente++;
                }
            }
            return informacion;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    // Método para imprimir el contenido de la cola circular
    public void imprimirColaCircular() {
        String colaCircular = "";

        if (!ColaCircularVacia()) {
            for (int i = 0; i < colaCircular.length(); i++) {
                colaCircular += colaC[i] + " ";
            }
        }

        if (ColaCircularVacia()) {
            JOptionPane.showMessageDialog(null, 
                    "Cola Circular Vacia" + "\nFrente: -1\nFinal: -1",         
                    "Cola Circular", 
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                    colaCircular + "\nFrente: " + frente + "\nFinal: " + nFinal,         
                    "Cola Circular", 
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

}
