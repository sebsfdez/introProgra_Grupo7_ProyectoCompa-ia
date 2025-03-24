
import javax.swing.JOptionPane;

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

            }
            if (opcionesParqueo > 4 || opcionesParqueo < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesParqueo == 4) {
                break;
            }
        }
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean asignarEspacioParq() {
        //meter codigo para asignar espacios en el parqueo
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean visualizarEspacio() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean liberarEspacioP() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

}
