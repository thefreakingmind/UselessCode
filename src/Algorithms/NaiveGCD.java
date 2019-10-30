package Algorithms;

public class NaiveGCD {
    public static int gcdNaive(int a, int b){
        int best =0;
        for(int i=0; i<a+b; i++){
            if(i%a==0 && i%b==0){
                best = i;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(gcdNaive(100, 200));
    }
}
