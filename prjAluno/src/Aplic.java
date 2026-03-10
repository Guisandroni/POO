import java.util.Scanner;

public class Aplic {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aluno aluno = cadastrarAluno();
        exibirMenu(aluno);
        scanner.close();
    }

    private static Aluno cadastrarAluno() {
        Aluno aluno = new Aluno();

        System.out.print("Digite o RA: ");
        aluno.setRa(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Digite a nota da primeira prova: ");
        aluno.setNotaProva1(scanner.nextDouble());

        System.out.print("Digite a nota da segunda prova: ");
        aluno.setNotaProva2(scanner.nextDouble());

        System.out.print("Digite a nota do primeiro trabalho: ");
        aluno.setNotaTrabalho1(scanner.nextDouble());

        System.out.print("Digite a nota do segundo trabalho: ");
        aluno.setNotaTrabalho2(scanner.nextDouble());

        System.out.println("\nAluno cadastrado com sucesso!\n");
        return aluno;
    }

    private static void exibirMenu(Aluno aluno) {
        int opcao;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1 - Exibir notas");
            System.out.println("2 - Exibir média das provas");
            System.out.println("3 - Exibir média dos trabalhos");
            System.out.println("4 - Exibir média final e situação");
            System.out.println("5 - Exibir dados completos");
            System.out.println("0 - Sair");
            System.out.println("==========================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            System.out.println();

            processarOpcao(opcao, aluno);

        } while (opcao != 0);
    }

    private static void processarOpcao(int opcao, Aluno aluno) {
        switch (opcao) {
            case 1:
                exibirNotas(aluno);
                break;
            case 2:
                System.out.printf("Média das provas: %.2f%n%n", aluno.calcularMediaProvas());
                break;
            case 3:
                System.out.printf("Média dos trabalhos: %.2f%n%n", aluno.calcularMediaTrabalhos());
                break;
            case 4:
                System.out.printf("Média final: %.2f%n", aluno.calcularMediaFinal());
                System.out.printf("Situação: %s%n%n", aluno.getSituacao());
                break;
            case 5:
                System.out.println(aluno);
                System.out.println();
                break;
            case 0:
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção inválida!\n");
        }
    }

    private static void exibirNotas(Aluno aluno) {
        System.out.println("----- NOTAS -----");
        System.out.printf("RA: %d%n", aluno.getRa());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Prova 1: %.2f%n", aluno.getNotaProva1());
        System.out.printf("Prova 2: %.2f%n", aluno.getNotaProva2());
        System.out.printf("Trabalho 1: %.2f%n", aluno.getNotaTrabalho1());
        System.out.printf("Trabalho 2: %.2f%n", aluno.getNotaTrabalho2());
        System.out.println("-----------------\n");
    }
}
