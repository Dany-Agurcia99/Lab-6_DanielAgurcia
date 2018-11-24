package javaapplication99;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class admin_criminal {

    ArrayList<Criminal> lista_criminales = new ArrayList();
    private File archivo = null;

    public admin_criminal(String path) {
        archivo = new File(path);
    }

    public ArrayList<Criminal> getLista_criminales() {
        return lista_criminales;
    }

    public void setLista_criminales(ArrayList<Criminal> lista_criminales) {
        this.lista_criminales = lista_criminales;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setCriminal(Criminal c) {
        this.getLista_criminales().add(c);
    }

    public void setDelito(Delito d, int index) {
        lista_criminales.get(index).getLista_delitos().add(d);
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista_criminales = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int edad, id, celda, anios;
                    String nombre;
                    ArrayList<Delito> tempArray = new ArrayList();
                    nombre = sc.next();
                    edad = sc.nextInt();
                    id = sc.nextInt();
                    celda = sc.nextInt();
                    Scanner sc2 = new Scanner(sc.next());
                    sc2.useDelimiter(",");
                    while (sc2.hasNext()) {
                        if (sc2.next().equals("Asesinato")) {
                            tempArray.add(new Asesinato(sc2.next(), sc2.nextInt(), sc2.next(), sc2.next(), sc2.next()));
                            break;
                        } else if (sc2.next().equals("Violacion")) {
                            tempArray.add(new Violacion(sc2.nextInt(), sc2.next(), sc2.next(), sc2.next()));
                            break;
                        } else if (sc2.next().equals("Robo")) {
                            tempArray.add(new Robo(sc2.next(), sc2.nextInt(), sc2.next(), sc2.next(), sc2.next()));
                            break;
                        } else if (sc2.next().equals("Trafico")) {
                            tempArray.add(new Trafico(sc2.next(), sc2.nextInt(), sc2.next(), sc2.next(), sc2.next()));
                            break;
                        } else if (sc2.next().equals("Secuestro")) {
                            tempArray.add(new Secuestro(sc2.nextInt(), sc2.nextInt(), sc2.next(), sc2.next(), sc2.next()));
                            break;
                        } else {
                            tempArray.add(new Secuestro(sc2.nextInt(), sc2.nextInt(), sc2.next(), sc2.next(), sc2.next()));
                            break;
                        }
                    }//finwhile
                    sc2.close();
                    anios = sc.nextInt();
                    lista_criminales.add(new Criminal(nombre, edad, id, celda, anios));
                    lista_criminales.get(lista_criminales.size() - 1).setLista_delitos(tempArray);
                }//finwhile
            } catch (Exception e) {
                System.out.println(e);
            }
            sc.close();
        }
    }

    public void escribirArchivoExp() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Criminal temp : lista_criminales) {
                bw.write(temp.getExp() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Criminal temp : lista_criminales) {
                bw.write(temp.getNombre() + ";");
                bw.write(temp.getEdad() + ";");
                bw.write(temp.getNumero_identidad() + ";");
                bw.write(temp.getNumero_celda() + ";");
                for (Delito temp2 : temp.getLista_delitos()) {
                    if (temp2 instanceof Asesinato) {
                        bw.write("Asesinato" + ",");
                        bw.write(((Asesinato) temp2).getArma() + ",");
                        bw.write(((Asesinato) temp2).getVictimas() + ",");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                    } else if (temp2 instanceof Violacion) {
                        bw.write(((Violacion) temp2).getEdad_victima() + ",");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                    } else if (temp2 instanceof Robo) {
                        bw.write(((Robo) temp2).getObjeto_robado() + ",");
                        bw.write(((Robo) temp2).getValor_objeto() + ",");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                    } else if (temp2 instanceof Trafico) {
                        bw.write(((Trafico) temp2).getNombre_producto() + ",");
                        bw.write(((Trafico) temp2).getPeso_kg() + ",");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                    } else if (temp2 instanceof Secuestro) {
                        bw.write(((Secuestro) temp2).getTiempo_secuestrado() + ",");
                        bw.write(((Secuestro) temp2).getEdad_victima() + ",");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");

                    }
                }
                bw.write(temp.getAnos_cumplir() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }
}
