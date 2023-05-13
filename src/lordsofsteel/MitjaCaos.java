/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ArnauMB
 */
public class MitjaCaos extends Mitja implements Caos {

    public MitjaCaos(String NOM, int FOR, int CON, int VEL, int INT, int SOR, Armes arma) {
        super(NOM, FOR, CON, VEL, INT, SOR, arma);
    }

    @Override
    public boolean atacPAReduida(int valor) {
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();
        int valor2 = dau1.llencar() + dau2.llencar() + dau3.llencar();
        if(valor<valor2){
            return true;
        }else 
            return false;
            
    }

}