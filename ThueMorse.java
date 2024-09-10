public class ThueMorse{


    public static void main(String[] args) {
    

        int m = Integer.parseInt(args[0]);
        
       
        
        Boolean []Ary = new Boolean[((int)(Math.pow(2,m)))];
        for(int i=0 ; i<= ((int)(Math.pow(2.00,m))) ;i++){
            if(i==0){
                Ary[i]=false;
            }
            else if(i%2==0){
                Ary[i]=Ary[i/2];
            }
            else if(i%2 ==1){
                Ary[i]= !(true& Ary[i-1]) ;
            }
        }
       // for(int i=0 ;i < Ary.length;i++){
        //System.err.println(Ary[i]);}

        for(int i =0 ; i < m; i++){
            for(int j = 0 ; j < m ; j++){
                if(Ary[i]==Ary[j]){
                    System.out.print("+  ");
                }
                else{
                    System.out.print("-  ");
                }

            }
            System.out.print("\n");
        }
        

        

    
    }
    
}
