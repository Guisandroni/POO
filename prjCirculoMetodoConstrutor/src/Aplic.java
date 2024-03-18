import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        double raio;
        int opcao;
        String unidade;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        //criação do ponteiro, instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
       Circulo objCirc =  new Circulo (unidade) ;
        
        System.out.print("Digite a medida do raio: ");
        raio = entrada.nextDouble();
        
        //Utilizando a passagem de mensagens
        objCirc.setRaio(raio);
        do{
             System.out.println("\n1 - Consultar Área");
             System.out.println("2 - Consultar Perímetro");
             System.out.println("3 - Consultar Diametro");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();
             
             System.out.println("\n\nMedida do Raio: " + objCirc.getRaio() + " " + objCirc.getUnidadeMedida());
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("A medida da área: " + objCirc.calcArea() + " " + objCirc.getUnidadeMedida());
                          break;
                 case 2 : System.out.println("A medida do perímetro: " + objCirc.calcPerimetro() + " " + objCirc.getUnidadeMedida());
                          break;
                 case 3 : System.out.println("A medida do diametro: " + objCirc.calcDiametro() + " " + objCirc.getUnidadeMedida());
             }
        }while (opcao < 4);
    }    
}
