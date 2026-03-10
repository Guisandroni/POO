public class Aluno {

    private int ra;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho1;
    private double notaTrabalho2;

    private static final double PESO_PROVAS = 0.75;
    private static final double PESO_TRABALHOS = 0.25;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    public Aluno() {
    }

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double nota) {
        this.notaProva1 = validarNota(nota);
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double nota) {
        this.notaProva2 = validarNota(nota);
    }

    public double getNotaTrabalho1() {
        return notaTrabalho1;
    }

    public void setNotaTrabalho1(double nota) {
        this.notaTrabalho1 = validarNota(nota);
    }

    public double getNotaTrabalho2() {
        return notaTrabalho2;
    }

    public void setNotaTrabalho2(double nota) {
        this.notaTrabalho2 = validarNota(nota);
    }

    private double validarNota(double nota) {
        if (nota < NOTA_MINIMA) {
            return NOTA_MINIMA;
        }
        if (nota > NOTA_MAXIMA) {
            return NOTA_MAXIMA;
        }
        return nota;
    }

    public double calcularMediaProvas() {
        return PESO_PROVAS * (notaProva1 + 2 * notaProva2) / 3;
    }

    public double calcularMediaTrabalhos() {
        return PESO_TRABALHOS * (notaTrabalho1 + notaTrabalho2) / 2;
    }

    public double calcularMediaFinal() {
        return calcularMediaProvas() + calcularMediaTrabalhos();
    }

    public String getSituacao() {
        double media = calcularMediaFinal();
        if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Exame";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Aluno [RA: %d, Nome: %s, Média Final: %.2f, Situação: %s]",
            ra, nome, calcularMediaFinal(), getSituacao()
        );
    }
}
