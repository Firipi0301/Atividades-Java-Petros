import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fh;

        System.out.print("Digite a temperatura em Celsius: ");
        double cs = sc.nextDouble();

        fh = (cs * 9/5) + 32;

        System.out.printf("Essa é sua temperatura em Fahrenheit %.2f.", fh);

    }
}
