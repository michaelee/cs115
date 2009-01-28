/**
 * Represents a student.
 * @author Your Name Here
 */
public class Student {
  private String cwid;      // Student's campus wide ID
  private String fullName;  // Firstname + Lastname
  private double gpa;	    // Grade Point Average
  
  public Student(String cwid, String fullName, double gpa) {
    this.cwid = cwid;
    this.fullName = fullName;
    this.gpa = gpa;
  }
  
  public void printStudentInfo() {
    System.out.println("Student name: " + fullName);
    System.out.println("CWID: " + cwid);
    System.out.println("GPA:  " + gpa);
  }
  
  public static void main(String[] args) {
    // Create two Student objects
    Student s1 = new Student("A220184019", "Bruce Wayne", 4.0);
    Student s2 = new Student("A220184020", "Clark Kent", 2.0);
    // Call the printStudentInfo method for both Students
    s1.printStudentInfo();
    s2.printStudentInfo();    
  }
}
