package Regeastro;

public class Alumnos {
private float promedio;
private int semestre;
private String nombreAlumno;
private int matricula;
    //setters
    public void setpromedio (float promedioSet){
        this.promedio = promedioSet;
    
    }
    public void setnombreAlumno (String nombreAlumnoSet){
        this.nombreAlumno = nombreAlumnoSet;
    }
    public void setmatricula(int matriculaSet){
        this.matricula = matriculaSet;
    
    }
    public void setsemestre (int semestreSet){
        this.semestre = semestreSet;
    }

    //getters
    public float getpromedio(){
        return this.promedio;

    }
    public String getnombreAlumno(){
        return this.nombreAlumno;

    }
    public int getmatricula(){
        return this.matricula;
        
    }
    public int getsemestre(){
        return this.semestre;
    }

}