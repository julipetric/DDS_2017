package bd.model;
// Generated Dec 15, 2017 3:18:15 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Aula generated by hbm2java
 */
public class Aula implements java.io.Serializable {

    private String id;
    private int capacidad;
    private String pizzaron;
    private boolean habilitada;
    private boolean canion;
    private boolean ac;
    private String ubicacion;
    private String tipo;
    private Set diareservas = new HashSet(0);
    private Aulasr aulasr;
    private Aulainf aulainf;
    private Aulamm aulamm;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aula(String id, int capacidad, String pizzaron, boolean habilitada, boolean canion, boolean ac, String ubicacion, String tipo) {
        this.id = id;
        this.capacidad = capacidad;
        this.pizzaron = pizzaron;
        this.habilitada = habilitada;
        this.canion = canion;
        this.ac = ac;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    public Aula() {
    }

    public Aula(String tipo, int capacidad) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPizzaron() {
        return this.pizzaron;
    }

    public void setPizzaron(String pizzaron) {
        this.pizzaron = pizzaron;
    }

    public boolean isHabilitada() {
        return this.habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public boolean isCanion() {
        return this.canion;
    }

    public void setCanion(boolean canion) {
        this.canion = canion;
    }

    public boolean isAc() {
        return this.ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set getDiareservas() {
        return this.diareservas;
    }

    public void setDiareservas(Set diareservas) {
        this.diareservas = diareservas;
    }

    public Aulasr getAulasr() {
        return this.aulasr;
    }

    public void setAulasr(Aulasr aulasr) {
        this.aulasr = aulasr;
    }

    public Aulainf getAulainf() {
        return this.aulainf;
    }

    public void setAulainf(Aulainf aulainf) {
        this.aulainf = aulainf;
    }

    public Aulamm getAulamm() {
        return this.aulamm;
    }

    public void setAulamm(Aulamm aulamm) {
        this.aulamm = aulamm;
    }

}
