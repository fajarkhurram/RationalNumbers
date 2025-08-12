package OPERATIONS;

public class RationalNum {
     int numerator;
     int denominator;


    //constructor to set numerator and denominator
    public RationalNum(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Error: Denominator cannot be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    //We found GCD,so that we can use GCD to simplify rational numbers
    public static RationalNum gcd(int a,int b){

        int originalNum = a;
        int originalDen = b;

        while(b!=0){
            int temp = b; //b is empty now
            b = a % b;      //so it stores it's remainder
            a = temp; // stores old b
        }

        int gcdVal = a;  //the actual gcd

        //reduced fraction
        originalNum = originalNum / gcdVal;
        originalDen = originalDen /gcdVal;

        RationalNum r = new RationalNum(originalNum,originalDen);
        System.out.println(r);
       return r;


    }


    public void setNumerator(int num){
        this.numerator = num;
    }

    public void setDenominator(int num){
        this.denominator = num;
    }

    public  int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    @Override
    public String toString(){
        return (numerator+"/"+denominator);
    }
}
