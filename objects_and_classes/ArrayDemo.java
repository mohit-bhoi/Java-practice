package objects_and_classes;
//in this program we creating object of array.

public class ArrayDemo {

    public static void main(String[] args) {

        Employee e[]; //this creating reference
        e = new Employee[5]; //allocation
        for (int i = 0; i < 5; i++) { //creating object through for loop
            e[i] = new Employee();
            e[i].setEmployee(i + 2, 1000 * (i + 1));
        }
        for (int i = 0; i < 5; i++) {
            e[i].printEmployee();
        }
    }

}

class Employee {
    private int empId;
    private float salary;

    public void setEmployee(int id, float s) {
        empId = id;
        salary = s;
    }

    public void printEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee salary: " + salary);
    }

}
