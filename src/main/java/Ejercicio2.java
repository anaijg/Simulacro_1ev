import java.util.Scanner;

/**
 * @author AnaIJim
 * Escribe un programa para predecir la probabilidad de lluvia para mañana a partir de varios datos atmosféricos suministrados por el usuario. Estos datos son:
 * La presión atmosférica: puede ser alta (A), media (M) o baja (B).
 * La humedad relativa: también puede ser alta (A), media (M) o baja (B).
 */
public class Ejercicio2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // presión: 'A', 'M' o 'B'
        System.out.print("Presión atmosférica: ");
        char presion = scanner.nextLine().charAt(0);
        System.out.print("Humedad: ");
        char humedad = scanner.nextLine().charAt(0);
        System.out.println("=======================");
        // para que siempre sea mayúscula

        switch (presion) {
            case 'b' -> presion = 'B';
            case 'm' -> presion = 'M';
            case 'a' -> presion = 'A';
        }

        switch (humedad) {
            case 'b' -> humedad = 'B';
            case 'm' -> humedad = 'M';
            case 'a' -> humedad = 'A';
        }

        // ahora determinamos la probabilidad de lluvia
        String probabilidadDeLluvia = "";

        if ((presion == 'B' && humedad == 'A') ||
                (presion == 'B' && humedad == 'B') ||
        presion == 'M' && humedad == 'M'){
            probabilidadDeLluvia = "Media";
        } else if (presion == 'B' && humedad == 'M') {
            probabilidadDeLluvia = "Alta";
        } else {
            probabilidadDeLluvia = "Baja";
        }

        System.out.println("Probabilidad de lluvia: " + probabilidadDeLluvia);
    }
}
