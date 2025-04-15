
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class CanchaTenis {
    
    //Atributos
    private String canchaTenis1 [][] = new String [2][3];
    private String canchaTenis2 [][] = new String [2][3];
    Empleados empleados1 = new Empleados("", 0, "", 0, "");
    

    //Contructor
    public CanchaTenis() {
        //rellenando las canchas de tenis
        for (int i = 0; i < canchaTenis1.length; i++) {
            for (int j = 0; j < canchaTenis1[i].length; j++) {
             canchaTenis1[i][j] = "[O]";
             canchaTenis2[i][j] = "[O]";
            }
        }

    }
    
    //Get, Set.
    public String[][] getCanchaTenis1() {
        return canchaTenis1;
    }

    public void setCanchaTenis1(String[][] canchaTenis1) {
        this.canchaTenis1 = canchaTenis1;
    }

    public String[][] getCanchaTenis2() {
        return canchaTenis2;
    }

    public void setCanchaTenis2(String[][] canchaTenis2) {
        this.canchaTenis2 = canchaTenis2;
    }
    
    
    //Metodo de Reservar y visualizar la cancha de tenis
    public boolean CanchaTenis() {
       //prefijar columnas array 1
        canchaTenis1[0][0] = "     ";
        canchaTenis1[0][1] = "*1*";
        canchaTenis1[0][2] = "*2";

        //prefijar filas array 1 
        canchaTenis1[1][0] = "*1*";
        
       

        //prefijar columnas array 2
        canchaTenis2[0][0] = "     ";
        canchaTenis2[0][1] = "*1*";
        canchaTenis2[0][2] = "*2";

        //prefijar filas array 2
        canchaTenis2[1][0] = "*1*";
        
      
        while (true) {
            int opcionesTenis = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                             Opciones: 
                                                                             1. Reservar
                                                                             2. Visualizar espacios
                                                                             3. Regresar"""));

            switch (opcionesTenis) {
                

                case 1 -> {
                    //Reserva
                    while (true) {
                        int canchaReserva = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                 Cual cancha desea reservar:
                                                                                                                 1. Cancha numero 1
                                                                                                                 2. Cancha numero 2
                                                                                                                 3. Regresar"""));
                        switch (canchaReserva) {
                            case 1 -> {
                                //cancha 1
                               int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila: "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna: "));

                             if ("[O]".equals(canchaTenis1[fila][columna])) {

                                String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                if (datosEmpleado != null) {
                                    String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                    canchaTenis1[fila][columna] = resumenEmpleado;
                            JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                            }

                                } else {
                            JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                            }
        }

                            case 2 -> {
                                //cancha 2
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila: "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna: "));

                             if ("[O]".equals(canchaTenis2[fila][columna])) {

                                String[] datosEmpleado = empleados1.agregar(); // ahora retorna nombre, id, rol

                                if (datosEmpleado != null) {
                                    String resumenEmpleado = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                                    canchaTenis1[fila][columna] = resumenEmpleado;
                            JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente a " + resumenEmpleado + "!");
                            }

                                } else {
                            JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                            }
                        }
                        if (canchaReserva > 3 || canchaReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (canchaReserva == 3) {
                            break;
                        }
                    }
        }

                
                        case 2 -> {
                    //visualizar
                    while (true) {
                        int canchaVisualizar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                            Cual cancha desea visualizar:
                                                                                            1. Cancha numero 1
                                                                                            2. Cancha numero 2
                                                                                            3. Regresar"""));
                        switch (canchaVisualizar) {
                            case 1 -> {
                                String mostrarEspacios1 = "";
                            for (int i = 0; i < canchaTenis1.length; i++) {
                                for (int j = 0; j < canchaTenis1[i].length; j++) {
                            mostrarEspacios1 += "[" + canchaTenis1[i][j] + "]  ";
                            }
                                mostrarEspacios1 += "\n";
                            }
                            JOptionPane.showMessageDialog(null, "Cancha numero 2:\n"
                                        + mostrarEspacios1);
                            }
                                

                            case 2 -> {
                                String mostrarEspacios1 = "";
                            for (int i = 0; i < canchaTenis2.length; i++) {
                                for (int j = 0; j < canchaTenis2[i].length; j++) {
                            mostrarEspacios1 += "[" + canchaTenis2[i][j] + "]  ";
                            }
                                mostrarEspacios1 += "\n";
                            }
                            JOptionPane.showMessageDialog(null, "Cancha numero 2:\n"
                                        + mostrarEspacios1);
                            }
                        }

                        if (canchaVisualizar > 3 || canchaVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (canchaVisualizar == 3) {
                            break;
                        }

                    
                

            }
}
            }


            if (opcionesTenis > 3 || opcionesTenis < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesTenis == 3) {
                break;
            }
        }

        return true;
    }

    
    //Metodo para liberar espacios en la cancha de tenis
    public void canchaTenisLiberar(){
    while (true) {
            int canchaLiberar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                             Cual cancha de tenis desea liberar:
                                                                             1. Cancha de tenis numero 1
                                                                             2. Cancha de tenis numero 2
                                                                             3. Regresar"""));
            switch (canchaLiberar) {
                case 1 -> {
                    //cancha 1
                    int filaTenis = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 1): "));
                    int columnaTenis = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));
                    if (filaTenis < 1 || filaTenis > 1 || columnaTenis < 1 || columnaTenis > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }   String espacio = canchaTenis1[filaTenis][columnaTenis];
                    if (espacio.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        canchaTenis1[filaTenis][columnaTenis] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    }   break;
            }
                case 2 -> {
                    //cancha 2
                    int filaTenis2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 1): "));
                    int columnaTenis2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));
                    if (filaTenis2 < 1 || filaTenis2 > 1 || columnaTenis2 < 1 || columnaTenis2 > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }   String espacio2 = canchaTenis2[filaTenis2][columnaTenis2];
                    if (espacio2.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        canchaTenis2[filaTenis2][columnaTenis2] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    }   break;  
            }

            }
            if (canchaLiberar > 3 || canchaLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (canchaLiberar == 3) {
                break;
            }
        }
    }
//metodo para guardar los empleados
  
    
}
    
    

