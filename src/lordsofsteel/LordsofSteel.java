/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

import java.util.ArrayList;

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
        // Personatge normal: (8+5)/4 = 3
        // Nan: (8+6+5)/4 = 4
        // Nan: ps = (8+6) = 14
                //Arma arma = new Arma("Daga");
        Nan n1 = new Nan(8,6, 13,16,16,new Armes("Daga"));
        Huma h1 = new Huma (13,16, 6,10,6,new Armes("Espasa"));
        Mitja Mi1 = new Mitja (9,7, 7,15,16,new Armes("Martell"));
        Maia Ma1 = new Maia (7,9, 12,15,17,new Armes("Daga"));
        
        /*Personatge[] Personatges = new Personatge[4];
        Personatges[0]=n1;
        Personatges[1]=h1;
        Personatges[2]=Mi1;
        Personatges[3]=Ma1;*/
        
        ArrayList<Personatge> Personatges = new ArrayList<Personatge>();
        
        
        
        System.out.println("Punts de dany de n1: " + n1.getPD());
        System.out.println("Punts de salut de n1: " + n1.getPS());

    }
    
}
