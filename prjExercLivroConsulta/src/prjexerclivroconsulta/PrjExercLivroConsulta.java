package prjexerclivroconsulta;

import java.util.Scanner;

class Livro {

    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro(int identificacao, String titulo) {
        this.identificacao = identificacao;
        this.titulo = titulo;
        this.situacao = false;
        this.valMultaDiaria = 0;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void emprestar() {
        situacao = true;
    }

    public double devolver(int diasAtraso) {
        situacao = false;
        return diasAtraso * valMultaDiaria;
    }
}

public class PrjExercLivroConsulta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a identificação do livro: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();

        Livro livro = new Livro(id, titulo);

        System.out.print("Digite o valor da multa diária: ");
        livro.setValMultaDiaria(sc.nextDouble());

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n1 – Consultar livro");
            System.out.println("2 – Emprestar livro");
            System.out.println("3 – Devolver livro");
            System.out.println("4 – Sair");
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Identificação: " + livro.getIdentificacao());
                    System.out.println("Título: " + livro.getTitulo());
                    System.out.println("Situação: " + (livro.getSituacao() ? "Emprestado" : "Disponível"));
                    break;

                case 2:
                    if (livro.getSituacao()) {
                        System.out.println("O livro está emprestado");
                    } else {
                        livro.emprestar();
                        System.out.println("Operação de empréstimo realizada com sucesso");
                    }
                    break;

                case 3:
                    if (!livro.getSituacao()) {
                        System.out.println("O livro já está disponível");
                    } else {
                        System.out.print("Digite a quantidade de dias em atraso: ");
                        int dias = sc.nextInt();
                        double multa = livro.devolver(dias);
                        System.out.println("Operação de devolução realizada com sucesso");
                        if (multa > 0) {
                            System.out.println("Valor da multa a ser pago: R$ " + multa);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
