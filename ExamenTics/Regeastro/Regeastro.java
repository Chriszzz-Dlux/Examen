package Regeastro;

import java.util.Scanner;
import java.lang.annotation.Repeatable;

public class Regeastro {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        Scanner leer =  new Scanner(System.in);
        int opcion,opc,opc2,opc3,acomulador;
        float promedio=0;
        int notas;
        Alumnos alumnos = new Alumnos();
        Materia materias= new Materia();
        Maestro maestro = new Maestro();
        int suma=0;
        do{
        System.out.println("________ChriSchool_______");
        System.out.println("1. Alumnos");
        System.out.println("2. Maestro");
        System.out.println("3. Materia");
        System.out.println("4. Salir");
        System.out.println("¿Que Deseas Hacer?");
        System.out.println("Escribe el numero de la opcion que desea realizar:");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                do{
                System.out.println("______Alumnos______");
                System.out.println("1. Agregar Alumno");
                System.out.println("2. Modificar Alumno");
                System.out.println("3. Eliminar Alumno");
                System.out.println("4. listar Alumnos");
                System.out.println("5. Salir");
                System.out.println("Escribe el numero de la opcion que deseas realizar");
                opc= entrada.nextInt();
                                switch(opc){
                                case 1:
                                    System.out.println("______Agregando Alumnos_______");
                                    System.out.println("-Ingresar Nombre del Alumno");
                                    alumnos.setnombreAlumno(entrada.next());
                                    System.out.println("-Ingresar Matricula");
                                    alumnos.setmatricula(entrada.nextInt());
                                    System.out.println("-Ingresar Semestre: ");
                                    alumnos.setsemestre(entrada.nextInt());
                                    System.out.println("-Ingresa Materia que Cursa");
                                    materias.setnombreMateria(entrada.nextLine());
                                    entrada.next();
                                    System.out.print("Ingrese cuantas veces castigo al Inge (Unidades):");
                                    notas= leer.nextInt();
                                    for (int i=1; i<=notas; i++){
                                        System.out.println("Ingrese calificaciones"+" "+i+" "+"de"+" "+ notas +":");
                                        int nota = leer.nextInt();
                                        suma=suma + nota;
                                        promedio = suma/notas;
}
System.out.println("Promedio del Inge: %"+promedio);
if (promedio <= 69){
    System.out.println("No Lo Lograste Pa Estas Reprovado :");
}
else{
    System.out.println("¡¡¡¡¡Lo Lograste Pa Estas Aprovado!!!!!");
                    System.out.println("-----¡¡¡¡Alumno Agregado Correctamente!!!!---- ");
                        }
                        break;
                    case 2:
                        do{
                        System.out.println("____________Modificando Alumnos_________");
                        System.out.println("_______Listando alumnos________");
                        System.out.println("Nombre del Alumno: "+ alumnos.getnombreAlumno());
                        System.out.println("Matricula: "+ alumnos.getmatricula());
                        System.out.println("Semestre: "+ alumnos.getsemestre());
                        System.out.println("Promedio: "+ promedio);
                        System.out.println("Que deseas Modificar: ");
                        System.out.println("1 -Nombre del Alumno: ");
                        System.out.println("2 -Matricula: ");
                        System.out.println("3 -Semestre: ");
                        System.out.println("4 -Promedio: ");
                        System.out.println("5 -Listar Alumnos");
                        System.out.println("6 -Regresar: ");
                        opc2= entrada.nextInt();
                        float prom=0;
                        switch (opc2){
                            
                            
                            case 1:
                                System.out.println("Ingresar otro Alumno:");
                                alumnos.setnombreAlumno(entrada.next());
                                break;
                            case 2:
                                System.out.println("Ingresar Matricula:");
                                alumnos.setmatricula(entrada.nextInt());
                                break;
                            case 3:
                                System.out.println("Ingresar Semestre:");
                                alumnos.setsemestre(entrada.nextInt());
                                break;
                            case 4:
                            int notas1;
                            int suma1=0;
                            System.out.print("Ingrese cuantas veces castigo al Inge (Unidades):");
                            notas1=leer.nextInt();
                            for (int i=1; i<=notas1;i++){
                                System.out.println("Ingrese calificaciones"+" "+i+" "+"de"+" "+ notas1+":");
                                int nota2= leer.nextInt();
                                suma1= suma1+ nota2;
                                prom=prom+ suma1/notas1;
                            }
                            System.out.println("Promedio del Inge: "+prom);
                            if (prom <= 69){
                                System.out.println("No Lo Lograste Pa Estas Reprobado : ");
                            }
                            else{
                                System.out.println("¡¡¡¡¡Lo Lograste Pa Estas Aprobado!!!!!");
                                System.out.println("-----¡¡¡¡Alumno Agregado Correctamente!!!!---- ");
                            }
                            break;
                            case 5:
                            System.out.println("_____Listando Alumnos_____");
                            System.out.println("Nombre del Alumno: "+ alumnos.getnombreAlumno());
                            System.out.println("Matricula: "+ alumnos.getmatricula());
                            System.out.println("Semestre: "+ alumnos.getsemestre());
                            System.out.println("Promedio: "+ prom);
                            System.out.println("¡¡¡¡¡Alumno Guardado Correctamente!!!!!");
                            break;
                            case 6:
                            opc2 = entrada.nextInt();
                            System.out.println("Escoge a que opcion volver");
                            System.out.println("1. Agregar Alumno");alumnos.setpromedio(0);
                            System.out.println("2. Modificar Alumno");
                            System.out.println("3. Eliminar Alumno");
                            System.out.println("4. listar Alumnos");
                            System.out.println("5. Salir");
                            break;
                        }
                    }while(opcion != 6);
                        break;
                    case 3:
                    System.out.println("______Eliminando Alumnos______");
                    alumnos.setnombreAlumno("");
                    alumnos.setmatricula(0);
                    alumnos.setsemestre(0);
                    alumnos.setpromedio(0);
                    System.out.println("¡¡¡¡Alumno eliminado correctamente!!!!");
                        break;
                    case 4:
                        System.out.println("_____Listando Alumnos_____");
                        System.out.println("Nombre del Alumno: "+ alumnos.getnombreAlumno());
                        System.out.println("Matricula: "+ alumnos.getmatricula());
                        System.out.println("Semestre: "+ alumnos.getsemestre());
                        System.out.println("Promedio: "+ promedio);
                        System.out.println("¡¡¡¡¡Alumno Guardado Correctamente!!!!!");
                        break;
                    case 5:
                    break;
                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }
                }while(opc != 5);
                break;
                case 2:
                do{
                System.out.println("______Maestros_______");
                System.out.println("1. Agregar Maestro");
                System.out.println("2. Cambiar Maestro");
                System.out.println("3. Eliminar Maestro");
                System.out.println("4. Lista de Maestro");
                System.out.println("5. Regresar");
                opc= entrada.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("______Agregar Datos del Maestro______");
                        System.out.println("Ingrese Nombre del Maestro");
                        maestro.setnombreMaestro(entrada.next());
                        System.out.println("Ingresa Numero de Tarjeta");
                        maestro.setnumDeTarjeta(entrada.nextInt());
                        System.out.println("Ingresar Cantidad de Alumnos");
                        maestro.setalumnos1(entrada.nextInt());
                        System.out.println("¡¡¡¡¡¡¡¡Maestro agregado correctamente!!!!!!!");
                        break;
                        
                    case 2:
                        do{
                        System.out.println("______Modificando Maestro______");
                        System.out.println("Nombre del Maestro: "+ maestro.getnombreMaestro());
                        System.out.println("Numero de Tarjeta: "+ maestro.getnumDeTarjeta());
                        System.out.println("Cantidad de Alumnos: "+ maestro.getalumnos1());
                        System.out.println("¿Que deseas modificar?:");
                        System.out.println("1. Nombre del Maestro");
                        System.out.println("2. Numero de Tarjeta");
                        System.out.println("3. Cantidad de Alumnos");
                        System.out.println("4. Listar Maestros");
                        System.out.println("5. Regresar");
                        opc2 = entrada.nextInt();
                        switch (opc2){
                            case 1:
                                System.out.println("Ingrese el nuevo nombre del Maestro: ");
                                maestro.setnombreMaestro(entrada.next());
                                break;
                            case 2:
                                System.out.println("ingresa el Numero Numero de Tarjeta:");
                                maestro.setnumDeTarjeta(entrada.nextInt());
                                break;
                            case 3:
                                System.out.println("Ingresa la Nueva Cantidad de Alumnos:");
                                maestro.setalumnos1(entrada.nextInt());
                                break;
                            case 4:
                            System.out.println("________Listando Maestros________");
                            System.out.println("Nombre: "+maestro.getnombreMaestro()); 
                            System.out.println("Numero: "+ maestro.getnumDeTarjeta());
                            System.out.println("Numero de Alumnos: "+ maestro.getalumnos1());
                            System.out.println("¡¡¡¡Maestro Guardado Correctamente!!!!");
                                break;
                            case 5:
                            
                            System.out.println("Elige a que opcion volver");
                            System.out.println("1. Agregar Maestro");
                            System.out.println("2. Cambiar Maestro");
                            System.out.println("3. Eliminar Maestro");
                            System.out.println("4. Lista de Maestro");
                            default:
                                System.out.println("Opcion no valida");
                                break;
                    }
                    }while(opc !=5);
                    break;
                    case 3:
                        System.out.println("_______Eliminando Maestros_______");
                        maestro.setnombreMaestro("");
                        maestro.setnumDeTarjeta(0);
                        maestro.setalumnos1(0);
                        System.out.println("¡¡¡¡¡Maestro Eliminado Correctamente!!!!!");
                        break;
                    case 4:
                        System.out.println("________Listando Maestros________");
                        System.out.println("Nombre: "+maestro.getnombreMaestro());
                        System.out.println("Numero: "+ maestro.getnumDeTarjeta());
                        System.out.println("Numero de Alumnos: "+ maestro.getalumnos1());
                        System.out.println("¡¡¡¡Maestro Guardado Correctamente!!!!");
                        break;
                        
                    case 5:
                    System.out.println("________ChriSchool_______");
                    System.out.println("1. Alumnos");
                    System.out.println("2. Maestro");
                    System.out.println("3. Materia");
                    System.out.println("4. Salir");
                    System.out.println("¿Que Deseas Hacer?");
                    System.out.println("Escribe el numero de la opcion que desea realizar:");
                    entrada.nextInt();
                            break;
                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }while (opcion!=6);
                }while(opcion !=5);
                break;
                case 3:
                do{
                System.out.println("________Materias______");
                System.out.println("1. Agregar Materia");
                System.out.println("2. Modificar Materia");
                System.out.println("3. Eliminar Materia");
                System.out.println("4. Listar Materia");
                opc= entrada.nextInt();
                switch(opc){
                    case 1:
                    System.out.println("______Agregar Materia_______");
                    System.out.println("-Nombre de la Materia");
                    entrada.nextLine();
                    materias.setnombreMateria(entrada.nextLine());
                    System.out.println("-Ingrese la Clave");
                    materias.setcontraseña(entrada.nextLine());
                    System.out.println("Ingrese cantidad de Unidades");
                    materias.setunidades(entrada.nextFloat());
                        break;
                    case 2:
                        do{
                        System.out.println("______Modificar Materias______");
                        System.out.println("-Nombre: "+ materias.getnombreMateria());
                        System.out.println("-contraseña: "+ materias.getcontraseña());
                        System.out.println("-Numero de Unidades: "+ materias.getunidades());
                        System.out.println("¿Que deseas modificas?");
                        System.out.println("1. Nombre: ");
                        System.out.println("2. contraseña: ");
                        System.out.println("3. Numero de Unidades: ");
                        System.out.println("4. Regresar");
                        opc2 = entrada.nextInt();
                        entrada.nextLine();
                        switch (opc2){
                            case 1:
                                System.out.println("Ingrese la Nueva Materia");
                                materias.setnombreMateria(entrada.nextLine());
                                break;
                            case 2:
                                System.out.println("Ingresa la Nueva Clave");
                                materias.setcontraseña(entrada.next());
                                break;
                            case 3:
                                System.out.println("Ingresa nueva Cantidad de Unidades");
                                materias.setunidades(entrada.nextFloat());
                                break;
                            case 4:
                            System.out.println("______Elige la opcion a la que quieres volver______");
                            System.out.println("1. Agregar Materia");
                            System.out.println("2. Modificar Materia");
                            System.out.println("3. Eliminar Materia");
                            System.out.println("4. Listar Materia");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }while(opc !=4);
                        break;
                    case 3:
                        System.out.println("______Eliminando Materias______");
                        materias.setnombreMateria("");
                        materias.setcontraseña("");
                        materias.setunidades(0);
                        System.out.println("¡¡¡Materia eliminada correctamente!!!");
                        break;
                    case 4:
                        System.out.println("****Listando Materia****");
                        System.out.println("Nombre: "+ materias.getnombreMateria());
                        System.out.println("Clave: "+ materias.getcontraseña());
                        System.out.println("Unidades: "+ materias.getunidades());
                        break;
                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }
                }while(opc != 4);
                break;
                case 4:
                System.out.println("Gracias por utilizar Nuestro Registro");
                break;
                default:
                System.out.println("opcion no valida");break;
            }
        }while(opcion != 4);
        entrada.close();
    
    }
}
