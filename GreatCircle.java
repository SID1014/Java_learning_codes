public class GreatCircle {
    
    public static void main(String[] args){
        double a = Math.toRadians(Double.parseDouble(args[0]));
        double b =  Math.toRadians(Double.parseDouble(args[1])
        );
        double c =  Math.toRadians(Double.parseDouble(args[2]));
        double d = Math.toRadians( Double.parseDouble(args[3]));
        double r= 6371;
        double dist,cal1,cal2,cal3;
        cal1=Math.pow(Math.sin((c-a)/2),2);
        cal2=Math.cos(a)*Math.cos(c)*Math.pow(Math.sin((d-b)/2),2);
        cal3=Math.sqrt(cal1+cal2);
        dist=2*r*Math.asin(cal3);
        System.out.println(dist +" kilometers");



    }
}
