public class CMYKtoRGB {
    public static void main(String[] args){
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);
        int r,g,B;
        double w;
        w= 1 - b;
        r= (int)Math.round(255*w*(1-c));
        g=(int) Math.round(255*w*(1-m));
        B=(int)Math.round(255*w*(1-y));
        System.out.println("Red = "+r);
        System.out.println("Green = " +g);
        System.out.println("Blue = "+B);
        

    }
}
