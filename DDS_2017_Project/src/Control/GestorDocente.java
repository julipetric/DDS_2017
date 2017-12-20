/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DocenteDAO;
import bd.model.Docente;
import java.util.ArrayList;



/**
 *
 * @author Tomas
 */
public class GestorDocente {

   

    public GestorDocente() {
    }

     public ArrayList<Docente> read() {
      DocenteDAO dao = new DocenteDAO();
      return dao.read();
     }

}
