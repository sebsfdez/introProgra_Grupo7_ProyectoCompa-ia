
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;


public class Cubiculos {

    private String privados;
    private String publicos;
    private String cubiculoPriv [][] = new String [4][3];
    private String cubiculoPubli [][] = new String [4][3];
    private Empleados empleados1 = new Empleados("", 0, "", 0, "");
    
    
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
                    + " 2. Reservar cubiculos\n"
                    + " 3. Regresar al menu principal"));//agregar más opciones si es necesario porque me falto poner más
            switch (opcionesCubiculos) {
                case 1:
                    liberarEspacioCubiculo();
                    break;//meter más cases si es necesario
                case 2:
                    ReservarCubiculo();
                    break;//meter más cases si es necesario
             

            }
            if (opcionesCubiculos > 3 || opcionesCubiculos < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");

            }
            if (opcionesCubiculos == 3) {
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
                case 1: //Privado
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 5): "));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));

                if (fila < 1 || fila > 5 || columna < 1 || columna > 2) {
                    JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                    continue;
                    }

                String espacio = cubiculoPriv[fila][columna];
                    if (espacio.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    }
                    cubiculoPriv[fila][columna] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
                    break;
                    
                case 2: // Publico
                    int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en que se encuentra (1 - 5): "));
                    int columna2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en que se encuentra (1 - 2): "));

                if (fila2 < 1 || fila2 > 5 || columna2 < 1 || columna2 > 2) {
                    JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                    continue;
                    }

                    String espacio2 = cubiculoPubli[fila2][columna2];
                    if (espacio2.equals("[O]")) {
                        JOptionPane.showMessageDialog(null, "¡El espacio ya estaba liberado!");
                    }
                    cubiculoPubli[fila2][columna2] = "[O]";
                    JOptionPane.showMessageDialog(null, "¡Espacio liberado exitosamente!");
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
       
       
        // Prefijar cabeceras y filas
    cubiculoPriv[0][0] = "     "; cubiculoPriv[0][1] = "*1*"; cubiculoPriv[0][2] = "*2*";
    cubiculoPriv[1][0] = "*1*"; cubiculoPriv[2][0] = "*2*"; cubiculoPriv[3][0] = "*3*";

    cubiculoPubli[0][0] = "     "; cubiculoPubli[0][1] = "*1*"; cubiculoPubli[0][2] = "*2*";
    cubiculoPubli[1][0] = "*1*"; cubiculoPubli[2][0] = "*2*"; cubiculoPubli[3][0] = "*3*";

    // Inicializar espacios disponibles
    for (int i = 1; i < 4; i++) {
        for (int j = 1; j < 3; j++) {
            cubiculoPriv[i][j] = "[O]";
            cubiculoPubli[i][j] = "[O]";
        }
    }

    while (true) {
        int opcionesCubiculo = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n"
                + "1. Reservar cubículo \n"
                + "2. Visualizar espacios\n"
                + "3. Regresar"));

        switch (opcionesCubiculo) {
            case 1: // Reservar cubículo
                // Validar hora antes de continuar
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime horaInicio = LocalTime.of(9, 0);
                LocalTime horaFin = LocalTime.of(18, 0);

                String datos = JOptionPane.showInputDialog("¿Qué hora desea reservar? (HH:mm)");

                try {
                    LocalTime hora = LocalTime.parse(datos, formato);
                    if (hora.isBefore(horaInicio) || hora.isAfter(horaFin)) {
                        JOptionPane.showMessageDialog(null, "No hay cupos a la hora que desea reservar (Horario: 09:00 - 18:00)");
                        break;
                    }
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de hora inválido. Use HH:mm (Ej: 14:30)");
                    break;
                }

                // Si la hora es válida, continúa con la reserva
                while (true) {
                    int cubiculoReserva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál cubículo desea reservar?\n"
                            + "1. Cubículo privado\n"
                            + "2. Cubículo público\n"
                            + "3. Regresar"));

                    if (cubiculoReserva == 3) break;

                    if (cubiculoReserva < 1 || cubiculoReserva > 3) {
                        JOptionPane.showMessageDialog(null, "¡Opción inválida!");
                        continue;
                    }

                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Fila (1 - 3): "));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("Columna (1 - 2): "));

                    if (fila < 1 || fila > 3 || columna < 1 || columna > 2) {
                        JOptionPane.showMessageDialog(null, "¡Fila o columna fuera de rango!");
                        continue;
                    }

                    String[][] cubiculoSeleccionado = (cubiculoReserva == 1) ? cubiculoPriv : cubiculoPubli;

                    if ("[O]".equals(cubiculoSeleccionado[fila][columna])) {
                        String[] datosEmpleado = empleados1.agregar(); //

                        if (datosEmpleado != null) {
                            String resumen = datosEmpleado[0] + " (" + datosEmpleado[1] + ")";
                            cubiculoSeleccionado[fila][columna] = resumen;
                            JOptionPane.showMessageDialog(null, "¡Espacio asignado a " + resumen + "!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                    }
                }
                break;

            case 2: // Visualizar cubículos
                while (true) {
                    int opcionVer = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea visualizar?\n"
                            + "1. Cubículo privado\n"
                            + "2. Cubículo público\n"
                            + "3. Regresar"));

                    if (opcionVer == 3) break;

                    if (opcionVer < 1 || opcionVer > 3) {
                        JOptionPane.showMessageDialog(null, "¡Opción inválida!");
                        continue;
                    }

                    String[][] cubiculoVer = (opcionVer == 1) ? cubiculoPriv : cubiculoPubli;
                    String salida = "";

                    for (int i = 0; i < cubiculoVer.length; i++) {
                        for (int j = 0; j < cubiculoVer[i].length; j++) {
                            salida += "[" + cubiculoVer[i][j] + "]  ";
                        }
                        salida += "\n";
                    }

                    JOptionPane.showMessageDialog(null, (opcionVer == 1 ? "Cubículo privado" : "Cubículo público") + ":\n" + salida);
                }
                break;

            case 3: // Salir del menú principal
                return true;

            default:
                JOptionPane.showMessageDialog(null, "¡Opción inválida!");
        }
    }
}
   
}
