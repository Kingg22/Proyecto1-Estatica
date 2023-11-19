package Class;

import javax.swing.JOptionPane;

public class Cola {
    private int punteroFrente, punteroFin, agregados, tamano, cola[];
    
    // metodo que asigna el tamaño del arreglo
    public void AsignarTamano(int size) {
        tamano = size;
        cola = new int[size];
        punteroFrente = punteroFin = agregados = 0;
    }
    // metodo que calcula que posicion se coloca el nuevo elemento
    public int CalcularPosicionNewElement() {
        return (punteroFrente + agregados) % tamano;
    }
    
    // metodo que calcula la nnueva posicion inicial
    public void CalcularNuevaPosicionInicial() {
        punteroFrente = (punteroFrente + 1) % tamano;
    }

    public boolean ColaLlena() {
        return (agregados == tamano);
    }
    public boolean ColaVacia() {
        return (agregados == 0);
    }
    public void Insertar(int dato) {
       if (!ColaLlena()) {
            cola [CalcularPosicionNewElement()] = dato;
            agregados++;
            punteroFin = (punteroFin + 1) % tamano;
       } else {
        JOptionPane.showMessageDialog(null, 
            "Desbordamiento - Cola llena. No puede ingresar el numero " + dato, 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
       }
    }
    public int Extraer() {
        if (!ColaVacia()) {
            int informacion = cola [punteroFrente];
            cola[punteroFrente] = 0;
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
                    colaSimple + "\nFrente: 0\nFinal: 0",
                    "Cola Simple",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    colaSimple + "\nFrente: " + punteroFrente + "\nFinal: " + punteroFin,
                    "Cola Simple",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }    
}
