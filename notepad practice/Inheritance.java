class Inheritance extends A{
    public static void main(String[] args) {
        // A a1= new A();

        System.out.println(showM());   
    }
}
class A{
    public static String m = "hellow world";

    static String showM(){
        return m;
    }
}