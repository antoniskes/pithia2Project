package Model;
import java.io.Serializable;

public class Mathima implements Serializable{
    private String onomaMathimatos;
    private String kodikosMathimatos;//1205-Θ for example
    private int eksamino;
    private int oresDidaskalias;
    private boolean ergastiriakoMeros;
    private int ECTS;
    private Mathima proapaitoumenoMathima;

    public Mathima(String onomaMathimatos, String kodikosMathimatos, int eksamino, int oresDidaskalias, boolean ergastiriakoMeros, int ECTS, Mathima proapaitoumenoMathima) {
        this.onomaMathimatos = onomaMathimatos;
        this.kodikosMathimatos = kodikosMathimatos;
        this.eksamino = eksamino;
        this.oresDidaskalias = oresDidaskalias;
        this.ergastiriakoMeros = ergastiriakoMeros;
        this.ECTS = ECTS;
        this.proapaitoumenoMathima = proapaitoumenoMathima;
    }
    public String getOnomaMathimatos(){
        return onomaMathimatos;
    }

    public String getKodikosMathimatos() {
        return kodikosMathimatos;
    }

    public int getEksamino() {
        return eksamino;
    }

    public int getOresDidaskalias() {
        return oresDidaskalias;
    }

    public boolean isErgastiriakoMeros() {
        return ergastiriakoMeros;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setProapaitoumenoMathima(Mathima proapaitoumenoMathima) {
        this.proapaitoumenoMathima = proapaitoumenoMathima;
    }
    
}
