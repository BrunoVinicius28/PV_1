import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (imc < 25) {
            System.out.println("Seu peso está dentro do normal.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 35) {
            System.out.println("Você está com obesidade grau 1.");
        } else if (imc < 40) {
            System.out.println("Você está com obesidade grau 2.");
        } else {
            System.out.println("Você está com obesidade grau 3.");
        }

        scanner.close();
    }

}

