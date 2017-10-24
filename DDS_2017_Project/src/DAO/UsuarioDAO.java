/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.dto.HibernateUtil;
import bd.model.Bedel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author santi_000
 */
public class UsuarioDAO {

    public UsuarioDAO() {
    }
    
    public void crear(Bedel bedel){
        
     
     SessionFactory sesion = HibernateUtil.getSessionFactory();
     Session session = sesion.openSession();
     Transaction tx = session.beginTransaction();
     session.save(bedel);
     tx.commit();
     session.close();
    }
    
    
    
}
