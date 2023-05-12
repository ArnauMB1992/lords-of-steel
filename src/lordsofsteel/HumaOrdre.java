/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ArnauMB
 */
public class HumaOrdre extends Huma implements Ordre{
        
    public HumaOrdre (String NOM, int FOR, int CON, int VEL, int INT, int SOR, Armes arma){
        super(NOM, FOR, CON, VEL, INT, SOR, arma);
    }
        
    
    public void restaurarPS(Personatge personatge){
        int puntSalutInicials = personatge.getCON()+personatge.getFOR();
        int puntSalut = personatge.getPS();
        int puntSalutRestants = (int)(puntSalutInicials*0.1);
        puntSalut += puntSalutRestants;
        if(puntSalut>puntSalutInicials){
            puntSalut=puntSalutInicials;
        }
        personatge.setPS(puntSalut);
    }
}