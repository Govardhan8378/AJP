//program demonstrating static block and static method

class StaticExamplee
{
    int num;
    static int value;
    static
    {
        System.out.println("Static block");
    }
    public static void messagee()
    {
        System.out.println("Static method ");
    }
    public void acess()
    {
        System.out.println("Num="+num+"\nstatic value="+value);
    }
}
public class StaticDemotwo 
{
    public static void main(String[] args) 
    {
       StaticExamplee.messagee();
       StaticExamplee ex=new StaticExamplee();
       ex.num=30;
       ex.value=50;
       ex.acess();
    }
}
