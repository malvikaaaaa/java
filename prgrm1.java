import java.util.*;

class prgrm1
{
    int rollno;
    String name;
    String address;
    Double mark;
    Float salary;
    
    static void staticshow()
    {
        System.out.println("\nthis is static");
    }
    
    void show()
    {
        System.out.println("\nNon static\n");
        System.out.println("Roll no: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Mark: "+mark);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
    }
    
    void add()
    {
        System.out.println("\nAfter adding 10 marks");
        mark=mark+10;
    }
    
    public static void main(String args[]) 
    {
        try
        {
            prgrm1 s1=new prgrm1();
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Roll no:");
            s1.rollno=s.nextInt();        
            System.out.println("Enter Name:");
            s1.name=s.next();
            System.out.println("Enter Mark:");
            s1.mark=s.nextDouble();
	    s.nextLine();
            System.out.println("Enter Address:");
            s1.address=s.nextLine();
            System.out.println("Enter Salary:");
            s1.salary=s.nextFloat();
            staticshow();
            s1.show();
            s1.add();
            s1.show();
        }
        catch(Exception w){System.out.print(w);}
        
    }

}