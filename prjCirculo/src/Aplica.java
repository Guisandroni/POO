/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482121040
 */
public class Aplica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Circulo objRaio1;
        Circulo objRaio2;
        
        
        
        objRaio1 = new Circulo();
        objRaio2 = new Circulo();
        
        
        objRaio1.setRaio(3.0);
        objRaio2.setRaio(1.0);
        
         System.out.println("Circulo 1");

        
        System.out.println("A medida de àrea: " + objRaio1.calcArea() );
        System.out.println("A medida do périmetro: " + objRaio1.calcPerimetro());
        System.out.println("A medida do diametro: " + objRaio1.calcDiametro());
        
        System.out.println("Circulo 2");
        
         System.out.println("A medida de àrea: " + objRaio2.calcArea() );
        System.out.println("A medida do périmetro: " + objRaio2.calcPerimetro());
        System.out.println("A medida do diametro: " + objRaio2.calcDiametro());
    }
    
}
