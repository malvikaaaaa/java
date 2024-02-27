public class s2mca 
{
    String name="malavika";
    public static void main(String[] args)
    {
        show();
        s2mca s1=new s2mca();
        s1.s();
    }//main
    
    
    public static void show() 
    {
        System.out.println("Name is malavika");
    }
    
    void s()
    {
        System.out.println("not static "+name);   
    }
    
}