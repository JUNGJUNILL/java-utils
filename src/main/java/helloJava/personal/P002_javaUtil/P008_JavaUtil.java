package helloJava.personal.P002_javaUtil;


interface InnerP008_JavaUtil {

    void hello(String str);     
}

public class P008_JavaUtil {


    public InnerP008_JavaUtil world(){
        return (str) -> {
            System.out.println("hello "+str);
        }; 
    }

    public static void main(String[] args) {

        P008_JavaUtil a = new P008_JavaUtil(); 
        InnerP008_JavaUtil instance = a.world();
        instance.hello("world!!!");

    }
}
