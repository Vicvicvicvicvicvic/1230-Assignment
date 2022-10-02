public class Staff extends Person
{
     private String jobtitle;
     
     public Staff()
     {
          super();
          jobtitle = "not define";
     }
     
     
     public Staff (String newName, String newId, String newJobtitle)
     {
          super(newName, newId);
          jobtitle = newJobtitle;
     }
     
     public String getJobtitle()
     {
          return jobtitle;
     }
     
     public void setJobtitle(String newJobtitle)
     {
          jobtitle = newJobtitle;
     }
     
     public void set(String newName, String newId, String newJobtitle)
     {
          super.set(newName, newId);
          jobtitle = newJobtitle;
     }
     
     public String toString()
     {
          return super.toString() + " " + "Job Title = " + jobtitle;
     }
}