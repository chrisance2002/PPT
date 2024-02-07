public class divisible
{
    public static void main (String [] args)
    {
        int a= 44;
        System.out.println("Number is: "+a);
        if(a%5==0 || a%11==0)
        {
            System.out.println("The number " +a+ " is divisible by 5 and 11");
        }
        else
        {
            System.out.println ("The number "+a+ " is not divisible by 5 and 11");
        }
    }
}
