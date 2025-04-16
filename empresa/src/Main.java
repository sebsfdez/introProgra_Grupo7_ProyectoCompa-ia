
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //conexion con constructores
        Empleados empleados = new Empleados("", 0, "", 0, "");
        Cubiculos cubiculos = new Cubiculos("", "");
        Parqueo parqueo = new Parqueo("", "", "", "");
        ReservEspaciosR reservEspaciosR = new ReservEspaciosR();
        SalaDeReunion salaDeReunion = new SalaDeReunion("", "", 0);
        Auditorio auditorio = new Auditorio(0, "", "");

        JOptionPane.showMessageDialog(null, "¡Bienvenido!");

        while (true) {
            try {
                //llamando el metodo de opciones principales
                int opciones = mostrarOpcionesPrincipales();

                //Agregar llamados de modulos de cubiculos si hacen falta, etc            
                switch (opciones) {
                    case 1:
                        //Llamado de opciones por hacer en opcion empleados
                        empleados.mostrarOpcionesEmpleados();
                        break;

                    case 2:
                        //llamado de opciones por hacer en opcion cubiculos
                        cubiculos.mostrarOpcionesCubiculos();
                        break;
                    case 3:
                        parqueo.mostrarOpcionesParqueo();
                        //Agregar llamados de modulos de por si hacen falta, etc
                        break;
                    case 4:
                        reservEspaciosR.mostrarOpcionesRER();
                        //Agregar llamados de modulos ReserEspaciosR si hacen falta, etc
                        break;
                    case 5:
                        salaDeReunion.mostrarOpcionesReuniones();
                        //Agregar llamados de modulos SalaDeReunion si hacen falta, etc
                        break;
                    case 6:
                        auditorio.mostrarOpcionesAuditorio();
                        //Agregar llamados de modulos auditorio si hacen falta, etc
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Elejiste *salir*");
                        return;

                }
                if (opciones > 7 || opciones < 1) {
                    JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }

        }

    }

    //metodo de opciones para poderlo llamar en otras clases
    public static int mostrarOpcionesPrincipales() {
        //menu principal que muestre al recepcionista de la empresa

        return Integer.parseInt(JOptionPane.showInputDialog("Menu principal:\n"
                + " 1. Empleados\n "
                + "2. Cubiculos\n "
                + "3. Parqueo\n "
                + "4. Reserva de espacios recreativos\n "
                + "5. Sala de reuniones\n "
                + "6. Auditorio\n "
                + "7. Salir"));
    }

  
   
}