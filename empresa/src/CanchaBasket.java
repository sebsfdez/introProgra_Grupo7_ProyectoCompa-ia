
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class CanchaBasket {

    //Atributos
    private String canchaBasket[][] = new String[6][3];

    Empleados empleados1 = new Empleados("", 0, "", 0, "");

    //Constructor
    public CanchaBasket() {
        //rellenando cancha Basket
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                canchaBasket[i][j] = "[O]";
            }
        }
    }

    //Metodo para visualizar y agregar una reserva en la cancha de basket
    public void CanchaBasket() {
        //prefijar columnas array 1
        canchaBasket[0][0] = "     ";
        canchaBasket[0][1] = "*1*";
        canchaBasket[0][2] = "*2";

        //prefijar filas array 1 
        canchaBasket[1][0] = "*1*";
        canchaBasket[2][0] = "*2*";
        canchaBasket[3][0] = "*3*";
        canchaBasket[4][0] = "*4*";
        canchaBasket[5][0] = "*5*";

        while (true) {
            int opcionesBasket = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                    + "1. Reservar\n"
                    + "2. Visualizar espacios\n"
                    + "3. Regresar"));

            switch (opcionesBasket) {
                case 1://Reserva
                    while (true) {
                        int canchaReserva = Integer.parseInt(JOptionPane.showInputDialog("Cancha a reservar:\n"
                                + "1. Cancha\n"
                                + "2. Regresar"));
                        switch (canchaReserva) {
                            case 1://cancha 1
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila(1-5): "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna(1-2): "));

                                if ("[O]".equals(canchaBasket[fila][columna])) {

                                    String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                    if (datosEmpleado != null) {
                                        String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                        canchaBasket[fila][columna] = resumenEmpleado;
                                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                        }
                        if (canchaReserva > 3 || canchaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (canchaReserva == 2) {
                            break;
                        }
                    }

                    break;
                case 2://visualizar
                    while (true) {
                        int canchaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("Cancha a visualizar:\n"
                                + "1. Cancha de basket\n"
                                + "2. Regresar"));
                        switch (canchaVisualizar) {
                            case 1:
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < canchaBasket.length; i++) {
                                    for (int j = 0; j < canchaBasket[i].length; j++) {
                                        mostrarEspacios1 += "[" + canchaBasket[i][j] + "]  ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Cancha numero 2:\n"
                                        + mostrarEspacios1);
                        }

                        if (canchaVisualizar > 2 || canchaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (canchaVisualizar == 2) {
                            break;
                        }

                    }

                    break;

            }

            if (opcionesBasket > 3 || opcionesBasket < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesBasket == 3) {
                break;
            }
        }

    }

    //Metodo para liberar espacios en la cancha de basket
    public void canchaBasketLiberar() {
        while (true) {

            int canchaLiberar = Integer.parseInt(JOptionPane.showInputDialog(
                    "Cancha de basket a liberar:\n"
                    + "1. Cancha número 1\n"
                    + "2. Regresar"));

            if (canchaLiberar == 1) {
                int filaBasket = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 5): "));
                int columnaBasket = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));

                if (filaBasket < 1 || filaBasket > 5 || columnaBasket < 1 || columnaBasket > 2) {
                    JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                    continue;
                }

                String espacio = canchaBasket[filaBasket][columnaBasket];

                if (espacio.equals("[O]")) {
                    JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                } else {
                    canchaBasket[filaBasket][columnaBasket] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                }

            } else if (canchaLiberar == 2) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "¡Opción inválida! Verifique que se encuentre entre las opciones.");
            }

        }
    }
}
