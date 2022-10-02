public class Faculty extends Person
{
     private String department;
     private String title;
     
     public Faculty()
     {
          super();
          department = "not define";
          title = "not define";
     }
     
      public Faculty(String newName, String newId, String newDepartment, String newTitle)
     {
          super(newName, newId);
          department = newDepartment;
          title = newTitle;
     }
     
     public String getDepartment()
     {
          return department;
     }
     
     public String getTitle()
     {
          return title;
     }
     
     public void setDepartment(String newDepartment)
     {
          department = newDepartment;
     }
     
     public void setTitle(String newTitle)
     {
          title = newTitle;
     }
     
     public void set(String newName, String newId, String newDepartment, String newTitle)
     {
          super.set(newName, newId);
          department = newDepartment;
          title = newTitle;
     }
     
     public String toString()
     {
          return super.toString() + " " + "Department = " + department + " " + "Title = " + title;
     }
          
}