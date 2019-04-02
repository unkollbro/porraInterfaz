/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porrainterfaz;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Apuesta {
    private int local;
    private int visitante;
    private String apostante;
    private boolean pagado;

    public Apuesta(int local, int visitante, String apostante, boolean pagado) {
        this.local = local;
        this.visitante = visitante;
        this.apostante = apostante;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return 
             "\n*****************************"+
             "\nApostante: "+getApostante()+
             "\nEquipo Local: "+getLocal()+
             "\nEquipo Visitante: "+getVisitante()+
             "\nPagado?: "+isPagado();
    }

    /**
     * @return the local
     */
    public int getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(int local) {
        this.local = local;
    }

    /**
     * @return the visitante
     */
    public int getVisitante() {
        return visitante;
    }

    /**
     * @param visitante the visitante to set
     */
    public void setVisitante(int visitante) {
        this.visitante = visitante;
    }

    /**
     * @return the apostante
     */
    public String getApostante() {
        return apostante;
    }

    /**
     * @param apostante the apostante to set
     */
    public void setApostante(String apostante) {
        this.apostante = apostante;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
}
