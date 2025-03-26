
import javax.swing.JOptionPane;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSys private String S1[][] = new String[5][5];
    private String S2[][] = new String[5][5];
    private String S3[][] = new String[6][5];
tem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Parqueo {

    private String espacioOcupado;
    private String espacioLibre;
    private String reservado;
    private String discapacitados;
    private String S1[][] = new String[5][6];
    private String S2[][] = new String[6][6];
    private String S3[][] = new String[7][6];

    public Parqueo(String espacioOcupado, String espacioLibre, String reservado, String discapacitados) {
        this.espacioOcupado = espacioOcupado;
        this.espacioLibre = espacioLibre;
        this.reservado = reservado;
        this.discapacitados = discapacitados;

        //llenar inicialmente vacios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                S1[i][j] = "[O]";
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                S2[i][j] = "[O]";

            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                S3[i][j] = "[O]";

            }
        }

    }

    public String[][] getS1() {
        return S1;
    }

    public void setS1(String[][] S1) {
        this.S1 = S1;
    }

    public String[][] getS2() {
        return S2;
    }

    public void setS2(String[][] S2) {
        this.S2 = S2;
    }

    public String[][] getS3() {
        return S3;
    }

    public void setS3(String[][] S3) {
        this.S3 = S3;
    }

    public String getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(String espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    public String getEspacioLibre() {
        return espacioLibre;
    }

    public void setEspacioLibre(String espacioLibre) {
        this.espacioLibre = espacioLibre;
    }

    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    public String getDiscapacitados() {
        return discapacitados;
    }

    public void setDiscapacitados(String discapacitados) {
        this.discapacitados = discapacitados;
    }

    //opcion 3 parqueo 
    public void mostrarOpcionesParqueo() {
        while (true) {
            int opcionesParqueo = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *Parqueo* | Que deseas hacer?\n"
                    + " 1. Asignar espacios\n"
                    + " 2. Visualizar espacios\n"
                    + " 3. Liberar espacios\n"
                    + " 4. Regresar al menu principal"));
            switch (opcionesParqueo) {
                case 1:
                    asignarEspacioParq();
                    break;
                case 2:
                    visualizarEspacio();
                    break;
                case 3:
                    liberarEspacioP();
                    break;
                case 4:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }

        }
    }

    //metodo Matriz 1 que representa el primer piso del parqueo
    public void piso1() {

        //prefijar espacio de discapacitados
        S1[2][4] = "[E]";
        S1[1][4] = "[E]";
        S1[3][2] = "[E]";
        //prefijar espacio de directores
        S1[2][2] = "[D]";
        S1[1][3] = "[D]";
        //prefijar columnas
        S1[0][0] = "     ";
        S1[0][1] = "*1*";
        S1[0][2] = "*2*";
        S1[0][3] = "*3*";
        S1[0][4] = "*4*";
        S1[0][5] = "*5*";
        //prefijar filas
        S1[1][0] = "*1*";
        S1[2][0] = "*2*";
        S1[3][0] = "*3*";
        S1[4][0] = "*4*";

        //mostrar la matriz en tabla
        //intentar mostrar las cordenadas de cada fila y columna como viene en el ejemplo del profe 
        String mensaje = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                mensaje += S1[i][j] + "   ";

            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, "Piso numero 1:\n" + mensaje);

    }

    //metodo Matriz 2 que representa el segundo piso del parqueo
    public void piso2() {

        //prefijar espacio de discapacitados
        S2[4][2] = "[E]";
        S2[4][3] = "[E]";
        S2[1][4] = "[E]";
        //prefijar espacio de directores
        S2[3][3] = "[D]";
        S2[2][2] = "[D]";
        //prefijar columnas
        S2[0][0] = "     ";
        S2[0][1] = "*1*";
        S2[0][2] = "*2*";
        S2[0][3] = "*3*";
        S2[0][4] = "*4*";
        S2[0][5] = "*5*";
        //prefijar filas
        S2[1][0] = "*1*";
        S2[2][0] = "*2*";
        S2[3][0] = "*3*";
        S2[4][0] = "*4*";
        S2[5][0] = "*5*";

        //mostrar la matriz en tabla
        String mensaje = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mensaje += S2[i][j] + "   ";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, "Piso numero 2:\n" + mensaje);
    }

    //metodo Matriz 3 que representa el tercer piso del parqueo
    public void piso3() {

        //prefijar espacio de discapacitados
        S3[4][4] = "[E]";
        S3[5][2] = "[E]";
        S3[2][1] = "[E]";
        //prefijar espacio de directores
        S3[1][1] = "[D]";
        S3[5][4] = "[D]";
        //prefijar columnas Para coordenadas
        S3[0][0] = "     ";
        S3[0][1] = "*1*";
        S3[0][2] = "*2*";
        S3[0][3] = "*3*";
        S3[0][4] = "*4*";
        S3[0][5] = "*5*";
        //prefijar filas para coordenadas
        S3[1][0] = "*1*";
        S3[2][0] = "*2*";
        S3[3][0] = "*3*";
        S3[4][0] = "*4*";
        S3[5][0] = "*5*";
        S3[6][0] = "*6*";

        //mostrar la matriz en tabla
        String mensaje = "";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                mensaje += S3[i][j] + "   ";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, "Piso numero 3:\n" + mensaje);
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal:
    public boolean asignarEspacioParq() {

        String piso = JOptionPane.showInputDialog("Digite el piso en el que desea ocupar(S1,S2,S3): ");
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));

        switch (piso) {
            case "S1":
                if (S1[fila][columna] == "[O]") {
                    S1[fila][columna] = "[P]";
                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                }
                break;
            case "S2":
                if (S2[fila][columna] == "[O]") {
                    S2[fila][columna] = "[P]";
                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                }
                break;
            case "S3":
                if (S3[fila][columna] == "[O]") {
                    S3[fila][columna] = "[P]";
                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                }

                break;
            default:
                JOptionPane.showMessageDialog(null, "¡Piso elegido inexistente!");//no se porque no enseña el mensaje, posiblemente por el "null"

        }

        return true;
    }

    public boolean visualizarEspacio() {
        while (true) {
            int opcionPiso = Integer.parseInt(JOptionPane.showInputDialog("Que piso desea visualizar? \n"
                    + " 1. S1\n"
                    + " 2. S2\n"
                    + " 3. S3\n"
                    + " 4. Regresar"));

            switch (opcionPiso) {
                case 1:
                    piso1();
                    break;
                case 2:
                    piso2();
                    break;
                case 3:
                    piso3();
                    break;

            }
            if (opcionPiso == 4) {
                break;
            }
            if (opcionPiso > 4 || opcionPiso < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
                continue;
            }

        }

        return true;
    }

    public boolean liberarEspacioP() {
        String pisoLiberar = JOptionPane.showInputDialog("Digite el piso en el que desea liberar(S1,S2,S3): ");
        int filaVaciar = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
        int columnaVaciar = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));

        switch (pisoLiberar) {
            case "S1":
                if (S1[filaVaciar][columnaVaciar] == "[P]") {
                    S1[filaVaciar][columnaVaciar] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                }
                if (S1[filaVaciar][columnaVaciar] == "[O]") {
                    JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                }

                break;
            case "S2":
                if (S2[filaVaciar][columnaVaciar] == "[P]") {
                    S2[filaVaciar][columnaVaciar] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                }
                if (S2[filaVaciar][columnaVaciar] == "[O]") {
                    JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                }
                break;
            case "S3":
                if (S3[filaVaciar][columnaVaciar] == "[P]") {
                    S3[filaVaciar][columnaVaciar] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                }
                if (S3[filaVaciar][columnaVaciar] == "[O]") {
                    JOptionPane.showMessageDialog(null, "¡El espacio que elegiste ya estaba liberado!");

                } else {
                    JOptionPane.showMessageDialog(null, "¡No es permitido liberar este espacio!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "¡Piso elegido inexistente!");//no se porque no enseña el mensaje, posiblemente por el "null"

        }
        return true;
    }

}
