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

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean asignarEspacioParq() {
        //meter codigo para asignar espacios en el parqueo
        return true;
    }

    public boolean visualizarEspacio() {
        return true;
    }

    public boolean liberarEspacioP() {

        return true;
    }

}
