import java.util.*;
class Student{
    int ID;
    String Name;
    String gmail;

    public Student(int ID,String Name,String gmail){
        this.ID=ID;
        this.Name=Name;
        this.gmail=gmail;
    }
    public void display(){
        System.out.println("ID "+ID+"Name "+Name+"Gmail "+gmail);
    }
}
public class main{

    public static void main(String[] args) {
        ArrayList<Student> StudentList=new ArrayList<>();
        StudentList.add(new Student(249,"ravi","ravitheja4321@gmail.com"));
        StudentList.add(new Student(249,"ravi","ravitheja4321@gmail.com"));
        StudentList.add(new Student(249,"ravi","ravitheja4321@gmail.com"));
        StudentList.add(new Student(249,"ravi","ravitheja4321@gmail.com"));
        for (Student s: StudentList){ 
            s.display();
        }
    }

    
}
