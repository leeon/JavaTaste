package hit.jt.init;
public class Apple extends Fruit{
   //静态块
    static{
        System.out.println("In Apple static");
    }
    private int weight = 1; //初始化为1 注意区别这里和 初始化为0
    
    public Apple(int para_weight){
        System.out.println("Before Apple Constructer: weight = "+weight);
         System.out.println(this.getClass()); // 这是为了验证当前的类 fruit.Apple
        weight = para_weight;
        System.out.println("Apple Constructor: weight="+weight);
    }
    
    @Override
    public void show(){
        System.out.println("show apple: weight =" + weight);
    }
    
}
