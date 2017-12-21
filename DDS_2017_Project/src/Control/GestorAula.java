/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Aula;
import DAO.AulaDAO;

/**
 *
 * @author Tomas
 */
public class GestorAula {

    public GestorAula() {
    }

    public Aula buscarAula(String id) {
        AulaDAO dao = new AulaDAO();
        Aula a = dao.read(id);
        return a;
    }

    public void modificarAulaSinRecursos() {
    }

    public void modificarAulaInformatica() {
    }

    public void modificarAulaMultimedios() {
    }
}
