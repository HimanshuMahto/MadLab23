class LD extends Duck implements Flyable, Quackable
{
    public void fly()
    {
        System.out.println("LD Can Fly");
    }
    public void quack()
    {
        System.out.println("LD Can quack");
        super.swim();
    }
}