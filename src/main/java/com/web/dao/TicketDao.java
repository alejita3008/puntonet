package com.web.dao;

import java.util.List;
import com.web.model.Ticket;
import com.web.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TicketDao {
	
	public List<Ticket> listarTicket() {
        List<Ticket> lista = null;
        Session sesion = Util.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        String hql = "FROM Ticket";
        try {
            lista = sesion.createQuery(hql).list();
            t.commit();
            sesion.close();
        } catch (Exception e) {
            t.rollback();
        }
        return lista;
    }

    public void agregar(Ticket ticket) {
        Session sesion = null;
        try {
            sesion = Util.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(ticket);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void modificar(Ticket ticket) {
        Session sesion = null;
        try {
            sesion = Util.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(ticket);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void eliminar(Ticket ticket) {
        Session sesion = null;
        try {
            sesion = Util.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(ticket);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

}
