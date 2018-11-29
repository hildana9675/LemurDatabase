/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 //lemur [i] = new jumgle lemur;
package lemurdatabase;
import javax.swing.*;
/**
 *
 * @author himel9675
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int choice;
        String myInput;
        
        //turn into integer
        myInput = JOptionPane.showInputDialog("How many Lemurs do you want to add to the list?");
        int num = Integer.parseInt(myInput);
        
        //array
        Lemur lemurs[] = new Lemur[num];
        
        //show opstions 
        for(int i = 0; i < num; i++){
            choice = Integer.parseInt(JOptionPane.showInputDialog("Please enter the type of Lemur to add:\n"
                    + "1 - Tree Lemur\n2 - Desert Lemur\n3 - JungleLemur"));
         //allow user to get their choice
            if(choice == 1){
               System.out.println("Creating Tree Lemur.");
               //lemurs[i] =  new TreeLemur();
            }
            
            if(choice == 2){
               System.out.println("Creating Tree Lemur.");
            //   lemurs[i] = new DesertLemur();
            }
            
            if(choice == 3){
               System.out.println("Creating Tree Lemur.");
            //   lemurs[i] = new JungleLemur();
            }
            
            else {
                System.out.println("Invalid selection.  Try again.");
                i--;
            }
         }
        
        System.out.println("Displaying the list of Lemurs:\n--------------------------------------------\n");

        for(int i = 0; i < num; i++){
            System.out.println(lemurs[i].toString());
        }
   
    }
    
}
