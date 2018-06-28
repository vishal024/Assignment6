class Overloading
{
  public void print()
  {
    System.out.println("This function is accepting null arguments");
  } 
  public void print(int x,int y)
  {
    int sum=x+y;
    System.out.println("Sum is:"+sum);
  }
  public void print(float z)
  {
    float mult=z;
   System.out.println("Float is:"+mult);
  }
 public static void main(String[] args)
 {
    Overloading o=new Overloading();
    o.print(3,4);
    o.print(1.2f);
    o.print();
 }
}