package lab2p1_diegorosales;

import java.util.Scanner;

public class LAB2P1_DIEGOROSALES {

    public static void main(String[] args) {
        Scanner seleccion = new Scanner(System.in);
        while (true) {
            int contador_2 = 2;
            int opcion;
            System.out.println("Bienvenido al menu de programas, seleccione el programa que desee iniciar");
            System.out.println("1: Inicia programa 1");
            System.out.println("2: Inicia programa 2");
            System.out.println("3: Inicia programa 3");
            System.out.println("4 Finaliza el menu");
            opcion = seleccion.nextInt();
            if (opcion == 1) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Inserte las 3 longitudes del triangulo");
                int lado_1 = leer.nextInt();
                int lado_2 = leer.nextInt();
                int lado_3 = leer.nextInt();

                if (lado_1 < 0 || lado_2 < 0 || lado_3 < 0) {
                    System.out.println("Las longitudes no pueden ser negativas");
                } else if (lado_1 + lado_2 > lado_3 && lado_2 + lado_3 > lado_1 && lado_3 + lado_1 > lado_2) {
                    System.out.println("Las longitudes ingresadas forman un triangulo");
                } else {
                    System.out.println("Las longitudes ingresadas NO forman un triangulo");
                }

            }// FIN OPCION 1
            else if (opcion == 2) {

                while (contador_2 == 2) {
                    Scanner S_N = new Scanner(System.in);
                    Scanner opcion_figura = new Scanner(System.in);
                    Scanner lados = new Scanner(System.in);
                    System.out.println("Eliga la forma cuya area desea calcular ");
                    System.out.println(" Si quiere calcular el area de rectangulo presione 1");
                    System.out.println(" Si quiere calcular el area de un triangulo presione 2");
                    System.out.println(" Si quiere calcular el area de un circulo presione 3");

                    int figura = opcion_figura.nextInt();

                    if (figura == 1) {
                        System.out.println(" Inserte el ancho del rectangulo: ");
                        int ancho = lados.nextInt();
                        System.out.println(" Inserte la altura del rectangulo: ");
                        int altura = lados.nextInt();
                        int area = ancho * altura;
                        System.out.println("El area del rectangulo es de " + area);
                        System.out.println("Quiere calcular otra figura? [Si = 1 /No = 2]");
                        int SI_NO = S_N.nextInt();
                        if (SI_NO == 1) {
                            contador_2 = 2;
                        } else {
                            contador_2 = 0;
                        }

                    }//OPCION RECTANGULO
                    else if (figura == 2) {
                        System.out.println(" Inserte la base del triangulo");
                        int base = lados.nextInt();
                        System.out.println(" Inserte la altura del triangulo");
                        int altura = lados.nextInt();
                        float area = base * altura * 1 / 2;
                        System.out.println(" El area del triangulo es de " + area);
                        System.out.println("Quiere calcular otra figura? [Si = 1 /No = 2]");
                        int SI_NO = S_N.nextInt();
                        if (SI_NO == 1) {
                            contador_2 = 2;
                        } else {
                            contador_2 = 0;
                        }

                    }// OPCION TRIANGULO
                    else if (figura == 3) {
                        System.out.println("Inserte el radio del circulo: ");
                        double radio = lados.nextInt();
                        radio = Math.pow(radio, 2);
                        double area = radio * Math.PI;
                        System.out.println("El area del circulo es de " + area);
                        System.out.println("Quiere calcular otra figura? [Si = 1 /No = 2]");
                        int SI_NO = S_N.nextInt();
                        if (SI_NO == 1) {
                            contador_2 = 2;
                        } else {
                            contador_2 = 0;
                        }

                    }// OPCION CRICULO
                }// LOOP OPCION 2

            }// FIN OPCION 2
            else if (opcion == 3) {
                Scanner numero = new Scanner(System.in);
                boolean PRIMO = false;
                boolean PAR;

                System.out.println("Ingrese un numero");
                int numero_1 = numero.nextInt();
                int contador = 1;
                int contadorPrimos = 0;
                while (contador <= numero_1) {
                    if (numero_1 % contador == 0) {
                        contadorPrimos++;
                    } 
                    contador += 1;
                    
                }
                if (contadorPrimos <= 2) {
                         PRIMO = true;
                    }

                if (PRIMO) {
                    System.out.println("PRIMO");
                } else {
                    System.out.println("NO ES PRIMO");
                }
                if (numero_1 % 2 == 0) {
                    PAR = true;
                    if (PAR == true) {
                        System.out.println("PAR");
                    }
                } else {
                    PAR = false;
                    System.out.println("IMPAR");

                }

            }//FIN DE OPCION 3
            else if (opcion == 4) {
                System.out.println("El programa ha finalizado");
                break;

            }

        }//fin del loop
    }// fin del main
}// fin del class

