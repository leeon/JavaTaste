package hit.jt.obj;

import java.util.HashSet;

public class UserManage {

    public static void main(String [] args){
        HashSet<User> group = new HashSet<User>();
        
        User user1 = new User(1);
        User user2 = new User(1);
        group.add(user1);
        group.add(user2);
        System.out.println(group.size());
        User another = new User(1);
        System.out.println(group.contains(another));
        
//        System.out.println(user1.equals(user2));
    }
}
