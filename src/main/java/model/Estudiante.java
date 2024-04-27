package model;

public class Estudiante {

    private String nombre, apellido, rut, nMatricula;

    private Carrera carrera;

    public Estudiante(String nombre, String rut, String nMatricula, Carrera carrera) {
        this.nombre = nombre;
        this.rut = rut;
        this.nMatricula = nMatricula;
        this.carrera = carrera;
    }

    public Estudiante(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(String nMatricula) {
        this.nMatricula = nMatricula;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String toString(){
        return "Nombre: " + nombre + " Apellido: " + apellido + " Rut: " + rut + " Numero de Matricula: " + nMatricula;
    }

}
