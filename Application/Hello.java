
//package Application;

public class Hello
{

public static void doThis(int v)
{
   System.out.println("begin doThis");
   for (int i=0; i < v; i++)
   {
      System.out.println("Do this! "+i);
   }
   System.out.println("end doThis");
}

public static void main(String args[])
{
   System.out.println("begin main");
   doThis(10);
   System.out.println("end main");
}
}

