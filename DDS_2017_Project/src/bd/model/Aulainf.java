package bd.model;
// Generated 14-dic-2017 19:22:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Aulainf generated by hbm2java
 */
public class Aulainf  implements java.io.Serializable {


     private String id;
     private Aula aula;
     private int cantPc;
     private Set posees = new HashSet(0);

    public Aulainf() {
    }

	
    public Aulainf(Aula aula, int cantPc) {
        this.aula = aula;
        this.cantPc = cantPc;
    }
    public Aulainf(Aula aula, int cantPc, Set posees) {
       this.aula = aula;
       this.cantPc = cantPc;
       this.posees = posees;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public int getCantPc() {
        return this.cantPc;
    }
    
    public void setCantPc(int cantPc) {
        this.cantPc = cantPc;
    }
    public Set getPosees() {
        return this.posees;
    }
    
    public void setPosees(Set posees) {
        this.posees = posees;
    }




}


