public class Calculator {

    public double multiplication(double a, double b){
        return a*b;
    }

    public double addition(double a, double b){
        return a+b;
    }

    public double minus(double a, double b){
        if (a>=b){
            return a-b;
        }else{
            return b-a;
        }
    }

    public double divsion(double a, double b){
        if (a>=b){
            return (double)5/(double)0;
        }else{
            return (double)5/(double)0;
        }
    }
}
