
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class CanchaFut {
    private String canchaFut1 [][] = new String[7][3];
    private String canchaFut2 [][] = new String[7][3];
    Empleados empleados1 = new Empleados("", 0, "", 0, "");

    //Rellenando los espacios de las 2 canchas de fut
    public CanchaFut() {
         for (int i = 0; i < canchaFut1.length; i++) {
            for (int j = 0; j < canchaFut1[i].length; j++) {
             canchaFut1[i][j] = "[O]";
             canchaFut2[i][j] = "[O]";
            }
        }
    }
    
    public boolean CanchaFut() {
        //prefijar columnas array 1
        canchaFut1[0][0] = "     ";
        canchaFut1[0][1] = "*1*";
        canchaFut1[0][2] = "*2";

        //prefijar filas array 1 
        canchaFut1[1][0] = "*1*";
        canchaFut1[2][0] = "*2*";
        canchaFut1[3][0] = "*3*";
        canchaFut1[4][0] = "*4*";
        canchaFut1[5][0] = "*5*";
        canchaFut1[6][0] = "*6*";

        //prefijar columnas array 2
        canchaFut2[0][0] = "     ";
        canchaFut2[0][1] = "*1*";
        canchaFut2[0][2] = "*2";

        //prefijar filas array 2
        canchaFut2[1][0] = "*1*";
        canchaFut2[2][0] = "*2*";
        canchaFut2[3][0] = "*3*";
        canchaFut2[4][0] = "*4*";
        canchaFut2[5][0] = "*5*";
        canchaFut2[6][0] = "*6*";

        while (true) {
            int opcionesFut = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                    + "1. Reservar\n"
                    + "2. Visualizar espacios\n"
                    + "3. Regresar"));

            switch (opcionesFut) {
                case 1://Reserva
                    while (true) {
                        int canchaReserva = Integer.parseInt(JOptionPane.showInputDialog("Cual cancha desea reservar:\n"
                                + "1. Cancha numero 1\n"
                                + "2. Cancha numero 2\n"
                                + "3. Regresar"));
                        switch (canchaReserva) {
                            case 1://cancha 1
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila: "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna: "));

                             if ("[O]".equals(canchaFut1[fila][columna])) {

                                String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                if (datosEmpleado != null) {
                                    String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                    canchaFut1[fila][columna] = resumenEmpleado;
                            JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                            }

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                            case 2://cancha 2
                                
                                int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila: "));
                                int columna2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna: "));

                             if ("[O]".equals(canchaFut2[fila2][columna2])) {

                                String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                if (datosEmpleado != null) {
                                    String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                    canchaFut2[fila2][columna2] = resumenEmpleado;
                                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                                }
                                }else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;

                        }
                        if (canchaReserva > 3 || canchaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (canchaReserva == 3) {
                            break;
                        }
                    }

                    break;
                case 2://visualizar
                    while (true) {
                        int canchaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("Cual cancha desea visualizar:\n"
                                + "1. Cancha numero 1\n"
                                + "2. Cancha numero 2\n"
                                + "3. Regresar"));
                        switch (canchaVisualizar) {
                            case 1:
                                  String mostrarEspacios1 = "";
                            for (int i = 0; i < canchaFut1.length; i++) {
                                for (int j = 0; j < canchaFut1[i].length; j++) {
                            mostrarEspacios1 += "[" + canchaFut1[i][j] + "]  ";
                             }
                                mostrarEspacios1 += "\n";
                             }
                                JOptionPane.showMessageDialog(null, "Cancha numero 1:\n"
                                        + mostrarEspacios1);
                                break;
                            case 2:
                                String mostrarEspacios2 = "";
                            for (int i = 0; i < canchaFut2.length; i++) {
                                for (int j = 0; j < canchaFut2[i].length; j++) {
                            mostrarEspacios2 += "[" + canchaFut2[i][j] + "]  ";
                             }
                                mostrarEspacios2 += "\n";
                             }
                                JOptionPane.showMessageDialog(null, "Cancha numero 2:\n"
                                        + mostrarEspacios2);
                                break;
                        }

                        if (canchaVisualizar > 3 || canchaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (canchaVisualizar == 3) {
                            break;
                        }

                    }

                    break;

            }

            if (opcionesFut > 3 || opcionesFut < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesFut == 3) {
                break;
            }
        }

        return true;
    }
    
    //liberar de cada una de las opciones
    public void canchaFutLiberar() {
        OUTER:
        while (true) {
            int canchaLiberar = Integer.parseInt(JOptionPane.showInputDialog(
                    "Cancha de Futbol a liberar:\n"
                            + "1. Cancha número 1\n"
                            + "2. Cancha número 2\n"
                            + "3. Regresar"));
            switch (canchaLiberar) {
                case 1:
                    int filaFut = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 6): "));
                    int columnaFut = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));
                    if (filaFut < 1 || filaFut > 6 || columnaFut < 1 || columnaFut > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }   String espacio = canchaFut1[filaFut][columnaFut];
                    if (espacio.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        canchaFut1[filaFut][columnaFut] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    }   break;
                    
                case 2:
                    int filaFut2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 6): "));
                    int columnaFut2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));
                    if (filaFut2 < 1 || filaFut2 > 6 || columnaFut2 < 1 || columnaFut2 > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }   String espacio2 = canchaFut2[filaFut2][columnaFut2];
                    if (espacio2.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        canchaFut2[filaFut2][columnaFut2] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    }   break;
   
                default:
                    JOptionPane.showMessageDialog(null, "¡Opción inválida! Verifique que se encuentre entre las opciones.");
                    break;
            
            }
            if (canchaLiberar > 3 || canchaLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (canchaLiberar == 3) {
                break;
            }
        }
    }
    
}
