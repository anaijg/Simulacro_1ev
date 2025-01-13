import java.util.Scanner;

/**
 * @author AnaIJim
 */
public class Ejercicio4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Elige una opción: ");
            System.out.println("1. Sumar números");
            System.out.println("2. Multiplicar números");
            System.out.println("3. Contar números");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Cuántos números vamos a sumar?");
                    int sumandos = scanner.nextInt(); // 4
                    int suma = 0;
                    for (int i = 0; i < sumandos; i++) {
                        int sumando = scanner.nextInt();
                        suma = suma + sumando;
                    }
                    System.out.println("Suma = " + suma);
                }
                case 2 -> {
                    System.out.println("¿Cuántos números vamos a multiplicar?");
                    int factores = scanner.nextInt(); // 4
                    int producto = 1;
                    for (int i = 0; i < factores; i++) {
                        int factor = scanner.nextInt();
                        producto *= factor;
                    }
                    System.out.println("Producto = " + producto);
                }
                case 3 -> {
                    System.out.println("Introduce números (0 para terminar)");
                    int numero = scanner.nextInt();
                    int contador = 0;
                    while (numero != 0) {
                        contador++;
                        numero = scanner.nextInt(); // la variable del bucle tiene que cambiar dentro del mismo porque si no nos metemos en un bucle infinito
                    }
                    System.out.println("Has introducido " + contador + " números.");
                }
                default -> System.out.println("Opción incorrecta");
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3); // quiero que mientras introduzca una opción incorrecta, sigo en el bucle
    }
}
