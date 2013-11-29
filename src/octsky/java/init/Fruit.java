package octsky.java.init;




/**
 * @author Octobershiner
 */
public class Fruit {
    //static block
    static {
        System.out.println("In Fruit static");
    }
    
    private Inner i = new Inner(); //a private member
    public Fruit(){
        System.out.println("Before Fruit Constructor");
        System.out.println(this.getClass().getName());
        show();  //由于多态的特性，此处子类Apple覆写的方法会被调用
        System.out.println("After Fruit Constructor");
    }
    public void show(){
        System.out.println("show:Fruit.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Apple(3);
    }
       
}
