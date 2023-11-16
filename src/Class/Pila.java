package Class;

import javax.swing.JOptionPane;

public class Pila {
    private int tope, tamano, pila [];

    public void AsignarTamano(int size) {
        tamano = size;
        pila = new int[tamano];
        tope = -1; // Inicializar el tope en -1 para indicar una pila vacía
    }

    // Método para saber cuando la pila está vacía
    public boolean PilaVacia() {
        return tope == -1;
    }

    // Método para saber cuando la pila está llena
    public boolean PilaLlena() {
        return tope == tamano - 1;
    }

    // Método para insertar un elemento en la pila
    public void InsertarNodo(int nodo) {
        if (!PilaLlena()) {
            tope++;
            pila[tope] = nodo;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Desbordamiento - Pila llena. No puede ingresar el número " + nodo,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para eliminar un elemento de la pila
    public int EliminarNodo() {
        if (!PilaVacia()) {
            int auxiliar = pila[tope];
            tope--;
            return auxiliar;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    // Método para mostrar el contenido de la pila
    public void MostrarValores() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i <= tope; i++) {
            lista.append(pila[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null,
                lista.toString() + "Tope: " + tope,
                "Pila",
                JOptionPane.PLAIN_MESSAGE);
    }
}