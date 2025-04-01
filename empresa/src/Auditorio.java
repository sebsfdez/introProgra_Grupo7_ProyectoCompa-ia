
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Auditorio {

    private int capacidad;
    private String charlas;
    private String capacitaciones;//meter más atributos si hace falta
    private String matrizCapacidad[][] = new String[6][11];

    public Auditorio(int capacidad, String charlas, String capacitaciones) {
        this.capacidad = capacidad;
        this.charlas = charlas;
        this.capacitaciones = capacitaciones;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                matrizCapacidad[i][j] = "[O]";

            }
        }

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCharlas() {
        return charlas;
    }

    public void setCharlas(String charlas) {
        this.charlas = charlas;
    }

    public String getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(String capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public void mostrarOpcionesAuditorio() {
        while (true) {
            int opcionesAuditorio = Integer.parseInt(JOptionPane.showInputDialog("Elegiste la opcion *Auditorio*\n"
                    + " 1. Liberar espacio\n"
                    + " 2. Reservar\n"
                    + " 3. Lista de reservas\n"
                    + " 4. Regresar al menu principal"));

            switch (opcionesAuditorio) {
                case 1:
                    liberarEspacio();
                    break;
                case 2:
                    reservar();
                    break;
                case 3:
                    listaReservas();
                    break;

            }
            if (opcionesAuditorio > 4 || opcionesAuditorio < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesAuditorio == 4) {
                break;
            }
        }

    }

    public boolean liberarEspacio() {
        while (true) {            
            int opcionLiberar = Integer.parseInt(JOptionPane.showInputDialog("Opciones a liberar: \n"
                + "1. Todos los espacios\n"
                + "2. Uno por uno\n"
                + "3. Regresar"));
            switch (opcionLiberar) {
                case 1://libera todos
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            matrizCapacidad[i][j] = "[O]";

                        }

                    }
                    matrizCapacidad[1][10] = "[O]";
                    matrizCapacidad[2][10] = "[O]";
                    matrizCapacidad[3][10] = "[O]";
                    matrizCapacidad[4][10] = "[O]";
                    matrizCapacidad[5][10] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    break;
            case 2:
                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));

                if (matrizCapacidad[fila][columna] == "[P]") {
                    matrizCapacidad[fila][columna] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                } else if (matrizCapacidad[fila][columna] == "[O]") {
                    JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                }
                break;

        }
             if (opcionLiberar > 3 || opcionLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionLiberar == 3) {
                break;
            }

        }
        
        return true;
    }

    public boolean reservar() {
        LocalTime horaInicio = LocalTime.of(10, 0);  // 10:00 AM
        LocalTime horaFin = LocalTime.of(15, 0);  // 3:00 PM

        //formato de 24 horas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        //variable donde almacenar hora
        LocalTime hora = null;
        //pedir datos
        String datos = JOptionPane.showInputDialog("Que hora desea reservar(HH:mm): ");
        //Los datos convertidos en localTime
        hora = LocalTime.parse(datos, formato);
        
        if (hora.isBefore(horaInicio) || hora.isAfter(horaFin)) {
            JOptionPane.showMessageDialog(null,"No hay cupos a la hora que desea reservar");
        } else {
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
            if (matrizCapacidad[fila][columna] == "[O]") {
                matrizCapacidad[fila][columna] = "[P]";
                JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

            } else {
                JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
            }
        }

        return true;
    }

    public boolean listaReservas() {
        //prefijar columnas
        matrizCapacidad[0][0] = "     ";
        matrizCapacidad[0][1] = "*1*";
        matrizCapacidad[0][2] = "*2*";
        matrizCapacidad[0][3] = "*3*";
        matrizCapacidad[0][4] = "*4*";
        matrizCapacidad[0][5] = "*5*";
        matrizCapacidad[0][6] = "*6*";
        matrizCapacidad[0][7] = "*7*";
        matrizCapacidad[0][8] = "*8*";
        matrizCapacidad[0][9] = "*9*";
        matrizCapacidad[0][10] = "*10*";

        //prefijar filas
        matrizCapacidad[1][0] = "*1*";
        matrizCapacidad[2][0] = "*2*";
        matrizCapacidad[3][0] = "*3*";
        matrizCapacidad[4][0] = "*4*";
        matrizCapacidad[5][0] = "*5*";

        //mostrar
        String mostrar = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                mostrar += matrizCapacidad[i][j] + "   ";

            }
            mostrar += "\n";
        }

        JOptionPane.showMessageDialog(null, "Lista de reservas: \n" + mostrar
                + "\n*50 espacios en total*"
                + "\n[O]: Libre | [P]: Ocupado ");

        return true;
    }

}
