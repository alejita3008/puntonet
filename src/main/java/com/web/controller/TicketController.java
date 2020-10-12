package com.web.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.web.dao.TicketDao;
import com.web.model.Ticket;

@ManagedBean
@ViewScoped
public class TicketController {
	

    /**
     * Creates a new instance of TicketController
     */
    private List<Ticket> listaTicket;
    private Ticket ticket;

    public TicketController() {
        ticket = new Ticket();
    }

    public List<Ticket> getListaTicket() {
        TicketDao ad = new TicketDao();
        listaTicket = ad.listarTicket();
        return listaTicket;
    }

    public void setListaTicket(List<Ticket> listaTicket) {
        this.listaTicket = listaTicket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void limpiarTicket() {
        ticket = new Ticket();
    }

    public void agregarTicket() {
        TicketDao ad = new TicketDao();
        ad.agregar(ticket);
    }

    public void modificarTicket() {
        TicketDao ad = new TicketDao();
        ad.modificar(ticket);
        limpiarTicket();
    }

    public void eliminarTicket() {
        TicketDao ad = new TicketDao();
        ad.eliminar(ticket);
        limpiarTicket();
    }
    

}
