package org.leeon.java.reflecttion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * The basic class to test Reflection
 * 
 * @author Octobershiner
 * @since 2012 3 17
 */
public class Test {

	/**
	 * ����������class
	 * 1��ù��캯��Construtor
	 * 2��ó�Ա����Field
	 * 3��÷���Method
	 * */

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//��������͵����ַ�ʽ
        Class cls1 = Role.class;
        Class cls2 = Class.forName("yui.Role");
        
        Object o = cls1.newInstance(); //����һ��ʵ��
        //Object o1 = new Role();   //������ķ����ȼ�
        
        /**
         * ��ȡ���췽��Constructor
         * getConstructor()  only for public 
         * getDeclaredConstructor()  global access all 
         * 
         * */
        
        //ָ�������б��ȡ�ض��ķ���
        Constructor con = cls1.getDeclaredConstructor(new Class[]{String.class});
        con.setAccessible(true); //���ÿɷ��ʵ�Ȩ��
        Object obj = con.newInstance(new Object[]{"liyang",2});
        System.out.println(obj);  //��ӡһ������������Ϣ
        
        //��ȡ���еĹ��췽������
        Constructor con1[] = cls1.getDeclaredConstructors();
        con1[1].setAccessible(true);
        Object obj1 = con1[1].newInstance(new Object[]{"tom"});
        System.out.println(obj1);
        
        
        /**
         * ��ȡ��Ա����Field
         * getField()
         * getDeclaredField()
         * */
        Field mem = cls1.getDeclaredField("name");
        mem.setAccessible(true);      
        System.out.println("we get form field :"+mem.get(obj));
         
        
        /**
         * ������ķ��� Method
         * getMethod()
         * getDeclaredMethod()
         * 
         * */
        Method f = cls1.getMethod("getName", null);
        Object name = f.invoke(obj, null);
		System.out.println("we invoke method : "+ name);
		
	}
	


}
