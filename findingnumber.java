import java.util.*;
class findingnumber
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a tree set size :");
        n=s.nextInt();
        TreeSet<Integer>treeset=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            int number=s.nextInt();
            treeset.add(number);
            
        }
        for(Integer n1 : treeset)
        {
            if(n1<20)
            {
                System.out.println(n1);
            }
        }
        



    }

}