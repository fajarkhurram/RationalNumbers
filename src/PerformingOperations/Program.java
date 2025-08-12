package PerformingOperations;

import OPERATIONS.*;

public class Program {
    public void run(){

        RationalNum r1 = new RationalNum(30,35);
        RationalNum r2 = new RationalNum(24 , 12);

        Addition a = new Addition();
        RationalNum sum = a.add(r1,r2);

        Subtraction s = new Subtraction();
        RationalNum diff = s.sub(r1 , r2);

        Multiply m = new Multiply();
        RationalNum product = m.multiply(r1, r2);

        Division d = new Division();
        RationalNum divide = d.divide(r1, r2);

    }
}
