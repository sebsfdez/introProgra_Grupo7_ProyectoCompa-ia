
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

    public Cubiculos(String privados, String publicos) {
        this.privados = privados;
        this.publicos = publicos;
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
                    + " 1. Liberar espacios del cubiculo privado\n"
                    + " 2. Reservar cubiculo privados\n"
                    + " 3. Reservar cubiculo publico\n"
                    + " 4. Regresar al menu principal"));//agregar más opciones si es necesario porque me falto poner más
            switch (opcionesCubiculos) {
                case 1:
                    liberarEspacioCubiculoP();
                    break;//meter más cases si es necesario
                case 2:
                    ReservarCubiculoPrivado();
                    break;//meter más cases si es necesario
                case 3:
                    ReservarCubiculoPublico();
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
    public boolean liberarEspacioCubiculoP() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }

    public boolean ReservarCubiculoPrivado() {
        LocalTime horaInicio = LocalTime.of(9, 0);  // 9:00 AM
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
        } else {}//meter logica de progra aqui
        return true;
    }

    public boolean ReservarCubiculoPublico() {
        JOptionPane.showMessageDialog(null, "funciona");
        return true;
    }
}
