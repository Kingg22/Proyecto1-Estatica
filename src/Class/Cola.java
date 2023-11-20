package Class;

import javax.swing.JOptionPane;

public class Cola {
    private int frente, nfinal, agregados, max, cola[];
    
    // metodo que asigna el tamaño del arreglo
    public void AsignarTamano(int size) {
        max = size;
        cola = new int[size];
        frente = nfinal = agregados = 0;
    }
    // metodo que calcula que posicion se coloca el nuevo elemento
    public int CalcularPosicionNewElement() {
        return (frente + agregados) % max;
    }
    
    // metodo que calcula la nnueva posicion inicial
    public void CalcularNuevaPosicionInicial() {
        frente = (frente + 1) % max;
    }

    public boolean ColaLlena() {
        return (agregados == max);
    }
    public boolean ColaVacia() {
        return (agregados == 0);
    }
    public void Insertar(int dato) {
       if (!ColaLlena()) {
            cola [CalcularPosicionNewElement()] = dato;
            agregados++;
            nfinal = (nfinal + 1) % max;
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
            CalcularNuevaPosicionInicial();
            agregados--;
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
                    colaSimple + "\nFrente: -1\nFinal: -1",
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
