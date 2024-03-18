
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

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
        // TODO code application logic 
        
        
        Aluno objAlu = new Aluno (1010, "Carlos Silveira" , "15/03/1978");

        
        objAlu.setMensalidade(1500);
        
        System.out.println("Registro esolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
        
      Professor objProf = new Professor (2012 , "Dimas da Silva" , "15/03/1950");
      
      objProf.setSalario(7000);
      System.out.println("Registro do Professor : " + objProf.getRegFuncional());
      System.out.println("Nome: " + objProf.getNome());
      System.out.println("Data Nascimento: " + objProf.getDataNascimento());
      System.out.println("Sálario: " + objProf.getSalario());
      
      
        
        
    }
    
}
