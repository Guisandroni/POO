/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482121040
 */
public class Aluno  extends Pessoa {
    private int regEscolar;
    private double mensalidade;
    
    
    public Aluno (int r, String n, String dn)
            
    {
       super(n,dn); // metodo para chamar a super classe PESSOA
       regEscolar = r;
    }
    
    public void setMensalidade ( double m){
        mensalidade = m;
    }
    
    public  int getRegEscolar (){
        return (regEscolar);
    }
    
    public double getMensalidade (){
        return (mensalidade);
    }
    
    
}
