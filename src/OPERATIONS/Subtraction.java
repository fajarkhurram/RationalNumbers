package OPERATIONS;

public class Subtraction {

    public RationalNum sub(RationalNum other1 , RationalNum other2){
        //formula: a/b + c/d = (a*d - b*c)/ (b*d)
        int newNumerator = (other1.getNumerator()*other2.getDenominator())-(other1.getDenominator()*other2.getNumerator());
        int newDenominator = (other1.getDenominator()*other2.getDenominator());

        return RationalNum.gcd(newNumerator,newDenominator);
    }
}
