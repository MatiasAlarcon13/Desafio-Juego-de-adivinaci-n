package Practica;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner teclado = new Scanner(System.in);
        int numeroUsuario = 0;

        System.out.println("Bienvenido a ADIVINA EL NUMERO SECRETO que consta de numeros desde el 0 hasta el 100, usted posee 5 intentos para adivinarlo");
        for (int intentos = 1; intentos < 6; intentos++) {
            if (numeroUsuario != numeroAleatorio) {
                System.out.println("Esta en el intento Numero \"" + intentos + "\"");
                System.out.println("Ingrese el Numero que cree que es el numero secreto: ");
                numeroUsuario = teclado.nextInt();
                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El Numero Secreto es Mayor");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El Numero Secreto es Menor");
                }
            }
        }
        if (numeroUsuario == numeroUsuario) {
            System.out.println("Felicidades, usted a adivinado el Numero secreto");
            System.out.println("Numero Secreto: " + numeroAleatorio + " y Numero Usuario: " + numeroUsuario);
        } else {
            System.out.println("Se le acabaron los intentos, el Numero Secreto era: " + numeroAleatorio);
        }
    }
}