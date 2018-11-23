package javaapplication99;

public class Trafico extends Delito {

    String nombre_producto;
    int peso_kg;

    public Trafico() {
    }

    public Trafico(String nombre_producto, int peso_kg) {
        this.nombre_producto = nombre_producto;
        this.peso_kg = peso_kg;
    }

    public Trafico(String nombre_producto, int peso_kg, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.nombre_producto = nombre_producto;
        this.peso_kg = peso_kg;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
    }

    @Override
    public String toString() {
        return nombre_producto + ", " + peso_kg + "Kg";
    }

}
