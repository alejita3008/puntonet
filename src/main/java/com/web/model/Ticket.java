package com.web.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Ticket")
@Table(name = "Ticket")
public class Ticket implements java.io.Serializable {
	
	
	@Id
    @GeneratedValue
	private int idticket;
	
	@Column
    private Cliente cliente;
    
	@Column
	private Estado estado;
    
	@Column
	private String detalle;
	
	@Column
    private Integer estado_1;
    
	@Column
	private String prioridad;
    
	@Column
	private String cliente_1;
	
	@Column
    private Date fecha;
	
	@Column
    private String deal;

   public Ticket() {
   }

	
   public Ticket(int idticket) {
       this.idticket = idticket;
   }
   public Ticket(int idticket, Cliente cliente, Estado estado, String detalle, Integer estado_1, String prioridad, String cliente_1, Date fecha, String deal) {
      this.idticket = idticket;
      this.cliente = cliente;
      this.estado = estado;
      this.detalle = detalle;
      this.estado_1 = estado_1;
      this.prioridad = prioridad;
      this.cliente_1 = cliente_1;
      this.fecha = fecha;
      this.deal = deal;
   }
  
   public int getIdticket() {
       return this.idticket;
   }
   
   public void setIdticket(int idticket) {
       this.idticket = idticket;
   }
   public Cliente getCliente() {
       return this.cliente;
   }
   
   public void setCliente(Cliente cliente) {
       this.cliente = cliente;
   }
   public Estado getEstado() {
       return this.estado;
   }
   
   public void setEstado(Estado estado) {
       this.estado = estado;
   }
   public String getDetalle() {
       return this.detalle;
   }
   
   public void setDetalle(String detalle) {
       this.detalle = detalle;
   }
   public Integer getEstado_1() {
       return this.estado_1;
   }
   
   public void setEstado_1(Integer estado_1) {
       this.estado_1 = estado_1;
   }
   public String getPrioridad() {
       return this.prioridad;
   }
   
   public void setPrioridad(String prioridad) {
       this.prioridad = prioridad;
   }
   public String getCliente_1() {
       return this.cliente_1;
   }
   
   public void setCliente_1(String cliente_1) {
       this.cliente_1 = cliente_1;
   }
   public Date getFecha() {
       return this.fecha;
   }
   
   public void setFecha(Date fecha) {
       this.fecha = fecha;
   }
   public String getDeal() {
       return this.deal;
   }
   
   public void setDeal(String deal) {
       this.deal = deal;
   }



}
