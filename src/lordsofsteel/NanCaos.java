/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ArnauMB
 */
public class NanCaos extends Nan implements Caos {

    public NanCaos(String NOM, int FOR, int CON, int VEL, int INT, int SOR, Armes arma) {
        super(NOM, FOR, CON, VEL, INT, SOR, arma);
    }
    
    public boolean atacPAReduida(Dau... d){
        return false;
    }
}
