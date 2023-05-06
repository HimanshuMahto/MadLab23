class RHD extends Duck implements Flyable, Quackable
{
    public void fly()
    {
        System.out.println("RHD Can Fly");
    }
    public void quack()
    {
        System.out.println("RHD Can quack");
        super.swim();
    }
}