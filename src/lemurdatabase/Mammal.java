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
public class Mammal {
    
    private int itsAge;
    private double itsWeight;
    private String gender;
     
    
    public Mammal() {
    itsAge = (int)(Math.random() * 12 + 1);
        itsWeight = (Math.random() * 5 + 1);
        int num = (int)(Math.random() * 2 + 1);
        if(num == 1){
            gender = "Male";
        }
        else {
            gender = "Female";
        }
     
  }
    
   //age
    public int getAge() {
      return itsAge;
  }
    
    public void setAge(int newAge) {
      itsAge = newAge;
  }
    
    //weight
    public double getWeight() {
      return itsWeight;
  }

    public void setWeight(int newWeight) {
      itsWeight = newWeight;
  }
    
  //gender
    public String getGender() {
      return gender;
  }
    
    public void setGender (String newGender) {
      gender = newGender;
  }
    
//structure of output
    public String toString () {
        
        String output = "";
        output += "Age: " + itsAge + "\n";
        output += "Weight: " + itsWeight + "\n" ; 
        output += "Gender: " + gender;
        
        return output;

    }
    

    
}
