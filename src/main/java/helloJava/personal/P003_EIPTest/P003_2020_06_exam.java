package helloJava.personal.P003_EIPTest;


abstract class Parent002 {
    private String name;
    abstract public String getName(String val);

    public String getName(){
        return "Vehicle name:"+ name;
    }
    public void setName(String val){
        name = val;
    }
}

class Child002 extends Parent002 {
    public Child002(String val){
        setName(val);
    }
    public String getName(String val){
        return "Car name : "+ val;
    }
}
public class P003_2020_06_exam {

    public static void main(String[] args) {

        Parent002 obj = new Child002("Spark");
        System.out.println(obj.getName());
    }
}
