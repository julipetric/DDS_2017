/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import bd.dto.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author santi_000
 */
public class PoliticaSeguridad {

    public boolean validar(String pass, String passv) {
        boolean error = false;
        List<Integer> lista = null;

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        lista = session.createCriteria(Integer.class).list();
        tx.commit();
        session.close();
        int min = lista.get(0);
        int max = lista.get(1);


       if ((pass.length() < min || pass.length() > max) || (passv.length() < min || passv.length() > max)) {
            error = true;
        } else {

            if (!pass.isEmpty() && !passv.isEmpty() && pass.length() > (min - 1) && pass.length() < (max + 1) && passv.length() > (min - 1) && passv.length() < (max + 1) && passv.length() == pass.length()) {

                for (int i = 0; i < pass.length(); i++) {
                    if (pass.charAt(i) != passv.charAt(i)) {
                        error = true;
                        break;
                    }
                }

            } else {
                error = true;
            }
        }
        return error;
    }

    public PoliticaSeguridad() {
    }
}
