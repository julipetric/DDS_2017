/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Aula;
import DAO.AulaDAO;
import bd.dto.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Tomas
 */
public class GestorDeAulas {

    public GestorDeAulas() {
    }

    public Aula buscarAula(String id) {
        AulaDAO dao = new AulaDAO();
        Aula a = dao.read(id);
        return a;
    }

    public void modificarAulaSinRecursos() {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
    }

    public void modificarAulaInformatica() {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
    }

    public void modificarAulaMultimedios() {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
    }
}
