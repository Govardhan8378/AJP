class StaticExample{
    public static void message(){
        System.out.println("This is a static method");
    }
}
public class StaticDemo {
    public static void main(String[] args) {
       StaticExample.message();
                 //or
    //    StaticExample s=new StaticExample();
    //    s.message();
    }
    
}
