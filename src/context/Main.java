package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Entrada de datos
        String nombre = JOptionPane.showInputDialog(
                null,
                "Introduce tu nombre:"
        );

        //Salida
        JOptionPane.showMessageDialog(
                null,
                "Hola, " + nombre
        );
    }
}
