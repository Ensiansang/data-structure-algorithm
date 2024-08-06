package datastructures.dummyQuestion;


public class Factorial {

    public static int factorial(int n){
        if (n==1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        int myFact = factorial(15);

        System.out.println(myFact);


    }


//    public static BigInteger factorial(int n){
//        if (n==1) return BigInteger.ONE;
//        return BigInteger.valueOf(n).multiply(factorial(n - 1));
//    }
//
//    public static void main(String[] args)
//    {
//        BigInteger myFact = factorial(80);
//
//        System.out.println(myFact);
//
//
//    }


}
