package intro;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {

    public static void main(String[] args) {

        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        u1.setUsername("ionel");
        u1.setPwd("p");
        u2.setUsername("maria");
        u2.setPwd("p");
        u3.setUsername("ana");
        u3.setPwd("p");

        List<User> l = new ArrayList<>(); //generic , diamond operator <>
        l.add(u1);
        l.add(u1);
        l.add(u1);


        System.out.println(l);//debug

        //iterez in lista
        // i de la 0 la n, afisam array de [i]
        for(int i =0;i<l.size();i++) {
            User u = l.get(i); //obtin elem curent
            System.out.println(u.getPwd());

        }



    }
}
