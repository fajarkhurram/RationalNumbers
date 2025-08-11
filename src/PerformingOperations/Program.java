package PerformingOperations;

import OPERATIONS.*;

public class Program {
    public void run(){

        RationalNum r1 = new RationalNum(12,24);
        RationalNum r2 = new RationalNum(30 , 35);

        Addition a = new Addition();
        a.add(r1 ,r2);

        Subtraction s = new Subtraction();
        s.sub(r1 , r2);

        Multiply m = new Multiply();
        m.multiply(r1, r2);

        Division d = new Division();
        d.divide(r1, r2);

    }
}
