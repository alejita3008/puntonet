package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

public class Estado implements java.io.Serializable {


    private int idestado;
    private String descripcion;
    private Set<Ticket> tickets = new HashSet<Ticket>(0);

   public Estado() {
   }

	
   public Estado(int idestado, String descripcion) {
       this.idestado = idestado;
       this.descripcion = descripcion;
   }
   public Estado(int idestado, String descripcion, Set<Ticket> tickets) {
      this.idestado = idestado;
      this.descripcion = descripcion;
      this.tickets = tickets;
   }
  
   public int getIdestado() {
       return this.idestado;
   }
   
   public void setIdestado(int idestado) {
       this.idestado = idestado;
   }
   public String getDescripcion() {
       return this.descripcion;
   }
   
   public void setDescripcion(String descripcion) {
       this.descripcion = descripcion;
   }
   public Set<Ticket> getTickets() {
       return this.tickets;
   }
   
   public void setTickets(Set<Ticket> tickets) {
       this.tickets = tickets;
   }



	
}
