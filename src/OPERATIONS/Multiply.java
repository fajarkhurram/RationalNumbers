package OPERATIONS;

public class Multiply {
    public RationalNum multiply(RationalNum other1, RationalNum other2){
        //formula: a/b * c/d = (a*c) /(b*d)
        int newNumerator = (other1.getNumerator()* other2.getNumerator());
        int newDenominator = (other1.getDenominator()*other2.getDenominator());

        return RationalNum.gcd(newNumerator,newDenominator);

    }
}
