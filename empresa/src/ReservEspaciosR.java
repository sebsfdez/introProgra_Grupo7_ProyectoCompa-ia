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
                    
                    break;

                case 2:
                    PingPong();
                    break;

                case 3:
                    MesaBillar();
                    break;
                case 4:
                    CanchaFut();
                    break;
                case 5:
                    CanchaBasket();
                    break;

                case 6:
                    CanchaTenis();
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
                    mesaPingPongLiberar();
                    break;
                case 2:
                    mesaBillarLiberar();
                    break;
                case 3:
                    canchaFutLiberar();
                    break;
                case 4:
                    canchaBasketLiberar();
                    break;
                case 5:
                    canchaTenisLiberar();
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
    private boolean mesaPingPongLiberar() {
        mesa.mesaPingPongLiberar();
        return true;
    }

    private void mesaBillarLiberar() {
        mesa.mesaBillarLiberar();
    }

    private void canchaFutLiberar() {
        canchaF.canchaFutLiberar();
    }

    private void canchaBasketLiberar() {
      canchaB.canchaBasketLiberar();
    }

    private void canchaTenisLiberar() {
      canchaT.canchaTenisLiberar();
    }
    
    //Opciones del menu
    private void PingPong() {
       mesa.MesaPingPong();
    }

    private void MesaBillar() {
        mesa.MesaBillar();
    }

    private void CanchaTenis() {
        canchaT.CanchaTenis();
    }

    private void CanchaFut() {
        canchaF.CanchaFut();
    }

    private void CanchaBasket() {
        canchaB.CanchaBasket();
    }
}
