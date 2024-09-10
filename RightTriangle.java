public class RightTriangle{
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        boolean Right;
        Right = (a>0 ) && (b>0) && (c>0) && ((c*c == a*a +b*b)||(a*a ==b*b+c*c) ||(b*b == c*c + a*a));
        System.out.println(Right);


    }
}