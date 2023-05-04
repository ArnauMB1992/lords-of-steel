/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ArnauMB
 */
public class LordsofSteel {

    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Personatge normal: (8+5)/4 = 3
        // Nan: (8+6+5)/4 = 4
        // Nan: ps = (8+6) = 14
                //Arma arma = new Arma("Daga");
//        System.out.println("Punts de dany de n1: " + n1.getPD());
//        System.out.println("Punts de salut de n1: " + n1.getPS());
                
        Nan n1 = new Nan("Tirion",8,6, 13,16,16,new Armes("Daga"));
        Huma h1 = new Huma ("Luis", 13,16, 6,10,6,new Armes("Espasa"));
        Mitja Mi1 = new Mitja ("Frodo",9,7, 7,15,16,new Armes("Martell"));
        Maia Ma1 = new Maia ("Nil", 7,9, 12,15,17,new Armes("Daga"));
        
        /*Personatge[] Personatges = new Personatge[4];
        Personatges[0]=n1;
        Personatges[1]=h1;
        Personatges[2]=Mi1;
        Personatges[3]=Ma1;*/
        
        ArrayList<Personatge> Personatges = new ArrayList<Personatge>();
        Personatges.add(n1);
        Personatges.add(h1);
        Personatges.add(Mi1);
        Personatges.add(Ma1);
        
        
        /*MENU PRINCIPAL*/
        System.out.println("");
        System.out.println("**MENU PRINCIPAL**");
        System.out.println("1. Afegir Personatge");
        System.out.println("2. Borrar Personatge");
        System.out.println("3. Editar Personante");
        System.out.println("4. Iniciar Combat");
        System.out.println("5. Sortir");
        System.out.println("");
        System.out.println("Tria una opcio de [1 a 5]:");
        
        String entrada = sc.nextLine();
        /*completar*/
        
        /*cambiamos el sting por int, 
        solo si estamos seguros de que es una opcion correcta*/
        int opcio = Integer.parseInt(entrada);
        switch (opcio){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                iniciarCombar(Personatges);
                break;
            case 5:
                break;
        }

    }
    
        public static void iniciarCombar(ArrayList<Personatge> Personatges){
            
            boolean[] seleccionat = new boolean[Personatges.size()];
            
            for(int i = 0; i<Personatges.size(); i++){
            /*for(Personatges p: personatges)*/
                String tipus = "";
                if(Personatges.get(i) instanceof Nan)
                    tipus = "Nan";
                else if(Personatges.get(i) instanceof Mitja)
                    tipus = "Mitja";
                else if(Personatges.get(i) instanceof Maia)
                    tipus = "Maia";
                else if(Personatges.get(i) instanceof Huma)
                    tipus = "Huma";
                        
                System.out.printf("%d %s (%s)\n",(i+1),Personatges.get(i).getNOM(),tipus);            
            }
           
            System.out.println("\nTria un Personatge:");
            int opcio = sc.nextInt();
            seleccionat[opcio-1]=true;
            System.out.println("Personatge triat " + Personatges.get(opcio-1).getNOM());
            
            for(int i = 0; i<Personatges.size(); i++){
                if(!seleccionat[i]){
                String tipus = "";
                if(Personatges.get(i) instanceof Nan)
                    tipus = "Nan";
                else if(Personatges.get(i) instanceof Mitja)
                    tipus = "Mitja";
                else if(Personatges.get(i) instanceof Maia)
                    tipus = "Maia";
                else if(Personatges.get(i) instanceof Huma)
                    tipus = "Huma";
                        
                System.out.printf("%d %s (%s)\n",(i+1),Personatges.get(i).getNOM(),tipus);     
                }
            }
            
            System.out.println("\nTria un Personatge 2:");
            int opcio2 = sc.nextInt();
            seleccionat[opcio2-1]=true;
            System.out.println("Personatge triat " + Personatges.get(opcio-1).getNOM());
            
        }
    
}
