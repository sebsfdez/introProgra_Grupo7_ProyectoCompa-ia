
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class ReservEspaciosR {

    private String canchaFut1 [][] = new String[7][3];
    private String canchaFut2 [][] = new String[7][3];
    private String canchaTenis1 [][] = new String [2][3];
    private String canchaTenis2 [][] = new String [2][3];
    private String canchaBasket [][] = new String [6][3];
    private String billar [][] = new String [2][3];
    private String pingPong [][] = new String [2][3];

    public ReservEspaciosR(String charla, String capacitacion, String mesaPingP, String mesaBillar, String futbol, String basquet, String tenis) {
        this.charla = charla;
        this.capacitacion = capacitacion;
        this.mesaPingP = mesaPingP;
        this.mesaBillar = mesaBillar;
        this.futbol = futbol;
        this.basquet = basquet;
        this.tenis = tenis;
        
        //rellenando cancha fut 1
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                canchaFut1[i][j] = "[O]";
            }
        }
        //rellenando cancha fut 2
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                canchaFut2[i][j] = "[O]";
            }
        }
        //rellenando cancha tenis 1
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                canchaTenis1[i][j] = "[O]"; 
            }
        }
        //rellenando cancha tenis 2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                canchaTenis2[i][j] = "[O]"; 
            }
        }
        //rellenando cancha Basket
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                canchaBasket[i][j] = "[O]";  
            }
        } 
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


    //opcion 4 reserva de espacios recreativos
    public void mostrarOpcionesRER() { //RER: reserva de espacios recreativos
        while (true) {
            int opcionesRER = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *Reserva de espacios recreativos*\n"
                    + " 1. Liberar espacios\n"
                    + " 2. Mesa de ping pong\n"
                    + " 3. Mesa de billar\n"
                    + " 4. Cancha de futbol\n"
                    + " 5. Cancha de basketball\n"
                    + " 6. Cancha de tenis\n"
                    + " 7. Regresar al menu principal"));
            switch (opcionesRER) {
                case 1:
                    liberarEspacioR();
                    break;
                case 2:
                    MesaPingPong();
                    break;
                case 3:
                    MesaBillar();
                    break;
                case 4:
                    CanchaFut();
                    break;
                case 5:
                    CanchaBasket();
                    break;
                case 6:
                    CanchaTenis();
                    break;

            }
            if (opcionesRER > 7 || opcionesRER < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesRER == 7) {
                break;
            }
        }
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean liberarEspacioR() {
        while (true) {
            int lugarLiberar = Integer.parseInt(JOptionPane.showInputDialog("¿Donde desea liberar espacio?\n"
                    + "1. Mesa ping pong\n"
                    + "2. Mesa billar\n"
                    + "3. Cancha de futbol\n"
                    + "4. Cancha de basketball\n"
                    + "5. Cancha de tenis\n"
                    + "6. Regresar"));

            switch (lugarLiberar) {
                case 1:
                    mesaPingPongLiberar();
                    break;
                case 2:
                    mesaBillarLiberar();
                    break;
                case 3:
                    canchaFutLiberar();
                    break;
                case 4:
                    canchaBasketLiberar();
                    break;
                case 5:
                   CanchaTenis();
                    break;

            }
            if (lugarLiberar > 6 || lugarLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (lugarLiberar == 6) {
                break;
            }
        }

        return true;
    }

    public boolean MesaPingPong() {
        //prefijar columnas array 1
        pingPong[0][0] = "     ";
        pingPong[0][1] = "*1*";
        pingPong[0][2] = "*2*";
        //prefijar filas array 1 
        pingPong[1][0] = "*1*";
      
        
        while (true) {
            int opcionesPingPong = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                    + "1. Reservar\n"
                    + "2. Visualizar espacios\n"
                    + "3. Regresar"));

            switch (opcionesPingPong) {
                case 1://Reserva
                    while (true) {
                        int mesaReserva = Integer.parseInt(JOptionPane.showInputDialog("Mesa de ping pong a reservar:\n"
                                + "1. Mesa ping pong\n"
                                + "2. Regresar"));
                        switch (mesaReserva) {
                            case 1://cancha 1
                                int filaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila que se encuentra: "));
                                int columnaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (pingPong[filaMesa][columnaMesa] == "[O]") {
                                    pingPong[filaMesa][columnaMesa] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                        }
                        if (mesaReserva > 2 || mesaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaReserva == 2) {
                            break;
                        }
                    }

                    break;
                case 2://visualizar
                    while (true) {
                        int mesaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("Mesa de ping pong a visualizar:\n"
                                + "1. Mesa Ping Pong\n"
                                + "2. Regresar"));
                        switch (mesaVisualizar) {
                            case 1:
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < 2; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios1 += pingPong[i][j] + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Mesa:\n"
                                        + mostrarEspacios1);
                                break;
                        }

                        if (mesaVisualizar > 2 || mesaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaVisualizar == 2) {
                            break;
                        }

                    }

                    break;

            }

            if (opcionesPingPong > 3 || opcionesPingPong < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesPingPong == 3) {
                break;
            }
        }

        return true;
    }

    public boolean MesaBillar() {
        //prefijar columnas array 1
        billar[0][0] = "     ";
        billar[0][1] = "*1*";
        billar[0][2] = "*2*";
        //prefijar filas array 1 
        billar[1][0] = "*1*";
        
        while (true) {
            int opcionesBillar = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                    + "1. Reservar\n"
                    + "2. Visualizar espacios\n"
                    + "3. Regresar"));

            switch (opcionesBillar) {
                case 1://Reserva
                    while (true) {
                        int mesaReserva = Integer.parseInt(JOptionPane.showInputDialog("Mesa de billar a reservar:\n"
                                + "1. Mesa de billar\n"
                                + "2. Regresar"));
                        switch (mesaReserva) {
                            case 1://cancha 1
                                int filaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (billar[filaMesa][columnaMesa] == "[O]") {
                                    billar[filaMesa][columnaMesa] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!\n");

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                        }
                        if (mesaReserva > 3 || mesaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaReserva == 2) {
                            break;
                        }
                    }

                    break;
                case 2://visualizar
                    while (true) {
                        int mesaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("Mesa de billar a visualizar:\n"
                                + "1. Mesa de billar\n"
                                + "2. Regresar"));
                        switch (mesaVisualizar) {
                            case 1:
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < 2; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios1 += billar[i][j] + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Mesa de billar:\n"
                                        + mostrarEspacios1);
                                break;
                        }

                        if (mesaVisualizar > 2 || mesaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (mesaVisualizar == 2) {
                            break;
                        }

                    }

                    break;

            }

            if (opcionesBillar > 3 || opcionesBillar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesBillar == 3) {
                break;
            }
        }

        return true;
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
                                int filaFut1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaFut1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (canchaFut1[filaFut1][columnaFut1] == "[O]") {
                                    canchaFut1[filaFut1][columnaFut1] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                            case 2://cancha 2
                                int filaFut2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaFut2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (canchaFut2[filaFut2][columnaFut2] == "[O]") {
                                    canchaFut2[filaFut2][columnaFut2] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
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
                                for (int i = 0; i < 7; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios1 += canchaFut1[i][j] + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Cancha numero 1:\n"
                                        + mostrarEspacios1);
                                break;
                            case 2:
                                String mostrarEspacios2 = "";
                                for (int i = 0; i < 7; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios2 += canchaFut2[i][j] + "   ";
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

    public boolean CanchaBasket() {
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
                                int filaBasket = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaBasket = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (canchaBasket[filaBasket][columnaBasket] == "[O]") {
                                    canchaBasket[filaBasket][columnaBasket] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

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
                                + "1. Cancha numero 1\n"
                                + "2. Regresar"));
                        switch (canchaVisualizar) {
                            case 1:
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < 6; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios1 += canchaBasket[i][j] + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Cancha:\n"
                                        + mostrarEspacios1);
                                break;
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

        return true; 
    }

    public boolean CanchaTenis() {
        //prefijar columnas array 1
        canchaTenis1[0][0] = "     ";
        canchaTenis1[0][1] = "*1*";
        canchaTenis1[0][2] = "*2";

        //prefijar filas array 1 
        canchaTenis1[1][0] = "*1*";
        
       

        //prefijar columnas array 2
        canchaTenis2[0][0] = "     ";
        canchaTenis2[0][1] = "*1*";
        canchaTenis2[0][2] = "*2";

        //prefijar filas array 2
        canchaTenis2[1][0] = "*1*";
        
      
        while (true) {
            int opcionesTenis = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                    + "1. Reservar\n"
                    + "2. Visualizar espacios\n"
                    + "3. Regresar"));

            switch (opcionesTenis) {
                case 1://Reserva
                    while (true) {
                        int canchaReserva = Integer.parseInt(JOptionPane.showInputDialog("Cual cancha desea reservar:\n"
                                + "1. Cancha numero 1\n"
                                + "2. Cancha numero 2\n"
                                + "3. Regresar"));
                        switch (canchaReserva) {
                            case 1://cancha 1
                                int filaTenis1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaTenis1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (canchaTenis1[filaTenis1][columnaTenis1] == "[O]") {
                                    canchaTenis1[filaTenis1][columnaTenis1] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                            case 2://cancha 2
                                int filaTenis2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaTenis2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (canchaTenis2[filaTenis2][columnaTenis2] == "[O]") {
                                    canchaTenis2[filaTenis2][columnaTenis2] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
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
                                for (int i = 0; i < 2; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios1 += canchaTenis1[i][j] + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Cancha numero 1:\n"
                                        + mostrarEspacios1);
                                break;
                            case 2:
                                String mostrarEspacios2 = "";
                                for (int i = 0; i < 2; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios2 += canchaTenis2[i][j] + "   ";
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

            if (opcionesTenis > 3 || opcionesTenis < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesTenis == 3) {
                break;
            }
        }

        return true;
    }

    //liberar de cada una de las opciones
    public void canchaFutLiberar() {
        while (true) {
            int canchaLiberar = Integer.parseInt(JOptionPane.showInputDialog("Cual cancha desea liberar:\n"
                    + "1. Cancha numero 1\n"
                    + "2. Cancha numero 2\n"
                    + "3. Regresar"));
            switch (canchaLiberar) {
                case 1://cancha 1
                    int filaFut1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaFut1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (canchaFut1[filaFut1][columnaFut1] == "[P]") {
                        canchaFut1[filaFut1][columnaFut1] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (canchaFut1[filaFut1][columnaFut1] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;
                case 2://cancha 2
                    int filaFut2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaFut2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (canchaFut2[filaFut2][columnaFut2] == "[P]") {
                        canchaFut2[filaFut2][columnaFut2] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (canchaFut2[filaFut2][columnaFut2] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
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
    public void canchaBasketLiberar(){
        while (true) {
            int canchaLiberar = Integer.parseInt(JOptionPane.showInputDialog("Cancha de basket a liberar:\n"
                    + "1. Cancha numero 1\n"
                    + "2. Regresar"));
            switch (canchaLiberar) {
                case 1://cancha 1
                    int filaBasket = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaBasket = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (canchaBasket[filaBasket][columnaBasket] == "[P]") {
                        canchaBasket[filaBasket][columnaBasket] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (canchaBasket[filaBasket][columnaBasket] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;
            }
            if (canchaLiberar > 2 || canchaLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (canchaLiberar == 2) {
                break;
            }
        }
    }
    public void canchaTenisLiberar(){
        while (true) {
            int canchaLiberar = Integer.parseInt(JOptionPane.showInputDialog("Cual cancha desea liberar:\n"
                    + "1. Cancha numero 1\n"
                    + "2. Cancha numero 2\n"
                    + "3. Regresar"));
            switch (canchaLiberar) {
                case 1://cancha 1
                    int filaTenis1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaTenis1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (canchaTenis1[filaTenis1][columnaTenis1] == "[P]") {
                        canchaTenis1[filaTenis1][columnaTenis1] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (canchaTenis1[filaTenis1][columnaTenis1] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;
                case 2://cancha 2
                    int filaTenis2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaTenis2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (canchaTenis2[filaTenis2][columnaTenis2] == "[P]") {
                        canchaTenis2[filaTenis2][columnaTenis2] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (canchaTenis2[filaTenis2][columnaTenis2] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
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
    public void mesaPingPongLiberar(){
        while (true) {
            int mesaLiberar = Integer.parseInt(JOptionPane.showInputDialog("Mesa de Ping Pong a liberar:\n"
                    + "1. Mesa Ping Pong\n"
                    + "2. Regresar"));
            switch (mesaLiberar) {
                case 1://cancha 1
                    int filaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (pingPong[filaMesa][columnaMesa] == "[P]") {
                        pingPong[filaMesa][columnaMesa] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (pingPong[filaMesa][columnaMesa] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;
            }
            if (mesaLiberar > 2 || mesaLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (mesaLiberar == 2) {
                break;
            }
        }
    }
    public void mesaBillarLiberar(){
    while (true) {
            int mesaLiberar = Integer.parseInt(JOptionPane.showInputDialog("Mesa de billar a liberar:\n"
                    + "1. Mesa de billar\n"
                    + "2. Regresar"));
            switch (mesaLiberar) {
                case 1://cancha 1
                    int filaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaMesa = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (billar[filaMesa][columnaMesa] == "[P]") {
                        billar[filaMesa][columnaMesa] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (billar[filaMesa][columnaMesa] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;
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


    /*
    //Metodo para crear la interfaz Grafica
     public void crearInterfaz() {
        JFrame frame = new JFrame("Reserva de Espacios Recreativos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel para contener los botones
        JPanel panel = new JPanel();
        frame.add(panel);
        colocarComponentes(panel);

        frame.setLocationRelativeTo(null);  // Centrar la ventana
        frame.setVisible(true);
        
     }
     
     
     // Método para agregar los botones a la interfaz
    private void colocarComponentes(JPanel panel) {
        panel.setLayout(null); // Usar un layout nulo para colocar los botones manualmente

        // Crear los botones
        JButton btnLiberarEspacio = new JButton("Liberar Espacios");
        btnLiberarEspacio.setBounds(100, 20, 200, 30);
        panel.add(btnLiberarEspacio);

        JButton btnReservaPingPong = new JButton("Reservar Mesa Ping Pong");
        btnReservaPingPong.setBounds(100, 60, 200, 30);
        panel.add(btnReservaPingPong);

        JButton btnReservaBillar = new JButton("Reservar Mesa Billar");
        btnReservaBillar.setBounds(100, 100, 200, 30);
        panel.add(btnReservaBillar);

        JButton btnReservaCanchaFutbol = new JButton("Reservar Cancha Futbol");
        btnReservaCanchaFutbol.setBounds(100, 140, 200, 30);
        panel.add(btnReservaCanchaFutbol);

        JButton btnReservaCanchaBasket = new JButton("Reservar Cancha Basket");
        btnReservaCanchaBasket.setBounds(100, 180, 200, 30);
        panel.add(btnReservaCanchaBasket);

        JButton btnReservaCanchaTenis = new JButton("Reservar Cancha Tenis");
        btnReservaCanchaTenis.setBounds(100, 220, 200, 30);
        panel.add(btnReservaCanchaTenis);

        JButton btnSalir = new JButton("Regresar al Menu Principal");
        btnSalir.setBounds(100, 260, 200, 30);
        panel.add(btnSalir);
        
        // Añadir los ActionListeners para cada botón
        btnLiberarEspacio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liberarEspacioR();
            }
        });

        btnReservaPingPong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservaMesaPingPong();
            }
        });

        btnReservaBillar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservaMesaBillar();
            }
        });

        btnReservaCanchaFutbol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservaCanchaFutboll();
            }
        });

        btnReservaCanchaBasket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservaCanchaBasket();
            }
        });

        btnReservaCanchaTenis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservaCanchaTenis();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Regresando al menu principal...");
                System.exit(0);  // Aquí puedes hacer lo que desees con el cierre de la ventana
            }
        });
        
    }*/
}
