
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
        Empleados empleados = new Empleados("", 0);
        CubiculosPriv cubiculosPriv = new CubiculosPriv("");
        CubiculosPub cubiculosPub = new CubiculosPub("");
        Parqueo parqueo = new Parqueo("", "", "", "");
        ReservEspaciosR reservEspaciosR = new ReservEspaciosR("", "", "", "", "", "", "");
        SalaDeReunion salaDeReunion = new SalaDeReunion("", "", 0);

        JOptionPane.showMessageDialog(null, "¡Bienvenido!");
        while (true) {
            //menu principal que muestre al recepcionista de la empresa

            int opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n"
                    + " 1. Empleados\n "
                    + "2. Cubiculos\n "
                    + "3. Parqueo\n "
                    + "4. Reserva de espacios recreativos\n "
                    + "5. Sala de reuniones\n "
                    + "6. Salir"));

            switch (opciones) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Elegiste la opcion empleados:");
                    //Agregar llamados de modulos de empleados, etc
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Elegiste la opcion Cubiculos:");
                    //Agregar llamados de modulos de cubiculos, etc
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Elegiste la opcion Parqueo:");
                    //Agregar llamados de modulos de parqueo, etc
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Elegiste la opcion Reserva de espacios recreativos:");
                    //Agregar llamados de modulos ReserEspaciosR, etc
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Elegiste la opcion Sala de reuniones:");
                    //Agregar llamados de modulos SalaDeReunion, etc
                    break;

            }
            if (opciones > 6 || opciones < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }

            if (opciones == 6) {
                JOptionPane.showMessageDialog(null, "Elegiste salir");
                break;
            }
        }
    }

}
