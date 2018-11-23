package javaapplication99;

public class Violacion extends Delito {

    int edad_victima;

    public Violacion() {
    }

    public Violacion(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    public Violacion(int edad_victima, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.edad_victima = edad_victima;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

    @Override
    public String toString() {
        return "" + edad_victima;
    }

}
