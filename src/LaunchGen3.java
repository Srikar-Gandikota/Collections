import java.util.ArrayList;

class Human{
    int age;
    public void disp(){
        System.out.println("I am a human");
    }
}
class Student extends Human{

}
class Employee1{

}

public class LaunchGen3 {
    public static void main(String[] args) {
//        Object obj=new Object();
//        String s = new String("Alien");
//        obj=s;
//        s=obj;//error or downcasting
        Human h = new Human();
        Student s = new Student();
        h = s;
        //s = h; //downcasting error
//        ArrayList<Human> hlist1 = new ArrayList<>();
//        ArrayList<Student>slist1=new ArrayList<>();
       // hlist1=slist1;//error
//        ArrayList<?> hlist2=new ArrayList<>();
//        ArrayList<Student> slist2=new ArrayList<>();
//        hlist2=slist2;//ok
//        ArrayList<? extends Human>hlist3=new ArrayList<>();//upper bound
//        ArrayList<Student> slist3=new ArrayList<>();
//        ArrayList<Employee1> elist3=new ArrayList<>();
//        ArrayList<Object> olist3=new ArrayList<>();
       //hlist3=elist3;//ok
        //hlist3=slist3;//ok
        //hlist3=olist3;//error
        ArrayList<? super Human> hlist4=new ArrayList<>();//lower bound
        ArrayList<Student> slist3=new ArrayList<>();
        ArrayList<Employee1> elist3=new ArrayList<>();
        ArrayList<Object> olist3=new ArrayList<>();
        //hlist4=elist3;//error
        //hlist4=slist3;//error
        hlist4=olist3;//ok

    }

}
