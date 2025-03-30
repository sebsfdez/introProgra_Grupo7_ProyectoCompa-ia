
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class SalaDeReunion {

    private String reunionIntern;
    private String reunionCliente;
    private int capacidad;
    private String sala1[][] = new String[6][2];
    private String sala2[][] = new String[6][3];
    private String sala3[][] = new String[6][4];
    private String sala4[][] = new String[6][5];

    public SalaDeReunion(String reunionIntern, String reunionCliente, int capacidad) {
        this.reunionIntern = reunionIntern;
        this.reunionCliente = reunionCliente;
        this.capacidad = capacidad;

        //Sala 1 relleno
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                sala1[i][j] = "[O]";
            }
        }
        //Sala 2
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                sala2[i][j] = "[O]";
            }
        }

        //Sala 3
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                sala3[i][j] = "[O]";
            }

        }
        //Sala4
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                sala4[i][j] = "[O]";
            }

        }

    }

    public String getReunionIntern() {
        return reunionIntern;
    }

    public void setReunionIntern(String reunionIntern) {
        this.reunionIntern = reunionIntern;
    }

    public String getReunionCliente() {
        return reunionCliente;
    }

    public void setReunionCliente(String reunionCliente) {
        this.reunionCliente = reunionCliente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //opcion 5 sala de reuniones
    public void mostrarOpcionesReuniones() {
        while (true) {
            int opcionesSalaDeReuniones = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *Sala de reuniones*\n"
                    + " 1. Asignar espacios\n"
                    + " 2. Liberar espacios\n"
                    + " 3. Visualizar sala\n"
                    + " 4. Regresar al menu principal"));

            switch (opcionesSalaDeReuniones) {
                case 1:
                    asignarEspacioReunion();
                    break;
                case 2:
                    liberarEspacioSR();
                    break;
                case 3:
                    visualizarSala();
                    break;

            }
            if (opcionesSalaDeReuniones > 4 || opcionesSalaDeReuniones < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesSalaDeReuniones == 4) {
                break;
            }
        }

    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    public boolean asignarEspacioReunion() {
        int sala = Integer.parseInt(JOptionPane.showInputDialog("Digite la sala en la que desea ocupar(1,2,3,4): "));
        if (sala == 1 || sala == 2 || sala == 3 || sala == 4) {
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));

            switch (sala) {
                case 1:
                    if (sala1[fila][columna] == "[O]") {
                        sala1[fila][columna] = "[P]";
                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                    }
                    break;

                case 2:
                    if (sala2[fila][columna] == "[O]") {
                        sala2[fila][columna] = "[P]";
                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                    }
                    break;
                case 3:
                    if (sala3[fila][columna] == "[O]") {
                        sala3[fila][columna] = "[P]";
                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                    }
                    break;
                case 4:
                    if (sala4[fila][columna] == "[O]") {
                        sala4[fila][columna] = "[P]";
                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                    }
                    break;

            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Sala elegida inexistente!");
        }

        return true;
    }

    public boolean liberarEspacioSR() {
        int salaLiberar = Integer.parseInt(JOptionPane.showInputDialog("Digite la sala en la que desea liberar(1,2,3,4): "));
        if (salaLiberar == 1 || salaLiberar == 2 || salaLiberar == 3 || salaLiberar == 4) {
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));

            switch (salaLiberar) {
                case 1:
                    if (sala1[fila][columna] == "[P]") {
                        sala1[fila][columna] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    } else if (sala1[fila][columna] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                    }
                    break;

                case 2:
                    if (sala2[fila][columna] == "[P]") {
                        sala2[fila][columna] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    } else if (sala2[fila][columna] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                    }
                    break;
                case 3:
                    if (sala3[fila][columna] == "[P]") {
                        sala3[fila][columna] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    } else if (sala3[fila][columna] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                    }
                    break;
                case 4:
                    if (sala4[fila][columna] == "[P]") {
                        sala4[fila][columna] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    } else if (sala4[fila][columna] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                    } else {
                        JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                    }
                    break;

            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Sala elegida inexistente!");
        }

        return true;

    }

    public boolean visualizarSala() {
        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("¿Que sala desea visualizar?\n"
                    + "1. Sala numero 1\n"
                    + "2. Sala numero 2\n"
                    + "3. Sala numero 3\n"
                    + "4. Sala numero 4\n"
                    + "5. Regresar"));
            switch (op) {
                case 1:
                    salaNumero1();
                    break;
                case 2:
                    salaNumero2();
                    break;
                case 3:
                    salaNumero3();
                    break;
                case 4:
                    salaNumero4();
                    break;

            }
            if (op == 5) {
                break;
            }
            if (op > 5 || op < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
                continue;
            }
        }

        return true;

    }

    //metodos de cada sala, más que todo para visualizar
    public void salaNumero1() {
        //prefijar columnas
        sala1[0][0] = "     ";
        sala1[0][1] = "*1*";

        //prefijar filas
        sala1[1][0] = "*1*";
        sala1[2][0] = "*2*";
        sala1[3][0] = "*3*";
        sala1[4][0] = "*4*";
        sala1[5][0] = "*5*";

        //mostrar array
        String listaEspacios = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                listaEspacios += sala1[i][j] + "   ";
            }
            listaEspacios += "\n";
        }
        JOptionPane.showMessageDialog(null, "Sala numero 1:\n"
                + listaEspacios
                + "\n*5 espacios en total*"
                + "\n[O]: Libre | [P]: Ocupado ");

    }

    public void salaNumero2() {
        //prefijar columnas
        sala2[0][0] = "     ";
        sala2[0][1] = "*1*";
        sala2[0][2] = "*2*";

        //prefijar filas
        sala2[1][0] = "*1*";
        sala2[2][0] = "*2*";
        sala2[3][0] = "*3*";
        sala2[4][0] = "*4*";
        sala2[5][0] = "*5*";

        //mostrar array
        String listaEspacios = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                listaEspacios += sala2[i][j] + "   ";
            }
            listaEspacios += "\n";
        }
        JOptionPane.showMessageDialog(null, "Sala numero 2:\n"
                + listaEspacios
                + "\n*10 espacios en total*"
                + "\n[O]: Libre | [P]: Ocupado ");        //mostrar array
    }

    public void salaNumero3() {
        //prefijar columnas
        sala3[0][0] = "     ";
        sala3[0][1] = "*1*";
        sala3[0][2] = "*2*";
        sala3[0][3] = "*3*";

        //prefijar filas
        sala3[1][0] = "*1*";
        sala3[2][0] = "*2*";
        sala3[3][0] = "*3*";
        sala3[4][0] = "*4*";
        sala3[5][0] = "*5*";

        //mostrar array
        String listaEspacios = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                listaEspacios += sala3[i][j] + "   ";
            }
            listaEspacios += "\n";
        }
        JOptionPane.showMessageDialog(null, "Sala numero 3:\n"
                + listaEspacios
                + "\n*15 espacios en total*"
                + "\n[O]: Libre | [P]: Ocupado ");        //mostrar array
    }

    public void salaNumero4() {
        //prefijar columnas
        sala4[0][0] = "     ";
        sala4[0][1] = "*1*";
        sala4[0][2] = "*2*";
        sala4[0][3] = "*3*";
        sala4[0][4] = "*4*";

        //prefijar filas
        sala4[1][0] = "*1*";
        sala4[2][0] = "*2*";
        sala4[3][0] = "*3*";
        sala4[4][0] = "*4*";
        sala4[5][0] = "*5*";

        //mostrar array
        String listaEspacios = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                listaEspacios += sala4[i][j] + "   ";
            }
            listaEspacios += "\n";
        }
        JOptionPane.showMessageDialog(null, "Sala numero 4:\n"
                + listaEspacios
                + "\n*20 espacios en total*"
                + "\n[O]: Libre | [P]: Ocupado ");
        //mostrar array
    }

}
