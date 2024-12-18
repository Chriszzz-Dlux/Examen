package Regeastro;

public class Materia {
    float unidades;
    String contraseña;
    String nombreMateria;

    //set
    public void setnombreMateria (String nombreMateriaSet){
        this.nombreMateria = nombreMateriaSet;
    }
    public void setcontraseña (String contraseñaSet){
        this.contraseña = contraseñaSet;
    }
    public void setunidades (float unidadesSet){
        this.unidades = unidadesSet;
    }

    //get
    public String getnombreMateria(){
        return this.nombreMateria;
    }
    public String getcontraseña(){
        return this.contraseña;
    }
    public float getunidades(){
        return this.unidades;
    }

}
