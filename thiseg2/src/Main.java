
class Demo
{
    public void getName()
    {
        System.out.println("My name issravan");
    }

    public Demo display()
    {
        // return current object
        return this;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo d1=d.display();
        d1.getName();




    }
}
