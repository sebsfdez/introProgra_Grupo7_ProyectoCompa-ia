/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class SalaDeReunion {
    private String reunionIntern;
    private String reunionCliente;
    private int capacidad;

    public SalaDeReunion(String reunionIntern, String reunionCliente, int capacidad) {
        this.reunionIntern = reunionIntern;
        this.reunionCliente = reunionCliente;
        this.capacidad = capacidad;
    }

    public String getReunionIntern() {
        return reunionIntern;
    }

    public void setReunionIntern(String reunionIntern) {
        this.reunionIntern = reunionIntern;
    }

    public String getReunionCliente() {
        return reunionCliente;
    }

    public void setReunionCliente(String reunionCliente) {
        this.reunionCliente = reunionCliente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
