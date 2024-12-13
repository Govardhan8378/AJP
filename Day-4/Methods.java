class Rectangle {
    int l=10,b=30;
    int area(){
        int area=l*b;
       return area;
    }
    int perimeter(int l,int b){
        int result=2*(l+b);
        return result;
    }
}
public class Methods {
    public static void main(String[] args) {
       Rectangle im=new Rectangle();
      System.out.println("Area="+im.area());
     System.out.println("perimeter="+ im.perimeter(20, 40));
    }
}
