package Class;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // declaracion de variables
        int opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0, nodo_information, nodo_informacion = 0;  //nodo = 0, ;
        String opcion5[] = { "Presentacion", "Pila", "Cola Simple", "Cola Circular", "Salir"};
        String opcion6[] = { "Insertar", "Eliminar", "Mostrar Pila", "Regresar" };
        String opcion7[] = { "Ingrese el tamano", "Insertar", "Eliminar", "Mostrar Cola Simple", "Regresar" };
        String opcion8[] = { "Ingrese el tamano", "Insertar", "Eliminar", "Mostrar Cola Circular", "Regresar"};

        // creacion de objetos de todas las clases
        //Pila pila = new Pila();
        Cola cola = new Cola();
        Circular colaC = new Circular();
        
        do {
                opcion1 = JOptionPane.showOptionDialog(null, 
                "                                                Menu Principal\n\n", 
                "Estructura de datos", 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcion5, 
                "");
            try {
                switch (opcion1) {
                    case 0:
                        JOptionPane.showMessageDialog(null, 
                        "Grupo: \nRey Acosta 8-1024-1653 \nPatrick Villaroel E-8-206126"
                        + "\nNathan Carrasco 8-1010-606 \nCarlos Cedeno 8-1019-137",
                        "Proyecto 1", 
                        JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        do {
                                opcion2 = JOptionPane.showOptionDialog(null,
                                        "                                      Menú\n\n"
                                        + "1. Insertar un elemento\n"
                                        + "2. Eliminar un elemento\n"
                                        + "3. Mostrar contenido de la Pila\n"
                                        + "4. Regresar.\n\n", 
                                        "Operaciones con Pilas", 
                                        JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcion6, 
                                        "");
                                /* 
                                switch (opcion2) {
                                    case 0:
                                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                "Porfavor ingresa el valor a guardar"));
                                        pila.InsertarNodo(nodo);
                                        break;
                                    case 1:
                                        if(!pila.PilaVacia()){
                                            JOptionPane.showMessageDialog(null, "Se ha eliminado un elemento con el valor: "
                                            + pila.EliminarNodo());
                                        }else {
                                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                                        }
                                        break;
                                    case 2:
                                        pila.MostrarValores();
                                        break;
                                        
                                    case 3:
                                        opcion2 = 8;
                                        break;
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                                        break;
                                }*/
                        } while (opcion2 != 8);
                        break;
                    case 2:
                        do {
                                opcion3 = JOptionPane.showOptionDialog(null,
                                        "                                                                      Menú\n\n"
                                        + "0. Ingrese el tamano del arreglo\n"
                                        + "1. Insertar un elemento\n"
                                        + "2. Extraer un elemento\n"
                                        + "3. Mostrar contenido de la Cola\n"
                                        + "4. Regresar.\n\n", 
                                        "Operaciones con Cola Simple",                                         JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcion7, 
                                        "");
                
                                switch (opcion3) {
                                    case 0:
                                        int size = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Porfavor ingresa el tamaño del arreglo"));
                                        cola.AsignarTamano(size);
                                        break;
                                    case 1:
                                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Porfavor ingresa el valor a guardar."));
                                        cola.Insertar(nodo_informacion);
                                        break;
                                    case 2:
                                        if (!cola.ColaVacia()) {
                                            JOptionPane.showMessageDialog(null, "Se extrajo un elemento con el valor: " 
                                                    + cola.Extraer());
                                        } else {
                                            JOptionPane.showMessageDialog(null, "La cola esta vacía");
                                        }
                                        break;
                                    case 3:
                                        cola.ImprimirCola();
                                        break;
                                    case 4:
                                        opcion3 = 5;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                        break;
                                }
                        } while (opcion3 != 5);
                        break;
                    case 3: 
                        do {
                                opcion4 = JOptionPane.showOptionDialog(null,
                                        "                                                                           Menú\n\n"
                                        + "0. Ingrese el tamano del arreglo\n"
                                        + "1. Insertar un elemento\n"
                                        + "2. Extraer un elemento\n"
                                        + "3. Mostrar contenido de la Cola Circular\n"
                                        + "4. Regresar.\n\n", 
                                        "Operaciones con Cola Circular",                                         JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcion8, 
                                        "");
                
                                switch (opcion4) {
                                    case 0:
                                        int size = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Porfavor ingresa el tamaño del arreglo"));
                                        colaC.AsignarTamano(size);
                                        break;
                                    case 1:
                                        nodo_information = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Porfavor ingresa el valor a guardar."));
                                        colaC.Agregar(nodo_information);
                                        break;
                                    case 2:
                                        if (!colaC.ColaCircularVacia()) {
                                            JOptionPane.showMessageDialog(null, "Se extrajo un elemento con el valor: " 
                                                    + colaC.Extraer());
                                        } else {
                                            JOptionPane.showMessageDialog(null, 
                                            "Error. Subdesbordamiento - Cola Vacia", 
                                            "Error", 
                                            JOptionPane.ERROR_MESSAGE);
                                        }
                                        break;
                                    case 3:
                                        colaC.imprimirColaCircular();
                                        break;
                                    case 4:
                                        opcion4 = 5;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                        break;
                                }
                        } while (opcion4 != 5);
                        break;
                    case 4:
                        opcion1 = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, 
                        "Opción no dispobible.");
                        break;
                }
            } catch (NumberFormatException nm) {
                JOptionPane.showMessageDialog(null, 
                "Error en el formato de parseo " + nm, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion1 != 4);
    }
}
