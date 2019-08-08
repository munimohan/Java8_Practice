package StreamAPI;

public class Student{
    private int numberOfStudents;
 
    public Student(int number){
        this.numberOfStudents = number;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
 
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
 
 
      public static void main(String[] args) {
        // TODO code application logic here
        Course computerScience = new Course();
        Module algorithms = new Module("Algorithms");
        Student studentsOnAlgorithm = new Student(50);
        algorithms.setStudents(studentsOnAlgorithm);
        computerScience.addModule(algorithms);
        
      /* computerScience.getModules().stream().forEach((m) -&gt; {
            System.out.println("Module ---&gt;; "+m.getModuleName() + " \n"+ m.getStudent().getNumberOfStudents()+" students take this module");
        });*/
 
        
    }
 
}