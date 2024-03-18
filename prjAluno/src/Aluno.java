/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482121040
 */
public class Aluno {
    
    
    private int RA;
    private double NtPrv1 , NtPrv2, NtTrab1, NtTrab2;
    
    public void  setRa (int r){
        RA = r;
    }
    
    public int getRa( ){
        return (RA);
    }
    
    public void setNtPrv1 (double P1){
        NtPrv1 = P1;
    }
    
    public double getNtPrv1(){
        return (NtPrv1);
    }
    
    
    public void setNtPrv2 (double P2){
        NtPrv1 = P2;
    }
    
    public double getNtPrv2(){
        return (NtPrv2);
    }
    
    
    
    public void setNtTrab1 (double T1){
            NtTrab1 = T1;
    }
    
    public double getNtTrab1(){
        return (NtTrab1);
    }
    
     
    public void setNtTrab2 (double T2){
            NtTrab2 = T2;
    }
    
    public double getNtTrab2(){
        return (NtTrab2);
    }
    
    public double calcMediaProva(){
        return (0.75 * (NtPrv1 + 2 * NtPrv2 ) / 3 );
    }
    
    public double calcMediaTrab(){
        return (0.25 * ( NtTrab1 + NtTrab2) / 2);
        
    }
    
    
    public double calcMediaFinal(){
        return( calcMediaProva() + calcMediaTrab());
        
        
    }
    
}
