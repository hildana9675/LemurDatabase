/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author himel9675
 */
public class JungleLemur extends Mammal{
    
    String food;
    String coatColor;
    String travel;
     
     //constructor 
    public JungleLemur (){
        
       super ();
       food = "mice, snails, and insects";
       coatColor = "black or blue coats;";
       travel = "small groups";
   }
    
    //structure of output
    public String toString () {
        String output = "";
        output += super.toString();
        output += "Food: " + food + "\n";
        output += "Coulour: " + coatColor + "\n" ; 
        output += "Pack size: " + travel;
        
        return output;

    }
    
}
