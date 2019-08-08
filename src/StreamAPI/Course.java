package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private  List modules = new ArrayList();
    public void addModule(Module module){
        modules.add(module);
    }
    public List getModules() {
        return modules;
    }
}


 
class Module{
     private Student students;
     private String moduleName;
 
     public Module(String moduleName){
         this.moduleName = moduleName;
    }
 
 
    public String getModuleName() {
        return moduleName;
    }
 
    public Student getStudent() {
        return students;
    }
    public void setStudents(Student students) {
        this.students = students;
    }
}
 


