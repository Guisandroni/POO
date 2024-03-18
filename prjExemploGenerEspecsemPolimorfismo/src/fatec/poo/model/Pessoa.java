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
public class Pessoa {
    
    private String nome;
    private String dataNascimento;
    
    public Pessoa (String n, String dn){
        nome = n;
        dataNascimento = dn;
        
    }
    
    public String getNome(){
        return (nome);
    }
    
    public String getDataNascimento(){
        return (dataNascimento);
    }
    
}
