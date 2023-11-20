package Class;

import javax.swing.JOptionPane;

public class Circular {
    private int punteroInicial, punteroFinal, cantidadAgregados, tamano, colaC[];
    
    // metodo que nos da el tamaño del arreglo
    public void AsignarTamano(int size) {
        tamano = size;
        colaC = new int[tamano];
        punteroInicial = punteroFinal = cantidadAgregados = 0;
    }

    // metodo que calcula que posicion se coloca el nuevo elemento
    public int CalcularPosicionNewElement() {
        return (punteroInicial + cantidadAgregados) % tamano;
    }

    // metodo que calcula la nnueva posicion inicial
    public void CalcularNuevaPosicionInicial() {
        punteroInicial = (punteroInicial + 1) % tamano;
    }

    // metodo que verifica si la cola esta vacia
    public boolean ColaCircularVacia() {
        return (cantidadAgregados == 0);
    }

    // metodo que verifica si la cola esta llena
    public boolean ColaCircularLlena() {
        return (cantidadAgregados == tamano);
     }

    public void Agregar(int numero) {
        if (!ColaCircularLlena()) {
            colaC[CalcularPosicionNewElement()] = numero;
            cantidadAgregados++;
            punteroFinal = (punteroFinal + 1) % tamano;
        } else {
            // Si la cola está llena, el nuevo elemento se agrega en la posición 0
            colaC[0] = numero;
            punteroFinal = 1; // Actualizamos punteroFinal a 1
            punteroInicial = 0; // También ajustamos punteroInicial a 0
            cantidadAgregados++;
        }
    }
    
    public int Extraer() {
        if (!ColaCircularVacia()) {
            int informacion = colaC [punteroInicial];
            colaC[punteroInicial] = 0;
            CalcularNuevaPosicionInicial();
            cantidadAgregados--;
            return informacion;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    // Método para imprimir el contenido de la cola circular
    public void imprimirColaCircular() {
        String colaCircular = "";

        if (!ColaCircularVacia()) {
            for (int i = 0; i < colaC.length; i++) {
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
                    colaCircular + "\nFrente: " + punteroInicial + "\nFinal: " + punteroFinal,         
                    "Cola Circular", 
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

}
