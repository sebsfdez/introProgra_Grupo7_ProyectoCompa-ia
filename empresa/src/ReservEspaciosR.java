
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

    public ReservEspaciosR(String charla, String capacitacion, String mesaPingP, String mesaBillar, String futbol, String basquet, String tenis) {
        this.charla = charla;
        this.capacitacion = capacitacion;
        this.mesaPingP = mesaPingP;
        this.mesaBillar = mesaBillar;
        this.futbol = futbol;
        this.basquet = basquet;
        this.tenis = tenis;
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
                    + " 2. Reservar mesa de ping pong\n"
                    + " 3. Reservar mesa de billar\n"
                    + " 4. Reservar cancha de futbol\n"
                    + " 5. Reservar cancha de basketball\n"
                    + " 6. Reservar cancha de tenis\n"
                    + " 7. Regresar al menu principal"));
            switch (opcionesRER) {
                case 1:
                    liberarEspacioR();
                    break;
                case 2:
                    reservaMesaPingPong();
                    break;
                case 3:
                    reservaMesaBillar();
                    break;
                case 4:
                    reservaCanchaFut();
                    break;
                case 5:
                    reservaCanchaBasket();
                    break;
                case 6:
                    reservaCanchaTenis();
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
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservaMesaPingPong() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservaMesaBillar() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservaCanchaFut() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservaCanchaFutboll() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservaCanchaBasket() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservaCanchaTenis() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
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
