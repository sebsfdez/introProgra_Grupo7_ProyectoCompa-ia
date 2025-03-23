/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Empleados {

    private String nombre;
    private int ID;

    public Empleados(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean agregar() {
        //meter codigo
        return agregar();//cambiar luego por un booleano que permita generar la accion
    }

    public boolean eliminar() {
        //meter codigo
        return eliminar();//cambiar luego por un booleano que permita generar la accion
    }

    public boolean consultar() {
        //meter codigo, a lo entendido para poder consultar la informacion que ha sido registrada
        return consultar();//cambiar luego por un booleano que permita generar la accion
    }

}
