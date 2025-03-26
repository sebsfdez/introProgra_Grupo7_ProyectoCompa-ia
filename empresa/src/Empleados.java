
import javax.swing.JOptionPane;

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

    //opcion 1 la cual es llamada en el main:
    public void mostrarOpcionesEmpleados() {
        while (true) {
            //opciones mostradas
            int opcionesEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *empleados* | Que deseas hacer?\n"
                    + "1. Agregar\n"
                    + "2. Eliminar\n"
                    + "3. Consultar\n"
                    + "4. Regresar al menu principal"));

            //Agregar llamados de modulos de empleados si hacen falta, etc
            switch (opcionesEmpleados) {
                case 1:
                    agregar();
                    //meter el codigo de funcionalidad
                    break;
                case 2:
                    eliminar();
                    //meter el codigo de funcionalidad
                    break;
                case 3:
                    consultar();
                    //meter el codigo de funcionalidad
                    break;

            }
            if (opcionesEmpleados > 4 || opcionesEmpleados < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
            }
            if (opcionesEmpleados == 4) {
                break;
            }
        }
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean agregar() {
        //meter codigo
        JOptionPane.showMessageDialog(null, "funciona");//prueba
        return true;//cambiar luego por un booleano que permita generar la accion
    }

    public boolean eliminar() {
        //meter codigo
        JOptionPane.showMessageDialog(null, "funciona");//prueba
        return true;//cambiar luego por un booleano que permita generar la accion
    }

    public boolean consultar() {
        //meter codigo, a lo entendido para poder consultar la informacion que ha sido registrada
        JOptionPane.showMessageDialog(null, "funciona");//prueba
        return true;//cambiar luego por un booleano que permita generar la accion
    }

}
