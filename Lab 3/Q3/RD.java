class RD extends Duck implements Quackable
{
    public void quack()
    {
        System.out.println("RD Can squeaks");
        super.swim();
    }
}