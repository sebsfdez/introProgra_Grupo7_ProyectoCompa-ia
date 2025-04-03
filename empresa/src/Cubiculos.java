
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Cubiculos {

    private String privados;
    private String publicos;
    private String cubiculoPriv [][] = new String [4][3];
    private String cubiculoPubli [][] = new String [4][3];

    public Cubiculos(String privados, String publicos) {
        this.privados = privados;
        this.publicos = publicos;

        //Rellenando espacios del cubiculo privado
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cubiculoPriv[i][j] = "[O]";
            }
        }
     //Rellenando espacios del cubiculo publico
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cubiculoPubli[i][j] = "[O]";
            }
        }
    }

    public String getPrivados() {
        return privados;
    }

    public void setPrivados(String privados) {
        this.privados = privados;
    }

    public String getPublicos() {
        return publicos;
    }

    public void setPublicos(String publicos) {
        this.publicos = publicos;
    }

    //opcion 2 cubiculos, aca pongo igual un subMenu con las opciones de las acciones posibles a ejecutar
    public void mostrarOpcionesCubiculos() {
        while (true) {
            int opcionesCubiculos = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegiste la opcion *Cubiculos* | Que deseas hacer?\n"
                    + " 1. Liberar espacio cubiculo p\n"
                    + " 3. Reservar cubiculos\n"
                    + " 4. Regresar al menu principal"));//agregar más opciones si es necesario porque me falto poner más
            switch (opcionesCubiculos) {
                case 1:
                    liberarEspacioCubiculo();
                    break;//meter más cases si es necesario
                case 3:
                    ReservarCubiculo();
                    break;//meter más cases si es necesario
             

            }
            if (opcionesCubiculos > 4 || opcionesCubiculos < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesCubiculos == 4) {
                break;
            }
        }
    }

    //acciones para el recepcionista al ingresar a cada opcion del menu principal, 
    //deberia de llamarlo en el main dentro del menu de opciones
    public boolean liberarEspacioCubiculo() {
        while (true) {
            int cubiculoLiberar = Integer.parseInt(JOptionPane.showInputDialog("Cual cubiculo desea liberar:\n"
                    + "1. Cubiculo privado\n"
                    + "2. Cubiculo publico\n"
                    + "3. Regresar"));
            switch (cubiculoLiberar) {
                case 1://cancha 1
                    int filaCubPrivado = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaCubPrivado = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (cubiculoPriv[filaCubPrivado][columnaCubPrivado] == "[P]") {
                        cubiculoPriv[filaCubPrivado][columnaCubPrivado] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (cubiculoPriv[filaCubPrivado][columnaCubPrivado] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;
                case 2://cancha 2
                    int filaCubPublico = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                    int columnaCubPublico = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                    if (cubiculoPubli[filaCubPublico][columnaCubPublico] == "[P]") {
                        cubiculoPubli[filaCubPublico][columnaCubPublico] = "[O]";
                        JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");

                    } else if (cubiculoPubli[filaCubPublico][columnaCubPublico] == "[O]") {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No es permitido liberar este espacio");
                    }
                    break;

            }
            if (cubiculoLiberar> 3 || cubiculoLiberar < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (cubiculoLiberar== 3) {
                break;
            }
        }
        return true;
    }
    
    

    public boolean ReservarCubiculo() {
       /* LocalTime horaInicio = LocalTime.of(9, 0);  // 9:00 AM
        LocalTime horaFin = LocalTime.of(18, 0);  // 6:00 PM

        //formato de 24 horas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        //variable donde almacenar hora
        LocalTime hora = null;
        //pedir datos
        String datos = JOptionPane.showInputDialog("Que hora desea reservar(HH:mm): ");
        //Los datos convertidos en localTime
        hora = LocalTime.parse(datos, formato);
        
        if (hora.isBefore(horaInicio) || hora.isAfter(horaFin)) {
            JOptionPane.showMessageDialog(null,"No hay cupos a la hora que desea reservar");
        } else {}//meter logica de progra aqui*/
       
        //prefijar columnas array 1
        cubiculoPriv[0][0] = "     ";
        cubiculoPriv[0][1] = "*1*";
        cubiculoPriv[0][2] = "*2*";
        //prefijar filas array 1 
        cubiculoPriv[1][0] = "*1*";
        cubiculoPriv[2][0] = "*2*";
        cubiculoPriv[3][0] = "*3*";
        
        //prefijar columnas array 1
        cubiculoPubli[0][0] = "     ";
        cubiculoPubli[0][1] = "*1*";
        cubiculoPubli[0][2] = "*2*";
        //prefijar filas array 1 
        cubiculoPubli[1][0] = "*1*";
        cubiculoPubli[2][0] = "*2*";
        cubiculoPubli[3][0] = "*3*";
        
        while (true) {
            int opcionesCubiculo = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                    + "1. Reservar cubiculo \n"
                    + "2. Visualizar espacios\n"
                    + "3. Regresar"));

            switch (opcionesCubiculo) {
                case 1://Reserva
                    while (true) {
                        int cubiculoReserva = Integer.parseInt(JOptionPane.showInputDialog("Cual cubiculo desea reservar :\n"
                                + "1. Cubiculo privado\n"
                                + "2. Cubiculo publico\n"
                                + "3. Regresar"));
                        switch (cubiculoReserva) {
                            case 1://cancha 1
                                int filaCubPrivado = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaCubPrivado = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (cubiculoPriv[filaCubPrivado][columnaCubPrivado] == "[O]") {
                                    cubiculoPriv[filaCubPrivado][columnaCubPrivado] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;
                            case 2://cancha 2
                                int filaCubPublico = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra: "));
                                int columnaCubPublico = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (cubiculoPubli[filaCubPublico][columnaCubPublico] == "[O]") {
                                    cubiculoPubli[filaCubPublico][columnaCubPublico] = "[P]";
                                    JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");

                                } else {
                                    JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                }
                                break;

                        }
                        if (cubiculoReserva > 3 || cubiculoReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (cubiculoReserva == 3) {
                            break;
                        }
                    }

                    break;
                case 2://visualizar
                    while (true) {
                        int cubiculoVisualizar = Integer.parseInt(JOptionPane.showInputDialog("Cual cubiculo desea visualizar:\n"
                                + "1. Cubiculo privado\n"
                                + "2. Cubiculo publico\n"
                                + "3. Regresar"));
                        switch (cubiculoVisualizar) {
                            case 1:
                                String mostrarEspacios1 = "";
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios1 += cubiculoPriv[i][j] + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Cubiculo privado:\n"
                                        + mostrarEspacios1);
                                break;
                            case 2:
                                String mostrarEspacios2 = "";
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        mostrarEspacios2 += cubiculoPubli[i][j] + "   ";
                                    }
                                    mostrarEspacios2 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Cubiculo publico:\n"
                                        + mostrarEspacios2);
                                break;
                        }

                        if (cubiculoVisualizar > 3 || cubiculoVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

                        }
                        if (cubiculoVisualizar == 3) {
                            break;
                        }

                    }

                    break;

            }

            if (opcionesCubiculo > 3 || opcionesCubiculo < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesCubiculo == 3) {
                break;
            }
        }

        return true;
        
    }
}
