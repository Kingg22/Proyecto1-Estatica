package Class;

public class Circular {
    private int punteroInicial, punteroFinal, cantidadAgregados, tamano;
    private int [] elementos;
    
    // Constructor que nos da el tamaño del arreglo
    public Circular(int size) {
        tamano = size;
        elementos = new int[tamano];
        punteroInicial = punteroFinal = cantidadAgregados = 0;
    }

    // metodo que calcula que posicion se coloca el nuevo elemento
    public int CalcularPosicionNewElement() {
        return (punteroInicial + cantidadAgregados) % tamano;
    }

    // metodo que verifica si la cola esta vacia
    public boolean ColaCircularVacia() {
        return (cantidadAgregados == 0);
    }

    // metodo que verifica si la cola esta llena
    public boolean ColaCircularLlena() {
        return (cantidadAgregados == tamano);
     }

     
}
