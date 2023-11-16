package Class;

import javax.swing.JOptionPane;

public class Circular {
    private int punteroInicial, punteroFinal, cantidadAgregados, tamano;
    private int [] elementos;
    
    // Constructor que nos da el tamaño del arreglo
    public void AsignarTamano(int size) {
        tamano = size;
        elementos = new int[tamano];
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
            elementos[CalcularPosicionNewElement()] = numero;
            cantidadAgregados++;
            if (punteroFinal < tamano) {
                punteroFinal++;
            } else {
                punteroFinal = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, 
            "Desbordamiento - Cola llena. No puede ingresar el numero " + numero, 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        }
    }
    public int Extraer() {
        if (!ColaCircularVacia()) {
            int informacion = elementos [punteroInicial];
            CalcularNuevaPosicionInicial();
            cantidadAgregados--;
            return informacion;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    // Método para imprimir el contenido de la cola circular
    public void imprimirColaCircular() {
        String colaCircularInvertida = "";
        
        if (!ColaCircularVacia()) {
            for  (int i = (punteroFinal - 1 + tamano) % tamano; i != punteroInicial; i = (i - 1 + tamano) % tamano) {
                colaCircularInvertida += elementos[i] + " ";
            }
        }
        if (ColaCircularVacia()) {
            JOptionPane.showMessageDialog(null, 
            colaCircularInvertida + "\nFrente: 0\n Final: 0",         
            "Cola Circular", 
            JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
            colaCircularInvertida + "\nFrente: " +  punteroInicial + "\nFinal: " + punteroFinal,         
            "Cola Circular", 
            JOptionPane.PLAIN_MESSAGE);
        }
    }
}
