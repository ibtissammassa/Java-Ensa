package Exceptions;

public final class Operations{
    public static double division (double p,double q){
        if(q==0) throw new ArithmeticException("devision par 0");
        return p/q;
    }
    public static double somme(double p,double q){
        return p+q;
    }
}
