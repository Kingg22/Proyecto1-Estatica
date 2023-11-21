package Class;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // declaracion de variables
        int opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0, nodo_information, nodo_informacion = 0, nodo = 0,
                size = 0, respuesta = 0;
        String input = "", respuesta2;
        String opcion5[] = { "Presentacion", "Pila", "Cola Simple", "Cola Circular", "Salir" };
        String opcion6[] = { "Insertar", "Eliminar", "Mostrar Pila", "Regresar" };
        String opcion7[] = { "Insertar", "Eliminar", "Mostrar Cola Simple", "Regresar" };
        String opcion8[] = { "Insertar", "Eliminar", "Mostrar Cola Circular", "Regresar" };

        // creacion de objetos de todas las clases
        Pila pila = new Pila();
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
                        while (size == 0) {
                            JOptionPane.showMessageDialog(null,
                                    "Para continuar, por favor, ingresa primero el tamaño del arreglo.",
                                    "Aviso",
                                    JOptionPane.INFORMATION_MESSAGE);
                            input = JOptionPane.showInputDialog(null,
                                    "Por favor ingresa el tamaño del arreglo");
                            if (input != null) {
                                size = Integer.parseInt(input);
                                pila.AsignarTamano(size);
                            } else {
                                // El usuario canceló o cerró el cuadro de diálogo
                                JOptionPane.showMessageDialog(null,
                                        "Operación cancelada por el usuario.",
                                        "Aviso",
                                        JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                        if (size > 0) {
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
                                switch (opcion2) {
                                    case 0:
                                        respuesta2 = "";
                                        while (respuesta2 == "") {

                                            input = JOptionPane.showInputDialog(null,
                                                    "Por favor ingresa el valor a guardar");
                                            if (input != null) {
                                                try {
                                                    nodo = Integer.parseInt(input);
                                                    pila.InsertarNodo(nodo);
                                                    respuesta2 = "2";
                                                } catch (NumberFormatException e) {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Error en el formato de parseo, asegurese de no insertar una letra\n ",
                                                            "Error",
                                                            JOptionPane.ERROR_MESSAGE);
                                                    respuesta2 = "";
                                                }
                                            } else {
                                                // El usuario canceló o cerró el cuadro de diálogo
                                                JOptionPane.showMessageDialog(null,
                                                        "Operación cancelada por el usuario.",
                                                        "Aviso",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                                respuesta2 = "l";
                                            }
                                        }
                                        break;
                                    case 1:
                                        if (!pila.PilaVacia()) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Se ha eliminado un elemento con el valor: "
                                                            + pila.EliminarNodo());
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "Subdesbordamiento - Pila vacía. No hay elementos para eliminar.",
                                                    "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                        }
                                        break;
                                    case 2:
                                        pila.MostrarValores();
                                        break;

                                    case 3:
                                        opcion2 = 5;
                                        break;

                                    default:
                                        respuesta = JOptionPane.showConfirmDialog(null,
                                                "¿Esta seguro que quiere salir del programa?: ",
                                                "SPA ARMONIA", JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null);
                                        if (respuesta == 0)
                                            System.exit(0);
                                }
                            } while (opcion2 != 5);
                            size = 0;
                        }
                        break;
                    case 2:
                        while (size == 0) {
                            JOptionPane.showMessageDialog(null,
                                    "Para continuar, por favor, ingresa primero el tamaño del arreglo.",
                                    "Aviso",
                                    JOptionPane.INFORMATION_MESSAGE);

                            input = JOptionPane.showInputDialog(null,
                                    "Por favor ingresa el tamaño del arreglo");
                            if (input != null) {
                                size = Integer.parseInt(input);
                                cola.AsignarTamano(size);
                            } else {
                                // El usuario canceló o cerró el cuadro de diálogo
                                JOptionPane.showMessageDialog(null,
                                        "Operación cancelada por el usuario.",
                                        "Aviso",
                                        JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                        if (size > 0) {
                            do {
                                opcion3 = JOptionPane.showOptionDialog(null,
                                        "                                                                      Menú\n\n"
                                                + "1. Insertar un elemento\n"
                                                + "2. Extraer un elemento\n"
                                                + "3. Mostrar contenido de la Cola\n"
                                                + "4. Regresar.\n\n",
                                        "Operaciones con Cola Simple", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        opcion7,
                                        "");

                                switch (opcion3) {
                                    case 0:
                                        respuesta2 = "";
                                        while (respuesta2 == "") {

                                            input = JOptionPane.showInputDialog(null,
                                                    "Por favor ingresa el valor a guardar");

                                            if (input != null) {
                                                try {
                                                    nodo_informacion = Integer.parseInt(input);
                                                    cola.Insertar(nodo_informacion);
                                                    respuesta2 = "2";
                                                } catch (NumberFormatException e) {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Error en el formato de parseo, asegurese de no insertar una letra\n ",
                                                            "Error",
                                                            JOptionPane.ERROR_MESSAGE);
                                                    respuesta2 = "";
                                                }
                                            } else {
                                                // El usuario canceló o cerró el cuadro de diálogo
                                                JOptionPane.showMessageDialog(null,
                                                        "Operación cancelada por el usuario.",
                                                        "Aviso",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                                respuesta2 = "l";
                                            }
                                        }
                                        break;
                                    case 1:
                                        if (!cola.ColaVacia()) {
                                            JOptionPane.showMessageDialog(null, "Se extrajo un elemento con el valor: "
                                                    + cola.Extraer());
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error. Subdesbordamiento - Cola Vacia",
                                                    "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                        }
                                        break;
                                    case 2:
                                        cola.ImprimirCola();
                                        break;
                                    case 3:
                                        opcion3 = 5;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                        break;
                                }
                            } while (opcion3 != 5);
                            size = 0;
                        }
                        break;
                    case 3:
                        while (size == 0) {
                            JOptionPane.showMessageDialog(null,
                                    "Para continuar, por favor, ingresa primero el tamaño del arreglo.",
                                    "Aviso",
                                    JOptionPane.INFORMATION_MESSAGE);
                            input = JOptionPane.showInputDialog(null,
                                    "Por favor ingresa el tamaño del arreglo");
                            if (input != null) {
                                size = Integer.parseInt(input);
                                colaC.AsignarTamano(size);
                            } else {
                                // El usuario canceló o cerró el cuadro de diálogo
                                JOptionPane.showMessageDialog(null,
                                        "Operación cancelada por el usuario.",
                                        "Aviso",
                                        JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                        if (size > 0) {
                            do {
                                opcion4 = JOptionPane.showOptionDialog(null,
                                        "                                                                           Menú\n\n"
                                                + "1. Insertar un elemento\n"
                                                + "2. Extraer un elemento\n"
                                                + "3. Mostrar contenido de la Cola Circular\n"
                                                + "4. Regresar.\n\n",
                                        "Operaciones con Cola Circular", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        opcion8,
                                        "");

                                switch (opcion4) {
                                    case 0:
                                        respuesta2 = "";
                                        while (respuesta2 == "") {

                                            input = JOptionPane.showInputDialog(null,
                                                    "Por favor ingresa el valor a guardar");

                                            if (input != null) {
                                                try {
                                                    nodo_information = Integer.parseInt(input);
                                                    colaC.Agregar(nodo_information);
                                                    respuesta2 = "2";
                                                } catch (NumberFormatException e) {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Error en el formato de parseo, asegurese de no insertar una letra\n ",
                                                            "Error",
                                                            JOptionPane.ERROR_MESSAGE);
                                                    respuesta2 = "";
                                                }
                                            } else {
                                                // El usuario canceló o cerró el cuadro de diálogo
                                                JOptionPane.showMessageDialog(null,
                                                        "Operación cancelada por el usuario.",
                                                        "Aviso",
                                                        JOptionPane.INFORMATION_MESSAGE);
                                                respuesta2 = "l";
                                            }

                                        }
                                        break;
                                    case 1:
                                        if (!colaC.ColaCircularVacia()) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Se extrajo un elemento con el valor: "
                                                            + colaC.Extraer());
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "Error. Subdesbordamiento - Cola Vacia",
                                                    "Error",
                                                    JOptionPane.ERROR_MESSAGE);
                                        }
                                        break;
                                    case 2:
                                        colaC.imprimirColaCircular();
                                        break;
                                    case 3:
                                        opcion4 = 5;
                                        break;
                                    default:
                                        respuesta = JOptionPane.showConfirmDialog(null,
                                                "¿Esta seguro que quiere salir del programa?: ",
                                                "ESTRUCTURA DE DATOS", JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null);
                                        if (respuesta == 0)
                                            System.exit(0);

                                }

                            } while (opcion4 != 5);
                            size = 0;
                        }
                        break;
                    case 4:
                        opcion1 = 4;
                        break;
                    default:
                        respuesta = JOptionPane.showConfirmDialog(null,
                                "¿Esta seguro que quiere salir del programa?: ",
                                "ESTRUCTURA DE DATOS", JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null);
                        if (respuesta == 0)
                            System.exit(0);
                        else
                            opcion1 = 0;
                        break;
                }
            } catch (NumberFormatException nm) {
                JOptionPane.showMessageDialog(null,
                        "Error en el formato de parseo, asegurese de no insertar una letra\n ",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion1 != 4);
    }
}
