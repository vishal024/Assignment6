class Animal
{
   String breed;
   String colour; 
   public void Speak()
  {
    System.out.println("animal is speaking");
   }
}
class Dog extends Animal
{
   public void Speak()
   {
     System.out.println("dog is barking");
   }
}
class Cat
{
    public void Speak()
   {
      System.out.println("cat is speaking");
   }
}

class Main
{
  public static void main(String[] args)
  {
    Dog d=new Dog();
    Cat c=new Cat();
    d.Speak();
    c.Speak();
    
}
}
