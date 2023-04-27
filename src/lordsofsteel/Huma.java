/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ArnauMB
 */
public class Huma extends Personatges{
    
    public Huma (int FOR, int CON, int VEL, int INT, int SOR, Armes arma){
        super(FOR, CON, VEL, INT, SOR, arma);
    }
    @Override
    protected void calculaEstadistiquesSecundaries(){
        super.calculaEstadistiquesSecundaries();
        PS = CON+FOR+INT;
    }
      
    
}
