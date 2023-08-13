package objects_and_classes.constructor;
// parameterize constructor.

public class test {
    public static void main(String[] args) {
        Student s = new Student(102,"Aruna","Maity");
       // s.getStudent();
    }
}

class Student{
    private int Std_Id;
    private String Std_name;
    private String Surname;
    private int Mobile;


    void getStudent(){
        System.out.println("Student Id: "+Std_Id+" Student Name: "+Std_name);
    }
    Student(int id, String name){
        this.Std_Id = id;
        this.Std_name = name;
    }
    Student(int id, String name, String surname){
        this.Std_Id=id;
        this.Std_name=name;
        this.Surname=surname;
        System.out.println("id: "+this.Std_Id+" name: "+this.Std_name+" surname: "+this.Surname);
    }
    Student(int id, String name, String surname, int mobile){
        this.Mobile=mobile;
        this.Std_name=name;
        this.Std_Id=id;
        this.Surname=surname;
    }


    Student(){
        Std_Id=101;
        Std_name="Mohit";
    }
}