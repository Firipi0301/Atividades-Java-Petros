import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double soma, media;

      System.out.print("Digite um valor da nota1: ");
      double nota1 = sc.nextDouble();

        System.out.print("Digite um valor da nota2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite um valor da nota3: ");
        double nota3 = sc.nextDouble();

        soma = nota1 + nota2 + nota3;
        media = soma / 3;

        System.out.printf("sua media foi %.2f parabéns pelo seu resultado: ", media);

        sc.close();
    }
}