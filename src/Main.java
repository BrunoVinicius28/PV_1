import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plataforma plataforma = new Plataforma("PlayStation 4");

        while (true) {
            System.out.println("MENU");
            System.out.println("1 - Adicionar jogo");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Mostrar jogo mais caro e mais barato");
            System.out.println("4 - Calcular quantos jogos possuem DLC");
            System.out.println("0 - Sair");
            System.out.print("Opção escolhida: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome do jogo: ");
                    String nomeJogo = scanner.nextLine();
                    System.out.print("Preço do jogo: R$");
                    double precoJogo = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Tem DLC (s/n): ");
                    boolean temDlcJogo = scanner.nextLine().equalsIgnoreCase("s");
                    plataforma.adicionarJogo(new Jogo(nomeJogo, precoJogo, temDlcJogo));
                    break;

                case 2:
                    plataforma.mostrarInformacoes();
                    break;

                case 3:
                    plataforma.mostrarJogoMaisCaroMaisBarato();
                    break;

                case 4:
                    int count = plataforma.contarJogosComDlc();
                    System.out.println("Número de jogos com DLC: " + count);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }


}