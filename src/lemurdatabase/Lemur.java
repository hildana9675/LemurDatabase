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
public class Lemur extends Mammal{
    
    String location = "Madagascar";
    String classification = "Prosimian";
    String coat = "fur";
    
    public void groom (){
        System.out.println("The lemur grooms itself by using its teeths as a comb");
    }
    
    //structure the output 
    public String toString () {
        String output = "";
        output += super.toString();
        output += "Location: " ; 
        output += "classification: " + classification + "\n";
        output += "coat: " + coat;
        
        if (getGender().equals("female")) {
            output += "\nFemale Lemur = Dominant role";
        }
        
        return output;
    }
    
    
    
    
    
    
    
    
    
    
}
