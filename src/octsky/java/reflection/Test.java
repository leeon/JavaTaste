package octsky.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * The basic class to test Reflection
 * 
 * @author leeon
 * @since 2012 3 17
 */
public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		

        Class cls1 = Role.class;
        Class cls2 = Class.forName("yui.Role");
        
        Object o = cls1.newInstance(); 
        //Object o1 = new Role();   
        

        
        Constructor con = cls1.getDeclaredConstructor(new Class[]{String.class});
        con.setAccessible(true);
        Object obj = con.newInstance(new Object[]{"liyang",2});
        System.out.println(obj); 
        
        Constructor con1[] = cls1.getDeclaredConstructors();
        con1[1].setAccessible(true);
        Object obj1 = con1[1].newInstance(new Object[]{"tom"});
        System.out.println(obj1);
        
        

        Field mem = cls1.getDeclaredField("name");
        mem.setAccessible(true);      
        System.out.println("we get form field :"+mem.get(obj));
         

        Method f = cls1.getMethod("getName", null);
        Object name = f.invoke(obj, null);
		System.out.println("we invoke method : "+ name);
		
	}
	


}
