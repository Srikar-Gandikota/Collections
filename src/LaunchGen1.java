import java.util.ArrayList;
class Employee{
   private Integer id;
   private String name;
   private String city;

   public Employee(Integer id, String name, String city) {
       super();
       this.id = id;
       this.name = name;
       this.city = city;
    }
    @Override
    public String toString(){
       return "Employee [id="+id+", name="+name+", city="+city+"]";
    }
}

public class LaunchGen1 {
    public static void main(String[] args) {
        //type safety
        int ar[]=new int[3];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        int data=ar[0];
        //type safety
        String []str=new String[3];
        str[0]="one";
        str[1]="two";
        str[2]="three";
        String info=str[1];
        //nottype safety
        ArrayList al=new ArrayList();
        al.add("Telusko");
        al.add("Java");
        al.add("Python");
//        al.add(44);
        String s1=(String)al.get(0);
        s1=s1.toLowerCase();
        System.out.println(s1);
        String s2=(String)al.get(1);
        s2=s2.toLowerCase();
        System.out.println(s2);
        String s3=(String)al.get(2);
        s3=s3.toLowerCase();
        System.out.println(s3);
//        String s4=(String)al.get(3);
//        s4=s4.toLowerCase();
//        System.out.println(s4);
        //type safety with Generics
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("SpringBoot");
        list.add("Microservices");
        for(String s:list){
            System.out.println(s);
        }
        ArrayList<Employee> employee=new ArrayList<>();
        employee.add(new Employee(1, "John", "New York"));
        employee.add(new Employee(2, "Alice", "Los Angeles"));
        employee.add(new Employee(3, "Bob", "Chicago"));
        for(Employee e:employee){
            System.out.println(e);
        }
    }
}
