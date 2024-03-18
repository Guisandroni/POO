
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482121040
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Aluno objAluno = new Aluno ();
       
       int Ra, option = 0;
       
       double NtPrv1 , NtPrv2, NtTrab1, NtTrab2;
       
      Scanner entrada = new Scanner (System.in);
       
       Scanner entradaRa = new Scanner (System.in);
       
       Scanner entradaNtPrv1 = new Scanner (System.in);
       
       Scanner entradaNtPrv2 = new Scanner (System.in);
      
       Scanner entradaNtTrab1 = new Scanner (System.in);

       Scanner entradaNtTrab2 = new Scanner (System.in);

       int i = 0;
               
           
        System.out.print("Digite o seu RA: ");
        Ra = entradaRa.nextInt();
        
        System.out.print("Digite a Nota da Primeira Prova: ");
        NtPrv1 = entradaNtPrv1.nextDouble();
        
        
        System.out.print("Digite a Nota da Segunda Prova: ");
        NtPrv2 = entradaNtPrv2.nextDouble();
        
        System.out.print("Digite a Nota do Primeiro Trabalho: ");
        NtTrab1 = entradaNtTrab1.nextDouble(); 
        
        System.out.print("Digite a Nota do Segundo Trabalho: ");
        NtTrab2 = entradaNtTrab2.nextDouble();
        
        // fazer a passagem dos dados para o objAluno
        
        
        
            do {
       
           System.out.println("1 - Exibir Nota dos Provas/Trabalhos");
           System.out.println("2 - Exibir a Media dos Trabalhos/Prova");
           System.out.println("3 - Exibir  a Media final");
           System.out.println("4 - Sair");
           
       
          
              System.out.println("O numero do RA Fornecido é : " + objAluno.getRa());
              System.out.println("A Nota da Prova 1 é : " + objAluno.getNtPrv1());
              System.out.println("A Nota da Prova 2 é : " + objAluno.getNtPrv2());
 
               System.out.println("A Nota do Trabalho 1 é : " + objAluno.getNtTrab1());
               System.out.println("A Nota do Trabalho 2 é : " + objAluno.getNtTrab2());

           option = entrada.nextInt();
           
           switch (option) {
               case 1 :  System.out.println("A Media das Provas é: " + objAluno.calcMediaProva());
                        break;
               case 2 :  System.out.println("A Media dos Trabalhos é: " + objAluno.calcMediaTrab());
                        break;
           
           
               case 3 : System.out.println("A Media final é :  " + objAluno.calcMediaFinal());
                        break;
           
           
           
               case 4 : System.out.println("Saindo do programa");
                        break;
           }
            
            
        } while (option < 4);
         
           
        }
}
        
       
       
    
    

