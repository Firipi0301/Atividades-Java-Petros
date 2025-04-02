import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digiter uma valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.print("Este número é par ");
        } else {
            System.out.print("Esse número é impar ");
        }
    }
}
