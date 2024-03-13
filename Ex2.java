import java.util.Scanner;

public class Ex2 {

    private static final Scanner scan = new Scanner(System.in); // scanner para coletar input do usuario

    private static void checkFibonacci(int n) {
        int[] arrayFib = new int[n]; // cria array com length de 'n' e popula os dois primeiros elementos
        arrayFib[0] = 0;
        arrayFib[1] = 1;

        // itera os indices 2 a n, populando a sequencia com f(n) = f(n-1) + f(n-2)
        for (int i = 2; i < n; i++) {
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];

            if (arrayFib[i] == n) { // verifica se o num do usuario equivale ao elemento atual
                System.out.println("Numero informado pertence a sequencia!");
                return; // sai do loop
            }
        }
        // elemento nao encontrado
        System.out.println("Numero NAO pertence a sequencia!");

    }

    public static void main(String[] args) {
        int userNum;
        try {
            System.out.println("Digite um numero: ");
            userNum = Integer.parseInt(scan.nextLine()); // numero do usuario
        } catch (NumberFormatException nfe) {
            userNum = 10;
        }

        checkFibonacci(userNum); // complexidade de tempo O(n)

    }
}
