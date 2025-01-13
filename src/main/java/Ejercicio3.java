import java.util.Scanner;

/**
 * @author AnaIJim
 * Realiza un programa que comience solicitando al usuario dos números enteros cualesquiera diferentes entre sí.
 * A continuación, el programa mostrará la secuencia de números entre el menor y el mayor (ambos inclusive) de los que ha introducido el usuario, pero sólo mostrará los impares.
 * Si los dos números introducidos son iguales, se debe indicar el error cometido y pedir al usuario que vuelva a intentarlo.
 */
public class Ejercicio3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce dos números diferentes entre sí: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Error: los números introducidos deben ser diferentes.\nVuelve a intentarlo");
        } else {
            int menor = num1;
            int mayor = num2;
            if (num1 > num2) {
                menor = num2;
                mayor = num1;
            }
            for (int i = menor; i <= mayor; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
