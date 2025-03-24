
import javax.swing.JOptionPane;

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
    public void mostrarOpcionesRER() {//RER: reserva de espacios recreativos
        while (true) {
            int opcionesRER = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *Reserva de espacios recreativos*\n"
                    + " 1. Liberar espacios\n"
                    + " 2. Reservar mesa de ping pong\n"
                    + " 3. Reservar mesa de billar\n"
                    + " 4. Regresar al menu principal"));
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

            }
            if (opcionesRER > 4 || opcionesRER < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesRER == 4) {
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

}
