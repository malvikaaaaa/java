class mca
{
    int rollno;
    String name;
    Double mark;
    
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
    }
    
    void add()
    {
        System.out.println("\nAfter adding 10 marks");
        mark=mark+10;
    }
    
    public static void main(String[] args) 
    {
        mca s1=new mca();
        s1.rollno=Integer.parseInt(args[0]);
        s1.name=args[1];
        s1.mark=Double.parseDouble(args[2]);
        staticshow();
        s1.show();
        s1.add();
        s1.show();
    }
}