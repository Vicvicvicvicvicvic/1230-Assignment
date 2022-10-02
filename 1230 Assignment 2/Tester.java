/****
 * Name: Zongxu Li(Victor)
 * Student Number: T00521219
 * Assignment Number: 1
 * Due Date: Sep 23, 2022
 * Program description: This program is testing for inheritance, which we have drive class named Tester, 
 * and parents class named: Person and child classes Student and Faculty.
*/

public class Tester
{
     public static void main(String[] args)
     {
          Person p1 = new Person();
          Person p2 = new Person("Steve", "S1230000");
                    
          Staff stf1 = new Staff();
          Staff stf2 = new Staff("Paul", "SPC002211", "Security Guard");
          
          Student s1 = new Student("BBA", 3.5); //Writing two objects for Student, Faculty, and Staff. Prepare for array.
          Student s2 = new Student("BCS", 2.7);
          Faculty f1 = new Faculty("Math", "Professor");
          Faculty f2 = new Faculty("Science", "Assistant");
          Staff st1 = new Staff("Security");
          Staff st2 = new Staff("Librarian");
                                      
          System.out.println("showing inital child class student values set by default and parameterized constructors");
          System.out.println(stf1);
          
          System.out.println("Set up value for parameterized value to constructor");
          System.out.println(stf2);
          System.out.println();
                    
          stf1.setName("Tom");
          stf1.setId("SPC456511");
          stf1.setJobtitle("Admission");
          
          System.out.println("Now testing on the get method for getName, getId, getJobtitle");
          stf1.getName();
          System.out.println(stf1.getName());
          stf1.getId();
          System.out.println(stf1.getId());
          stf1.getJobtitle();
          System.out.println(stf1.getJobtitle());

          System.out.println("End of testing get method for Student class");
          System.out.println();
              
          System.out.println("Testing about setName, setId, setJobtitle and set method");
          System.out.println(stf1);
          System.out.println(stf2);
          
          System.out.println("Testing Equals Method");
          System.out.println(p1.equals(p1)); //Testing the method if it works.
          System.out.println();
          System.out.println(p1.equals(p2)); //Compare not defined names and id to new assigned names and id.
          
          
          
     }
          
     
}