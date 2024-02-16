package carlosflores_examen.pkg1;

import java.util.Scanner;

public class CarlosFlores_Examen1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean var = true;
        String historial = "";
        do{
            System.out.println("---MENU");
            System.out.println("1.Ejercicios String");
            System.out.println("2.Respuestas a preguntas");
            System.out.println("3.Mostrar el historial del menú");
            System.out.println("4.Salir");
            System.out.print("Ingrese una opcion: ");
            int op = leer.nextInt();
            switch(op){
                
                case 1:{
                    historial = historial + 'y';//se registra la visita al ejercicio
                    System.out.println("\n---Ejercicios String");
                    String cad = "";
                    String mitad1 = "";
                    String mitad2 = "";
                    int m1 = 0;
                    int m2 = 0;
                    while(cad.length() < 8){
                        System.out.println("Ingrese una cadena de 8 o mas caracteres:");
                        leer.nextLine();
                        cad = leer.nextLine();
                        if(cad.length() < 8){
                            System.out.println("Porfavor, ingrese una cadena de 8 o mas caracteres.");
                        }
                    }
                    if(cad.length()% 2 == 0){
                        for (int i = 0; i < cad.length(); i++) {
                            if(i < cad.length()/2){
                                mitad1 += cad.charAt(i);
                            }else{
                                mitad2 += cad.charAt(i);
                            }
                        }
                        for (int i = 0; i < cad.length(); i++) {
                            if(i % 2 == 0){
                                System.out.print(mitad1.charAt(m1));
                                m1++;
                            }else{
                                System.out.print(mitad2.charAt(m2));
                                m2++;
                            }
                            if(i < cad.length()-1){
                                System.out.print("-");//separar caracteres
                            }
                        }
                    }else{
                        cadena_invertida(cad);//metodo para imprimir una cadena invertida
                    }
                    System.out.println();
                    System.out.println();
                    break;
                }//fin case 1
                
                case 2:{
                    historial = historial + 'x';//se registra la visita al ejercicio
                    System.out.println("\n---Respuestas a preguntas");
                    System.out.println("\nDescriba el funcionamiento de los ciclor for, while y do while:"
                            + "\n-Son ciclos que realizan tareas mientras no excedan limitaciones impuestas.");
                    System.out.println("\nDescriba el funcionamiento de .charAt(), indexOf() y .legth():"
                            + "\n-Son metodos que nos sirven para trabajar con cadenas, el .charAt() busca un caracter especifico segun el indice ingresado,"
                            + "\nindexOf() busca un substring dentro de otra cadena,.legth() nos devuelve en un int cuanto mide la cadena empezando a contar desde 0.");
                    System.out.println("\nMencione 2 tipos de datos primitivos de java y cual es su uso:"
                            + "\n1)Int, almacena numeros enteros "
                            + "\n2)String, almacena una cadena de caracteres");
                    System.out.println();
                    break;
                }//fin case 2
                
                case 3:{
                    System.out.println("---Mostrar el historial del menú");
                    for (int i = 0; i < historial.length(); i++) {//imprime el historial
                        if(historial.charAt(i) == 'y'){
                            System.out.print("Ejercicios String");
                        }else{
                            System.out.print("Respuestas a preguntas");
                        }
                        if(i < historial.length()-1){
                            System.out.print(" - ");
                        }
                    }
                    System.out.println();
                    System.out.println("");
                    break;
                }//fin case 3
                
                case 4:{
                    System.out.println("Ha salido del programa, nos vemos");
                    int salida =1;
                    var = salida(salida);//metodo para salir
                    System.out.println();
                    break;
                }//fin case 4
                
                default:{
                    System.out.println("Opcion no valida intente de nuevo.");
                    System.out.println();
                    break;
                }//fin default
                
            }//fin switch
            
        }while(var);//fin while
    
    }//fin main
    
    public static boolean salida(int var){
        boolean porfavor_lic = true;
        if(var == 1){
            porfavor_lic = false;
        }
        return porfavor_lic;
    }
    
    public static void cadena_invertida(String cad){
        String mitad1 = "";
        String mitad2 = "";
        for (int i = 0; i < cad.length(); i++) {
            if(i < cad.length()/2){
                mitad1 += cad.charAt(i);
            }else{
                mitad2 += cad.charAt(i);
            }
        }
        System.out.print("Cadena invertida: " + mitad2+mitad1);
    }
    
}//fin class
