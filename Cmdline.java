class Cmdline
{
public static void main(String args[])
{
int n1=Integer.ParseInt(args[0]);
int n2=Integer.ParseInt(args[1]);

int r1,r2,r3,r4;
r1=n1+n2;
r2=n1-n2;
r3=n1*n2;
r4=n1/n2;

System.out.println("Addition:"+r1);
System.out.println("Subtraction:"+r2);
System.out.println("Multiplication:"+r3);
System.out.println("Division:"+r4);
}
}
