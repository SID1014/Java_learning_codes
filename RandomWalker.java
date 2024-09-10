public class RandomWalker {
    public static void main(String[] args){
    double prob;
    int r,x,y;
    x=0;y=0;
    
    int count =0;
    r=Integer.parseInt(args[0]);
    while (true) {
        
        
        System.out.println("("+x+","+y+")");
        if(r==(int)Math.sqrt(x*x+y*y)){
            
            System.out.println("steps = "+count);
            break;
        }

        prob=Math.random();
        if(prob<0.25){
            x+=1;

        }else if(prob<0.50){
            x=x-1;
        }else if(prob<0.75){
            y+=1;
        }else if(prob>=0.75){
            y=y-1;
        }
        
        //System.out.println("("+x+","+y+")");

        
        count+=1;


    }


    }
    
}
