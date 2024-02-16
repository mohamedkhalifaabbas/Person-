/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author elmnshawy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Person p1 = new Person("khalifa" , "2201220@student.eelu.edu.eg" , "01275741655" , 20 , 30 , 3 , 2004);
      Person p2 = new Person("mohamed" , "mohamed220@student.eelu.edu.eg" ,"01027876447" , 22 , 3 , 10 , 2005);
      System.out.println(p1.toString());
      System.out.println(p2.toString());

        System.out.println("Num of Person = " + Person.listOfPerson.size());
    }
    
}
