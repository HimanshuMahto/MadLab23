interface Testable
{
    void display();
}
class Test implements Testable
{
    public void display() //when we use interface in java we need to make the functions that are
    {                    // used as public when we implement them in classes
        System.out.println("Test implements Testables");
    }
}