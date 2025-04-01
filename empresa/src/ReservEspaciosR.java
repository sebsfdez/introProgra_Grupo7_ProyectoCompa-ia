
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

    private String charla;
    private String capacitacion;
    private String mesaPingP;
    private String mesaBillar;
    private String futbol;
    private String basquet;
    private String tenis;
    private String canchaFut1 [][] = new String[7][3];
    private String canchaFut2 [][] = new String[7][3];

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
    }

    public String getCharla() {
        return charla;
    }

    public void setCharla(String charla) {
        this.charla = charla;
    }

    public String getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    public String getMesaPingP() {
        return mesaPingP;
    }

    public void setMesaPingP(String mesaPingP) {
        this.mesaPingP = mesaPingP;
    }

    public String getMesaBillar() {
        return mesaBillar;
    }

    public void setMesaBillar(String mesaBillar) {
        this.mesaBillar = mesaBillar;
    }

    public String getFutbol() {
        return futbol;
    }

    public void setFutbol(String futbol) {
        this.futbol = futbol;
    }

    public String getBasquet() {
        return basquet;
    }

    public void setBasquet(String basquet) {
        this.basquet = basquet;
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
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
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean MesaBillar() {
        JOptionPane.showMessageDialog(null, "funciona");
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
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean CanchaTenis() {
        JOptionPane.showMessageDialog(null, "funciona");
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
    
    }
    public void canchaTenisLiberar(){
    
    }
    public void mesaPingPongLiberar(){
    
    }
    public void mesaBillarLiberar(){
    
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
