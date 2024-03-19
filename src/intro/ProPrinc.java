package intro;

public class ProPrinc {

    public static void main(String[] args) {


        int a =7;
        int b=8;

   OperationsMath op = new IonelImplOperationsMath();

     //   intro.OperationsMath op = new intro.AltColegImplOperationsMath();

        int result = op.operationAdd(6,7); // contract
        System.out.println(result);

        int r = op.operationXXX("salut din cluj"); //contract
        System.out.println(r);

        ( (IonelImplOperationsMath)op).metodaNoua(); //ceva specific

    }
}
