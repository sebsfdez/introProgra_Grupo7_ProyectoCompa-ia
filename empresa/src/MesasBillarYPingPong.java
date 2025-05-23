
import javax.swing.JOptionPane;

public class MesasBillarYPingPong {

    //Atributos
    String billar[][] = new String[2][3];
    String pingPong[][] = new String[2][3];
    Empleados empleados1 = new Empleados("", 0, "", 0, "");

    //Constructor
    public MesasBillarYPingPong() {

        //Rellenando mesa de Ping Pong
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                pingPong[i][j] = "[O]";
            }
        }
        //Rellenando mesa de billar
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                billar[i][j] = "[O]";
            }
        }
    }

    //Get y Set
    public String[][] getBillar() {
        return billar;
    }

    public void setBillar(String[][] billar) {
        this.billar = billar;
    }

    public String[][] getPingPong() {
        return pingPong;
    }

    public void setPingPong(String[][] pingPong) {
        this.pingPong = pingPong;
    }

    public static void mesaPingPong() {

    }

    /*Metodos para visualizar y reservar espacios en las mesas
    de Ping Pong y Billar
     */
    public void MesaPingPong() {
        //prefijar columnas array 1
        pingPong[0][0] = "     ";
        pingPong[0][1] = "*1*";
        pingPong[0][2] = "*2*";
        //prefijar filas array 1 
        pingPong[1][0] = "*1*";

        while (true) {
            int opcionesPingPong = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                Opciones: 
                                                                                1. Reservar
                                                                                2. Visualizar espacios
                                                                                3. Regresar"""));

            switch (opcionesPingPong) {
                case 1 -> {
                    //Reserva
                    while (true) {
                        int mesaReserva = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                       Mesa de ping pong a reservar:
                                                                                       1. Mesa ping pong
                                                                                       2. Regresar"""));
                        switch (mesaReserva) {
                            case 1 -> {
                                //cancha 1
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila: "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna: "));

                                if ("[O]".equals(pingPong[fila][columna])) {

                                    String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                    if (datosEmpleado != null) {
                                        String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                        pingPong[fila][columna] = resumenEmpleado;
                                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                            }
                        }
                        if (mesaReserva > 2 || mesaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaReserva == 2) {
                            break;
                        }
                    }
                }
                case 2 -> {
                    //visualizar
                    while (true) {
                        int mesaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                  Mesa de ping pong a visualizar:
                                                                                                                  1. Mesa Ping Pong
                                                                                                                  2. Regresar"""));
                        switch (mesaVisualizar) {
                            case 1 -> {
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < pingPong.length; i++) {
                                    for (int j = 0; j < pingPong[i].length; j++) {
                                        mostrarEspacios1 += "[" + pingPong[i][j] + "]  ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Mesa:\n"
                                        + mostrarEspacios1);
                            }
                        }

                        if (mesaVisualizar > 2 || mesaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaVisualizar == 2) {
                            break;
                        }

                    }
                }

            }

            if (opcionesPingPong > 3 || opcionesPingPong < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesPingPong == 3) {
                break;
            }
        }

    }

    public void MesaBillar() {
        //prefijar columnas array 1
        billar[0][0] = "     ";
        billar[0][1] = "*1*";
        billar[0][2] = "*2*";
        //prefijar filas array 1 
        billar[1][0] = "*1*";

        while (true) {
            int opcionesBillar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                              Opciones: 
                                                                              1. Reservar
                                                                              2. Visualizar espacios
                                                                              3. Regresar"""));

            switch (opcionesBillar) {
                case 1 -> {
                    //Reserva
                    while (true) {
                        int mesaReserva = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                       Mesa de billar a reservar:
                                                                                       1. Mesa de billar
                                                                                       2. Regresar"""));
                        switch (mesaReserva) {
                            case 1 -> {
                                //cancha 1
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila: "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna: "));

                                if ("[O]".equals(billar[fila][columna])) {

                                    String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                    if (datosEmpleado != null) {
                                        String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                        billar[fila][columna] = resumenEmpleado;
                                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                            }
                        }
                        if (mesaReserva > 3 || mesaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaReserva == 2) {
                            break;
                        }
                    }
                }
                case 2 -> {
                    //visualizar
                    while (true) {
                        int mesaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                          Mesa de billar a visualizar:
                                                                                          1. Mesa de billar
                                                                                          2. Regresar"""));
                        switch (mesaVisualizar) {
                            case 1 -> {
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < billar.length; i++) {
                                    for (int j = 0; j < billar[i].length; j++) {
                                        mostrarEspacios1 += "[" + billar[i][j] + "]  ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Mesa de billar:\n"
                                        + mostrarEspacios1);
                            }
                        }

                        if (mesaVisualizar > 2 || mesaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaVisualizar == 2) {
                            break;
                        }

                    }
                }

            }

            if (opcionesBillar > 3 || opcionesBillar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesBillar == 3) {
                break;
            }
        }

    }

    //Metodos para liberar espacios en las mesas ping pong y billar
    public void mesaPingPongLiberar() {
        while (true) {
            int mesaLiberar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                           Mesa de Ping Pong a liberar:
                                                                           1. Mesa Ping Pong
                                                                           2. Regresar"""));
            switch (mesaLiberar) {
                case 1 -> {
                    //cancha 1
                    int filaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 1): "));
                    int columnaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));
                    if (filaMesa < 1 || filaMesa > 1 || columnaMesa < 1 || columnaMesa > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }
                    String espacio = pingPong[filaMesa][columnaMesa];
                    if (espacio.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        pingPong[filaMesa][columnaMesa] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    }
                    break;

                }
            }
            if (mesaLiberar > 2 || mesaLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (mesaLiberar == 2) {
                break;
            }
        }
    }

    public void mesaBillarLiberar() {
        while (true) {
            int mesaLiberar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                           Mesa de billar a liberar:
                                                                           1. Mesa de billar
                                                                           2. Regresar"""));
            switch (mesaLiberar) {
                case 1 -> {
                    //cancha 1
                    int filaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 1): "));
                    int columnaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));
                    if (filaMesa < 1 || filaMesa > 1 || columnaMesa < 1 || columnaMesa > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }
                    String espacio = billar[filaMesa][columnaMesa];
                    if (espacio.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        billar[filaMesa][columnaMesa] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    }
                    break;

                }
            }
            if (mesaLiberar > 2 || mesaLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (mesaLiberar == 2) {
                break;
            }
        }
    }
}
