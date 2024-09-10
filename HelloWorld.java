public class HelloWorld
{
    public static void main(String[] args){
        System.out.println("Hello, World");
        int n = 123456789;
int m = 0;
while (n != 0)
{
   m = (10 * m) + (n % 10);
   n = n / 10;
}
System.err.println(m);
 int j = 0;
for (int i = 0; i < 10; i++){
   j += i;}
System.err.println(j);   
    }
}