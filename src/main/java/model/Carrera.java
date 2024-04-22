package model;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private List<Estudiante> estudiantes;
    private String nombreCarrera, codCarrera;
    private int cantSemestres;

    public Carrera(String nombreCarrera, String codCarrera, int cantSemestres) {
        this.nombreCarrera = nombreCarrera;
        this.codCarrera = codCarrera;
        this.cantSemestres = cantSemestres;
        this.estudiantes = new ArrayList<>();

    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(String codCarrera) {
        this.codCarrera = codCarrera;
    }

    public int getCantSemestres() {
        return cantSemestres;
    }

    public void setCantSemestres(int cantSemestres) {
        this.cantSemestres = cantSemestres;
    }

    //Método para agregar estudiantes con validacion

    public boolean estudianteExiste(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getRut().equals(estudiante.getRut())) {
                return true;
            }
        }
        return false;

    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (!estudianteExiste(estudiante)) {
            estudiantes.add(estudiante);
            return true;
        }
        return false;
    }

    //Método para eliminar estudiantes con validacion

    public boolean eliminarEstudiante(Estudiante estudiante) {
        if (estudianteExiste(estudiante)) {
            estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Nombre Carrera: " + nombreCarrera + " Codigo Carrera: " + codCarrera + " Cantidad de Semestres: " + cantSemestres;
    }


}
