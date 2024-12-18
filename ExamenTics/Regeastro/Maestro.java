package Regeastro;

public class Maestro {
private String nombreMaestro;
private int alumnos1;
private int numDeTarjeta;


    //setters
public void setnombreMaestro (String nombreMaestroSet){
   this.nombreMaestro = nombreMaestroSet;
   
   }
   
public void setnumDeTarjeta (int numDeTarjetaSet){
   this.numDeTarjeta = numDeTarjetaSet;
   
   }
public void setalumnos1(int alumnos1Set){
this.alumnos1= alumnos1Set;
}

     //getters
public String getnombreMaestro(){
      return this.nombreMaestro;

   }
   public int getnumDeTarjeta(){
      return this.numDeTarjeta;
   }
   public int getalumnos1(){
      return this.alumnos1;
         
   }
}