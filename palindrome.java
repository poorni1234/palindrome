import java.io.*;
import java.util.*;
  class pd
{
  public static void main(String n1[])
{
   int n,d=0,j=0,a;
   int i;
   char b[]=new char[10];
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number");
   n=s.nextInt();
   a=n;
  while(n>0)
{
  d=n%10;
  j=(j*10)+d;
  n=n/10;
}
  if(a==j)
  System.out.println("YES");
  else
  System.out.println("NO");
}
}
