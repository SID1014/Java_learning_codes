public class RandomWalkers {
    public static void main(String[] args){
    double total=0;
    double avg=0;
    int trials;
    int r;
    r=Integer.parseInt(args[0]);
    trials=Integer.parseInt(args[1]);

    for(int j=0;j<=trials;j++){

        int count =0;int x=0;int y=0;


        while(true){
            double prob=Math.random();
                if(prob<=0.25){
                    x+=1;
        
                }else if(prob<0.50){
                    x=x-1;
                }else if(prob<0.75){
                    y+=1;
                }else if(prob>0.75){
                    y=y-1;
                }
                if(r*r<=(x*x+y*y)){
                   
                    break;
                }
                count+=1;
        
        
            }
     total+=count;

    }
    avg=total/trials;
    System.out.println("average number of steps ="+avg);

}


}   
