
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
    private String rol;
    private int cantidadInicial = 10;//cantidad inicial
    private String empleados[][] = new String[cantidadInicial][3];
    private int contador = 0;//contador que sirve para verificar que hayan empleados registrados y el numero que se lleva actualmente

    //private String 
    public Empleados(String nombre, int ID, String almacenNombres, int almacenID, String rol) {
        this.nombre = nombre;
        this.ID = ID;
        this.rol = rol;

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
                    + "3. Mostrar empleados\n"
                    + "4. Buscar empleado\n"
                    + "5. Modificar informacion de empleado\n"
                    + "6. Consultar reservas de empleado\n"
                    + "7. Regresar al menu principal"));

            //Agregar llamados de modulos de empleados si hacen falta, etc
            switch (opcionesEmpleados) {
                case 1:
                    agregar();
                    //llamado de accion o metodo en donde debe ir funcionalidad
                    break;
                case 2:
                    eliminar();
                    //llamado de accion o metodo en donde debe ir funcionalidad
                    break;
                case 3:
                    mostrarEmpleados();
                    //llamado de accion o metodo en donde debe ir funcionalidad
                    break;
                case 4:
                    buscarEmpleado();
                    ///llamado de accion o metodo en donde debe ir funcionalidad
                    break;
                case 5:
                    modificar();
                    //llamado de accion o metodo en donde debe ir funcionalidad
                    break;
                case 6:
                    consultarReserva();
                    break;
                

            }
            if (opcionesEmpleados > 7 || opcionesEmpleados < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
            }
            if (opcionesEmpleados == 7) {
                break;
            }
        }
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public String[] agregar() {
    while (true) {
        if (contador >= empleados.length) {
            int nuevoTamanio = empleados.length * 2;
            String[][] arrayEmpleadoNuevo = new String[nuevoTamanio][3];
            for (int i = 0; i < empleados.length; i++) {
                arrayEmpleadoNuevo[i] = empleados[i];
            }
            empleados = arrayEmpleadoNuevo;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        String id = JOptionPane.showInputDialog("Ingrese ID:");
        String rol = JOptionPane.showInputDialog("Ingrese rol:");

        if (nombre.isEmpty() || id.isEmpty() || rol.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Datos erróneos. Vuelva a intentarlo.");
            return null;
        }

        empleados[contador][0] = nombre;
        empleados[contador][1] = id;
        empleados[contador][2] = rol;

        contador++;

        JOptionPane.showMessageDialog(null, "¡Agregado exitosamente! Total de empleados: " + contador);

        String salida = JOptionPane.showInputDialog("¿Desea agregar otro empleado? (si/no)");
        if (salida.equalsIgnoreCase("no")) {
            return new String[]{nombre, id, rol};  // Retornamos los datos del último empleado
        }
    }
}


    public boolean eliminar() {
        while (true) {
            int borrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del empleado que desea eliminar: "));
            if (borrar < contador) {
                empleados[borrar][0] = "";
                empleados[borrar][1] = "";
                empleados[borrar][2] = "";
                JOptionPane.showMessageDialog(null, "¡Empleado eliminado exitosamente!");
            } else if ("".equals(empleados[borrar][0]) && "".equals(empleados[borrar][1]) && "".equals(empleados[borrar][2])) {
            //deberia de salir este mensaje pero no logre hacerlo funcionar, no sale el mensjae
                JOptionPane.showMessageDialog(null, "¡El empleado que desea eliminar ya no existe!");
                return true;
            } else if (empleados[borrar][0] == null) {
                JOptionPane.showMessageDialog(null, "¡El empleado que quiere eliminar no existe!");
                return true;
            }

            String salida = JOptionPane.showInputDialog("Desea continuar eliminando?(si/no)");
            if (salida.equalsIgnoreCase("no")) {
                return true;
            }
        }

    }

    public boolean mostrarEmpleados() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "¡Aun no hay empleados registrados!");
        } else {
            String tabla = "";
            for (int j = 0; j < contador; j++) {//for para leer en tabla
                tabla += "(" + j + ")  " + empleados[j][0] + "   " + empleados[j][1] + "   " + empleados[j][2] + "\n";

            }
            JOptionPane.showMessageDialog(null, "Empleados actuales: \n" + tabla);

        }
        return true;
    }

    public boolean modificar() {
        //Verificamos si hay arreglos dentro del programa
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Aún no hay empleados registrados");
            return false;
        }
        //La recepcionista revisara en el sistema si hay un empleado con el ID ingresado
        String d = JOptionPane.showInputDialog("Digite el ID del empleado");

        //Se agrega la logica para encontrar el id del empleado
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (empleados[i][1].equals(d)) {
                encontrado = true;
                //Se muestra al empleado 
                JOptionPane.showMessageDialog(null, "Empleado encontrado..." + "\n"
                        + "Nombre: " + empleados[i][0] + "\n"
                        + "ID: " + empleados[i][1] + "\n"
                        + "Rol: " + empleados[i][2]);

                //Se solicita para modificar los datos del empleado
                empleados[i][0] = JOptionPane.showInputDialog("Digite el nuevo nombre: ", empleados[i][0]); //esta funcion me permite actualizar 
                empleados[i][1] = JOptionPane.showInputDialog("Digite el nuevo ID ", empleados[i][1]);          //de inmediato los datos del empleado
                empleados[i][2] = JOptionPane.showInputDialog("Digite el nuevo rol: ", empleados[i][2]);

                JOptionPane.showMessageDialog(null, "Datos actualizados...");
                break;

            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "¡Empleado no encontrado!");
            }

        }
        return true;
    }

    public boolean buscarEmpleado() {
        while (true) {
            //se piden los ID en bucle con su respectiva salida posterior de dar una respuesta
            String cedula = JOptionPane.showInputDialog("Ingrese el ID del empleado: ");

            // declarar una variable booleana falsa que sirva como validacion
            boolean encontrado = false;

            //for que lea los datos en el rando del contador que se lleva
            for (int i = 0; i < contador; i++) {
                if (empleados[i][1].equals(cedula)) {//si la posicion del ID concuerda con la cedula ingresada a buscar entonces mostrar todos los datos del empleado
                    JOptionPane.showMessageDialog(null, """
                                                        Empleado: 
                                                        Nombre: """ + empleados[i][0]
                                                        + "\nID: " + empleados[i][1]
                                                        + "\nRol: " + empleados[i][2]);
                    encontrado = true; //luego pone el encontrado a true para saber que fue encontrado
                    break;
                }
            }
            if (!encontrado) {//si el if en este caso se encuentra en false, significa que no fue encontrado, entonces:
                JOptionPane.showMessageDialog(null, "¡El empleado no ha sido encontrado!");
            }

            //salida
            String salida = JOptionPane.showInputDialog("Desea buscar otro empleado?(si/no)");
            if (salida.equalsIgnoreCase("no")) {
                return true;
            }
        }

    }

    public boolean consultarReserva() {
        JOptionPane.showMessageDialog(null, "funciona");//prueba
        return true;//cambiar luego por un booleano que permita generar la accion
    }

}
