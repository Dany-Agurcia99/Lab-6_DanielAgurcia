package javaapplication99;

public class Delito {

    String descripcion;
    String gravedad;
    String culpable;
    
    public Delito() {
    }

    public Delito(String descripcion, String gravedad, String culpable) {
        this.descripcion = descripcion;
        this.gravedad = gravedad;
        this.culpable = culpable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    @Override
    public String toString() {
        return descripcion + ", " + gravedad + ", " + culpable + ", ";
    }

}
