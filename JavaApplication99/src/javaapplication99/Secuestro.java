package javaapplication99;

public class Secuestro extends Delito {

    int tiempo_secuestrado;
    int edad_victima;

    public Secuestro(int tiempo_secuestrado, int edad_victima) {
        this.tiempo_secuestrado = tiempo_secuestrado;
        this.edad_victima = edad_victima;
    }

    public Secuestro(int tiempo_secuestrado, int edad_victima, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.tiempo_secuestrado = tiempo_secuestrado;
        this.edad_victima = edad_victima;
    }

    public Secuestro() {
    }

    public int getTiempo_secuestrado() {
        return tiempo_secuestrado;
    }

    public void setTiempo_secuestrado(int tiempo_secuestrado) {
        this.tiempo_secuestrado = tiempo_secuestrado;
    }

    public int getEdad_victima() {
        return edad_victima;
    }

    public void setEdad_victima(int edad_victima) {
        this.edad_victima = edad_victima;
    }

}
