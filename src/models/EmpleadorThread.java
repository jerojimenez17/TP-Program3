/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JeroJimenez
 */
public class EmpleadorThread extends Observable implements Runnable {

    private BolsaDeTrabajo bolsaTrabajo;
    private String rubro;
    private List<TicketSimplificado> myTicketsSimpl = new ArrayList<>();
    //METODO GENERA TICKET SIMPLIFICADO

    public void generarTicketSimplificado(int eleccionTipoTrabajo, int eleccionLocacion, Empleado empleado) {
        if (myTicketsSimpl.size() < 3) {
            this.myTicketsSimpl.add(new TicketSimplificado(eleccionTipoTrabajo, eleccionLocacion, this));

        }
    }

    @Override
    public void run() {
        myTicketsSimpl.forEach(ts -> {
            bolsaTrabajo.addTicket(ts);
        });
    }
}
