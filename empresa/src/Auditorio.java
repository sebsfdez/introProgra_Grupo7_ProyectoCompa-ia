
import javax.swing.JOptionPane;

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

    public Auditorio(int capacidad, String charlas, String capacitaciones) {
        this.capacidad = capacidad;
        this.charlas = charlas;
        this.capacitaciones = capacitaciones;
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
                    + " 3. Disponibilidad\n"
                    + " 4. Modificar reserva\n"
                    + " 5. Lista de reservas\n"
                    + " 6. Eliminar reserva\n"
                    + " 7. Regresar al menu principal"));

            switch (opcionesAuditorio) {
                case 1:
                    liberarEspacio();
                    break;
                case 2:
                    reservar();
                    break;
                case 3:
                    disponible();
                    break;
                case 4:
                    modificarReserva();
                    break;
                case 5:
                    listaReservas();
                    break;
                case 6:
                    eliminarReservas();
                    break;

            }
            if (opcionesAuditorio > 7 || opcionesAuditorio < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesAuditorio == 7) {
                break;
            }
        }

    }

    public boolean liberarEspacio() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean reservar() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean disponible() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean modificarReserva() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean listaReservas() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean eliminarReservas() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }
}
