package javaapplication99;

import java.util.ArrayList;
import java.util.Date;

public class Criminal {

    String exp;
    String nombre;
    int edad;
    int numero_identidad;
    int numero_celda;
    ArrayList<Delito> lista_delitos = new ArrayList();
    int anos_cumplir;

    public Criminal() {
    }

    public Criminal(String nombre, int edad, int numero_identidad, int numero_celda, int anos_cumplir) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero_identidad = numero_identidad;
        this.numero_celda = numero_celda;
        this.anos_cumplir = anos_cumplir;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero_identidad() {
        return numero_identidad;
    }

    public void setNumero_identidad(int numero_identidad) {
        this.numero_identidad = numero_identidad;
    }

    public int getNumero_celda() {
        return numero_celda;
    }

    public void setNumero_celda(int numero_celda) {
        this.numero_celda = numero_celda;
    }

    public ArrayList<Delito> getLista_delitos() {
        return lista_delitos;
    }

    public void setLista_delitos(ArrayList<Delito> lista_delitos) {
        this.lista_delitos = lista_delitos;
    }

    public int getAnos_cumplir() {
        return anos_cumplir;
    }

    public void setAnos_cumplir(int anos_cumplir) {
        this.anos_cumplir = anos_cumplir;
    }

    @Override
    public String toString() {
        return "Criminal: " + nombre;
    }

    public String Expediente() {
        return "Expediente\n" + new Date() + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + " Anios\n"
                + "Numero de ID: " + numero_identidad + "\n"
                + "Numero de Celda: " + numero_celda + "\n" + "\n"
                + "Delitos:\n"
                + lista_delitos + "\n"
                + "Anios por Cumplir: " + anos_cumplir;
    }
}
