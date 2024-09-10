public class GeneralizedHarmonic {
   public static void main(String[] args) {
    int n,r;
    n= Integer.parseInt(args[0]) ;
    r=Integer.parseInt(args[1]);
    double harm=0.00;
    for(int i=1;i<=n;i++){
        harm+=1/Math.pow(i,r);
    }
    System.err.println(harm);

   }
    
}
    
