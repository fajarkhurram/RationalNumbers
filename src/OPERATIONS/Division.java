package OPERATIONS;

public class Division {

    public void divide(RationalNum other1 , RationalNum other2){
        //formula : (a/b) / (c/d) = (a*d) / (b*c)
        int newNumerator = (other1.getNumerator()*other2.getDenominator());
        int newDenominator = (other1.getDenominator()*other2.getNumerator());

        RationalNum.gcd(newNumerator,newDenominator);

    }
}
