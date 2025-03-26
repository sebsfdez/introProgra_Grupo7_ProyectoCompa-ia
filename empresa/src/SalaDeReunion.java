
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

    public SalaDeReunion(String reunionIntern, String reunionCliente, int capacidad) {
        this.reunionIntern = reunionIntern;
        this.reunionCliente = reunionCliente;
        this.capacidad = capacidad;
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
                    + " 3. Regresar al menu principal"));

            switch (opcionesSalaDeReuniones) {
                case 1:
                    asignarEspacioReunion();
                    break;
                case 2:
                    liberarEspacioSR();
                    break;

            }
            if (opcionesSalaDeReuniones > 3 || opcionesSalaDeReuniones < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesSalaDeReuniones == 3) {
                break;
            }
        }

    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean asignarEspacioReunion() {
        //asignacion de espacios en la reunion
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean liberarEspacioSR() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;

    }

}
