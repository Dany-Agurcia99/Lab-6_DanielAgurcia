package javaapplication99;

public class Asesinato extends Delito {

    String arma;
    int victimas;

    public Asesinato(String arma, int victimas) {
        this.arma = arma;
        this.victimas = victimas;
    }

    public Asesinato(String arma, int victimas, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.arma = arma;
        this.victimas = victimas;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

}
