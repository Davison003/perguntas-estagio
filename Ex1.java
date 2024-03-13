public class Ex1 {
    public static void main(String[] args) {
        int i = 13, k = 0, soma = 0;

        while (k < i) {
            k += 1;
            soma += k;
        }

        System.out.println(soma); //91
    }
}