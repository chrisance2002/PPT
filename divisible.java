public class divisible
{
    public static void main (String [] args)
    {
        int b= 44;
        System.out.println("Number is: "+b);
        if(b%5==0 || b%11==0)
        {
            System.out.println("The number " +b+ " is divisible by 5 and 11");
        }
        else
        {
            System.out.println ("The number "+b+ " is not divisible by 5 and 11");
        }
    }
}
