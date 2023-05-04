/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ArnauMB
 */
public class LordsofSteel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        //Arma arma = new Arma("Daga");
        Nan n1 = new Nan(8,6, 13,16,16,new Armes("Daga"));
        
        // Personatge normal: (8+5)/4 = 3
        // Nan: (8+6+5)/4 = 4
        // Nan: ps = (8+6) = 14
        System.out.println("Punts de dany de n1: " + n1.getPD());
        System.out.println("Punts de salut de n1: " + n1.getPS());

    }
    
}
