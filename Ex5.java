import java.util.Scanner;

public class Ex5 {

    private static final Scanner scan = new Scanner(System.in); // scanner para coletar input do usuario

    private static String inverterString(String str) {
        int len = str.length();
        String newStr = "";
        for (int i = 0; i < len; i++) {
            newStr += str.charAt(len - 1 - i); // itera adicionando os chars da str de modo descendente
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("Digite um string: ");
        String novaString = inverterString(scan.nextLine());
        System.out.println(novaString);
    }
}
