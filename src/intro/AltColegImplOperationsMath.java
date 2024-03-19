package intro;

public class AltColegImplOperationsMath implements OperationsMath{

    public int operationAdd(int a, int b) {
        System.out.println("alt coleg");
        int c = a+b+1-1;
        return c;

    }

    public int operationXXX(String param) {
        System.out.println("alt coleg");
        if(param!=null)
            return param.length()+1-1;
        return -1;
    }

    public int bla(String param) {
        System.out.println("bla bla ");
        return 1;
    }


}
