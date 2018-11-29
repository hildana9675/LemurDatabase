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
public class DesertLemur extends Mammal {
    
    String food;
    String coatColor;
    double babyDeathRate;
    
    
    //constructor 
    public DesertLemur() {
        
       super ();
       food = "Gets water from cacti";
       coatColor = "white";
       babyDeathRate = 0.66;
       
    }
    
   
    public String toString () {
        String output = "";
        output += super.toString();
        output += "Food: " + food + "\n";
        output += "Coulour: " + coatColor + "\n" ;
        output += "Baby death rate: " + babyDeathRate + "\n";
        
        return output;
    }
    
  
}
