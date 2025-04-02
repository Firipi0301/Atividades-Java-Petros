import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N1: ");
        int N1 = sc.nextInt();

        System.out.print("Digite o valor de N2: ");
        int N2 = sc.nextInt();

        System.out.print("Digite o valor de N3: ");
        int N3 = sc.nextInt();

        if (N1 > N2 && N1 > N3) {
            System.out.print("N1 é o maior número ");
        } else if (N2 > N1 && N2 > N3) {
            System.out.print("N2 é o maior número ");
        } else {
            System.out.print("N3 é o maior número ");
        }
    }
}
