public class Student extends Person
{
     private String degree;
     private double gpa;
     
     public Student()
     {
          super();
          degree = "not define";
          gpa = 0.0;      
     }
     
     public Student(String newName, String newId, String newDegree, double newGpa)
     {
          super(newName, newId);
          degree = newDegree;
          gpa = newGpa;
     }
     
     public String getDegree()
     {
          return degree;
     }
     
     public double getGpa()
     {
          return gpa;
     }
     
     public void setDegree(String newDegree)
     {
          degree = newDegree;
     }
     
     public void setGpa(double newGpa)
     {
          gpa = newGpa;
     }
     
     public void set(String newName, String newId, String newDegree, double newGpa)
     {
          super.set(newName,newId);
          degree = newDegree;
          gpa = newGpa;
     }
     
     public String toString()
     {
          return super.toString() + " " + "Degree = " + degree + " " + "GPA = " + gpa;
     }
     
          
}