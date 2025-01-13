import java.util.Scanner;

/**
 * @author AnaIJim
 *
 * Realiza un programa que calcule la nota (mostrada con dos decimales) de la primera evaluación del módulo de Programación.
 * La nota se compone de un 30% de la nota de prácticas y un 70% de la nota del examen. La nota de las prácticas es la media de lo obtenido en cada una de las prácticas. A lo largo de la evaluación se han realizado dos prácticas.
 * El programa debe pedir al usuario la nota de las prácticas y la nota del examen, y mostrar la nota de la evaluación.
 */

public class Ejercicio01 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double nota1ev = 0;
        // nota de prácticas (30%) = media de 2 prácticas
        // +
        // nota de examen (70%)
        System.out.print("Nota de la P01: ");
        // como trabajaremos con decimales, vamos a poner todas las notas double
        double p01 = scanner.nextDouble();
        System.out.print("Nota de la P02: ");
        double p02 = scanner.nextDouble();
        System.out.print("Nota del examen: ");
        double examen = scanner.nextDouble();
        System.out.println("=======================");
        nota1ev = ((p01 + p02) / 2) * (30.0 / 100.0) + examen * (70.0 / 100.0);
        System.out.printf("Nota 1ª evaluación: %.2f", nota1ev);
    }
}
