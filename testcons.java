import java.util.*;

class testcons
{
    public static void main(String args[])
    {
        con_ex ce=new con_ex(15,"abc");
        ce.display();
    }
}

class con_ex
{
    int x;
    String y;
    con_ex(int a,String b)
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println("Value of x is "+x);
        System.out.println("Value of y is "+y);       
    }
}

