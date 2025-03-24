
import javax.swing.JOptionPane;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    public Parqueo(String espacioOcupado, String espacioLibre, String reservado, String discapacitados) {
        this.espacioOcupado = espacioOcupado;
        this.espacioLibre = espacioLibre;
        this.reservado = reservado;
        this.discapacitados = discapacitados;
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
        String S1[][] = new String[4][5];

        //llenar inicialmente vacios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                S1[i][j] = "O";
            }
        }
        //prefijar espacio de discapacitados
        S1[2][4] = "E";
        S1[1][4] = "E";
        S1[3][2] = "E";
        //prefijar espacio de directores
        S1[2][2] = "D";
        S1[1][3] = "D";

        //mostrar la matriz en tabla
        String mensaje = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                mensaje += S1[i][j] + "   ";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, "Piso numero 1:\n" + mensaje);

    }

    //metodo Matriz 2 que representa el segundo piso del parqueo
    public void piso2() {
        String S2[][] = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                S2[i][j] = "O";

            }
        }
        //prefijar espacio de discapacitados
        S2[4][2] = "E";
        S2[4][3] = "E";
        S2[1][4] = "E";
        //prefijar espacio de directores
        S2[3][3] = "D";
        S2[2][2] = "D";

        //mostrar la matriz en tabla
        String mensaje = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mensaje += S2[i][j] + "   ";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, "Piso numero 2:\n" + mensaje);
    }

    //metodo Matriz 3 que representa el tercer piso del parqueo
    public void piso3() {
        String S3[][] = new String[6][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                S3[i][j] = "O";

            }
        }

        //prefijar espacio de discapacitados
        S3[4][4] = "E";
        S3[5][2] = "E";
        S3[2][1] = "E";
        //prefijar espacio de directores
        S3[1][1] = "D";
        S3[5][4] = "D";

        //mostrar la matriz en tabla
        String mensaje = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                mensaje += S3[i][j] + "   ";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, "Piso numero 3:\n" + mensaje);
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean asignarEspacioParq() {
        
        String piso = JOptionPane.showInputDialog("Digite el piso al que desea acceder(S1,S2,S3): ");
        String espacio = JOptionPane.showInputDialog("Digite el espacio que desea ocupar: ");
        
        switch (piso) {
            case "S1":
                
                break;
            case "S2":
                
                break;
            case "S3":
                //S3[][]=espacio;//da error, pero la idea es conforme en 
                //la String espacio se ingrese una cordenada va a ir rellenando la matriz
                break;
            default:
                throw new AssertionError();
        }
        
        
        return true;
    }

    public boolean visualizarEspacio() {
        while (true) {
            String opcionPiso = JOptionPane.showInputDialog("Que piso desea visualizar? \nS1\nS2\nS3\nRegresar");

            switch (opcionPiso) {
                case "S1":
                    piso1();
                    break;
                case "S2":
                    piso2();
                    break;
                case "S3":
                    piso3();
                    break;

            }
            if (opcionPiso.equalsIgnoreCase("Regresar")) {
                break;
            }
            if (opcionPiso == "") {//verificar esto que no funciona
                JOptionPane.showMessageDialog(null, "¡Piso elegido inexistente!");//no se porque no enseña el mensaje, posiblemente por el "null"
                continue;
            }

        }

        return true;
    }

    public boolean liberarEspacioP() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

}
