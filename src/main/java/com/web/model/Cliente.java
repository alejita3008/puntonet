package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Cliente")
@Table(name = "Cliente")
public class Cliente implements java.io.Serializable {

	private String identificacion;
    private String nombres;
    private String direccion;
    private String telefono;
    private String movil;
    private Set<Ticket> tickets = new HashSet<Ticket>(0);

   public Cliente() {
   }

	
   public Cliente(String identificacion, String nombres) {
       this.identificacion = identificacion;
       this.nombres = nombres;
   }
   public Cliente(String identificacion, String nombres, String direccion, String telefono, String movil, Set<Ticket> tickets) {
      this.identificacion = identificacion;
      this.nombres = nombres;
      this.direccion = direccion;
      this.telefono = telefono;
      this.movil = movil;
      this.tickets = tickets;
   }
  
   public String getIdentificacion() {
       return this.identificacion;
   }
   
   public void setIdentificacion(String identificacion) {
       this.identificacion = identificacion;
   }
   public String getNombres() {
       return this.nombres;
   }
   
   public void setNombres(String nombres) {
       this.nombres = nombres;
   }
   public String getDireccion() {
       return this.direccion;
   }
   
   public void setDireccion(String direccion) {
       this.direccion = direccion;
   }
   public String getTelefono() {
       return this.telefono;
   }
   
   public void setTelefono(String telefono) {
       this.telefono = telefono;
   }
   public String getMovil() {
       return this.movil;
   }
   
   public void setMovil(String movil) {
       this.movil = movil;
   }
   public Set<Ticket> getTickets() {
       return this.tickets;
   }
   
   public void setTickets(Set<Ticket> tickets) {
       this.tickets = tickets;
   }
	
}
