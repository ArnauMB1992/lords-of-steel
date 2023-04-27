/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author ArnauMB
 */
public class Armes {
    
    protected String tipus;
    protected int WPOW;
    protected int WVEL; 


    public Armes(String tipus, int WPOW, int WVEL){
        
    }
    
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setWPOW(int WPOW) {
        this.WPOW = WPOW;
    }

    public void setWVEL(int WVEL) {
        this.WVEL = WVEL;
    }

    public String getTipus() {
        return tipus;
    }

    public int getWPOW() {
        return WPOW;
    }

    public int getWVEL() {
        return WVEL;
    }
    
}
