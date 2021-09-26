package ex26;
import java.util.*;
public class PaymentCalculator {
    static public double calculateMonthsUntilPaidOff(double i, double b, double p){
        //System.out.printf("%f", Math.log((1 - Math.pow((1 + i),30))));
        return (-1*(1/30) * Math.log(1 + b/p * (1 - Math.pow((1 + i),30))) / Math.log(1 + i));
    }
}

//n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)