package OPERATIONS;

public class Division {

    public RationalNum divide(RationalNum other1 , RationalNum other2){
        //formula : (a/b) / (c/d) = (a*d) / (b*c)
        int newNumerator = (other1.getNumerator()*other2.getDenominator());
        int newDenominator = (other1.getDenominator()*other2.getNumerator());

        return RationalNum.gcd(newNumerator,newDenominator);

    }
}
