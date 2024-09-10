public class BandMatrix {
    public static void main(String[] args) {
        int m,n;
        m=Integer.parseInt(args[0]);
        n=Integer.parseInt(args[1]);
        for(int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                if(i==j){
                    System.out.print(" * ");
                }
                else if (i-n<=j&&j<=i+n) {
                    System.out.print(" * ");
                    
                } 
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println("");
        }

        int[] b = { 1, 2, 3 };
        int[] c = b;
        c[0] += b[2];
        c[1] += b[1];
        c[2] += b[0];
        System.out.println(c[0] + c[1] + c[2]);
    }
    
}
