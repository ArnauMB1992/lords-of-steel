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
    public static void main(String[] args) {
        Nan n1 = new Nan("Tirion",8,6, 13,16,16,new Armes("Daga"));        
        Huma h1 = new Huma("Luis",13,16,6,10,6,new Armes("Espasa"));
        Mitja mi1 = new Mitja("Frodo",9,7,7,15,16,new Armes("Martell"));
        Maia ma1 = new Maia("Nil",7,9, 12,15,17,new Armes("Daga"));

        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);

        /* Menú principal */
        System.out.println("");
        System.out.println("** MENÚ PRINCIPAL **");
        System.out.println("1.- Afegir personatge");
        System.out.println("2.- Esborrar personatge");
        System.out.println("3.- Editar personatge");
        System.out.println("4.- Iniciar combat");
        System.out.println("5.- Sortir");
        System.out.println("**__________________**");
        System.out.print("Tria opció [1-5]: ");
        
        String entrada = sc.nextLine();
        
        // Només hem d'arribar aquí si estem segurs
        // que l'opció triada és un enter entre 1-5
        int opcio = Integer.parseInt(entrada);
              
        switch (opcio) {
            case 1:
                //agregaPersonatge();
                break;
            case 2:
                //borrarPersonatge();
                break;
            case 3:
                //editaPersonatge();
                break;
            case 4:
                iniciarCombat(personatges);
                break;
            case 5:
                System.out.println("¡Ha triat sortit!");
                break;
        }
        
        
    }
    
    
    public static void iniciarCombat(ArrayList<Personatge> personatges) {
        
        boolean[] seleccionats = new boolean[personatges.size()];
        Personatge[] lluitadors = new Personatge[2];
        for (int selec = 1; selec <= 2; selec++) {
            for (int i = 0; i < personatges.size(); ++i) {
                if (!seleccionats[i]) {
                    String tipus = "";
                    if (personatges.get(i) instanceof Nan)
                        tipus = "Nan";
                    else if (personatges.get(i) instanceof Huma)
                        tipus = "Huma";
                    else if (personatges.get(i) instanceof Mitja)
                        tipus = "Mitja";
                    else if (personatges.get(i) instanceof Maia)
                        tipus = "Maia";

                    System.out.printf("%d %s (%s)\n",(i+1),personatges.get(i).getNOM(),
                                                     tipus);
                }            
            }
            System.out.print("\nTria un personatge " + selec + ": ");
            int opcio = sc.nextInt();
            seleccionats[opcio-1] = true;
            lluitadors[selec-1] = personatges.get(opcio-1);
            System.out.println("Personatge triat: " + 
                              personatges.get(opcio-1).getNOM());        
        }
        
        
        // Inici combat
        Personatge atacant  = lluitadors[0];
        Personatge defensor = lluitadors[1];
        
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();
        
        int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
        //System.out.println("Valor daus: " + valor);
        
        if (valor <= atacant.getPA()) { // Atacant ataca
            valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            if (valor > defensor.getPE()) { // No aconsegueix esquivar
                defensor.setPS(defensor.getPS() - atacant.getPD());
            }
        }
        
        // Final ronda
        Personatge aux = atacant;
        atacant  = defensor;
        defensor = aux;
        if (valor <= atacant.getPA()) { // Atacant ataca
            valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            if (valor > defensor.getPE()) { // No aconsegueix esquivar
                defensor.setPS(defensor.getPS() - atacant.getPD());
            }
        }
        
        Personatge ganador, perdedor;
        if(defensor.getPS() <=0){
            ganador = atacant;
            perdedor = defensor;
        }else{
            ganador = defensor;
            perdedor = atacant;
        }
        System.out.println("¡La batalla ha acabat!");
        System.out.println("El guanyador es: "+ganador.getNOM());
        System.out.println("------------------------");
        
        ganador.restaurarPS();
        perdedor.restaurarPS();
        /*revisar*/
        /*mirar que los datos interoducidos sean correctos*/
        
    }

}
 

