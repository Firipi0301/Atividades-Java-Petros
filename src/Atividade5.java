import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double IMC;

        System.out.print("Digite seu peso: ");
                double peso = sc.nextDouble();

        System.out.print("Digite seu altura: ");
                double altura = sc.nextDouble();

        IMC = peso / Math.pow(altura,2); // usando a expressão ao quadrado (2²) que seria o mesmo que "altura * altura ".
        System.out.printf("o seu IMC é %.2f \n", IMC);

        if (IMC < 18.5 || IMC > 25){
            System.out.print("Vá a um nutricionista seu IMC está irregular ");
        } else {
            System.out.print("Parabéns seu IMC está regular ƪ(˘⌣˘)ʃ");
        }

    }
}
