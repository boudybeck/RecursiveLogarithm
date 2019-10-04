package model;

public class Logarithm {

    public Logarithm() {
    }

    public static int getIntLogarithm(int base, int n){//f.e. (int)2log25=(int)log25/log2 = (int)4,....=4
      return (int)getLogarithm(base, n);
    }

    public static double getLogarithm(int base, int n) {
        return getLogarithm(n) / getLogarithm(base);
    }

    private static double getLogarithm(int i){
        return Math.log(i);
    }
}
