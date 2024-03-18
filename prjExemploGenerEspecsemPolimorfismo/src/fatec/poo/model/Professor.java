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
public class Professor extends Pessoa{
    private  int regFuncional ;
    private double salario;
    
    
    public Professor ( int reg , String x  , String y){
        super (x,y);
        regFuncional = reg;
        
    }
    
    public void setSalario ( double sl){
        salario = sl;
    }
    
    
    
    public int getRegFuncional (){
        return (regFuncional);
    }
    
    public double getSalario(){
        return (salario);
    }
    
    
    
    
}
