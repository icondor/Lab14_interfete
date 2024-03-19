package intro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User u = new User();
        u.setUsername("ionel");
        u.setPwd("pwd1");

        Order o = new Order();
        o.setOrderID(1);
        o.setAmmount(100.00);

        StoreOnDisk.save(u);
        StoreOnDisk.save(o);
    }
}