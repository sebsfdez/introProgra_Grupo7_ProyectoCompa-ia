

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ReservEspaciosR {
    
    MesasBillarYPingPong mesa = new MesasBillarYPingPong();
    CanchaBasket canchaB = new CanchaBasket();
    CanchaFut canchaF = new CanchaFut();
    CanchaTenis canchaT = new CanchaTenis();

    

    //opcion 4 reserva de espacios recreativos
    public void mostrarOpcionesRER() { //RER: reserva de espacios recreativos
        while (true) {
            int opcionesRER = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *Reserva de espacios recreativos*\n"
                    + " 1. Liberar espacios\n"
                    + " 2. Mesa de ping pong\n"
                    + " 3. Mesa de billar\n"
                    + " 4. Cancha de futbol\n"
                    + " 5. Cancha de basketball\n"
                    + " 6. Cancha de tenis\n"
                    + " 7. Regresar al menu principal"));
            switch (opcionesRER) {
                case 1:
                    liberarEspacioR();
                    break;

                case 2:
                    mesa.MesaPingPong();
                    break;

                case 3:
                    mesa.MesaBillar();
                    break;
                case 4:
                    canchaF.CanchaFut();
                    break;
                case 5:
                    canchaB.CanchaBasket();
                    break;

                case 6:
                    canchaT.CanchaTenis();
                    break;

            }
            if (opcionesRER > 7 || opcionesRER < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesRER == 7) {
                break;
            }
        }
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean liberarEspacioR() {
        while (true) {
            int lugarLiberar = Integer.parseInt(JOptionPane.showInputDialog("¿Donde desea liberar espacio?\n"
                    + "1. Mesa ping pong\n"
                    + "2. Mesa billar\n"
                    + "3. Cancha de futbol\n"
                    + "4. Cancha de basketball\n"
                    + "5. Cancha de tenis\n"
                    + "6. Regresar"));

            switch (lugarLiberar) {
                case 1:
                    mesa.mesaPingPongLiberar();
                    break;
                case 2:
                    mesa.mesaBillarLiberar();
                    break;
                case 3:
                    canchaF.canchaFutLiberar();
                    break;
                case 4:
                    canchaB.canchaBasketLiberar();
                    break;
                case 5:
                    canchaT.canchaTenisLiberar();
                    break;

            }
            if (lugarLiberar > 6 || lugarLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (lugarLiberar == 6) {
                break;
            }
        }

        return true;
    }
    
    
//opciones del menu liberar
  
    
    
}


