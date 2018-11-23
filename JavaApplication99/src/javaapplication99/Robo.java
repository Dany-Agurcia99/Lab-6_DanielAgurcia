package javaapplication99;

public class Robo extends Delito {

    String objeto_robado;
    int valor_objeto;

    public Robo() {
    }

    public Robo(String objeto_robado, int valor_objeto) {
        this.objeto_robado = objeto_robado;
        this.valor_objeto = valor_objeto;
    }

    public Robo(String objeto_robado, int valor_objeto, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.objeto_robado = objeto_robado;
        this.valor_objeto = valor_objeto;
    }

    public String getObjeto_robado() {
        return objeto_robado;
    }

    public void setObjeto_robado(String objeto_robado) {
        this.objeto_robado = objeto_robado;
    }

    public int getValor_objeto() {
        return valor_objeto;
    }

    public void setValor_objeto(int valor_objeto) {
        this.valor_objeto = valor_objeto;
    }

}
