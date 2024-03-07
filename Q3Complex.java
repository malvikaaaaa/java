import java.util.Scanner;

class Complex
{
	double real;
	double imag;
        
	//Constructor

	Complex(double a,double b)
	{
		real=a;
		imag=b;
	}
	
}


class Q3Complex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter 1st real no:");
                Double m=sc.nextDouble();
                System.out.println("Enter 1st img no:");
                Double n=sc.nextDouble();
                System.out.println("Enter 2nd real no:");
                Double o=sc.nextDouble();
                System.out.println("Enter 2nd img no:");
                Double p=sc.nextDouble();
                Complex c1=new Complex(m,n);
		Complex c2=new Complex(o,p);
		Complex result;

		result=add(c1,c2);
		System.out.println("\n\tSum is "+result.real+" + "+result.imag+"i");
	}
	
	public static Complex add(Complex n1,Complex n2) //user defined datatype complex
	{
		Complex res=new Complex(0.0,0.0);
		res.real=n1.real+n2.real;
		res.imag=n1.imag+n2.imag;
		
		System.out.println("Complex Number 1 :\t"+n1.real+" + "+n1.imag+"i");
		System.out.println("Complex Number 2 :\t"+n2.real+" + "+n2.imag+"i");

		return res;
	}
}