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
public class TreeLemur extends Mammal {
    
    String food;
    String coatColor;
    String travel;
    
    //constructor 
    public TreeLemur (){
        
       super ();
       food = "fruits";
       coatColor = "Red";
       travel = "Large pack";
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
        
 
        
    
    
    
    
    
    
    
    
    
    
    
//   public TreeLemur (){
//       super ();
//       food = "";
//       mane = "";
//       travel = "";
//   }

//    //traveling style
//    public void travelStyle () {
//       travel = "Large groups";
//       System.out.println ("Pack size: " + travel);
//    }
//      
//    //what they eat/drink to survive 
//    public void nutrition () {
//        food = "fruits";
//        System.out.println("Food: " + food);
//    }
//    
//    //colour of mane 
//    public void maneColour () {
//        mane = "red";
////        System.out.println("Mane: " + mane);
//    }
   
}
