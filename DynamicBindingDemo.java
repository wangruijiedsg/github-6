package week8;
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
public class GraduateStudent extends Student{
}
public class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
public class Student extends  Person{
    @Override
    public String toString(){
        return "Student";
    }
}

