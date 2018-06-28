class Static
{
  static int k=5;
  static
  {
    System.out.println(" static block:k="+k);
  }
  public static void main(String[] args)
  {
   Static t= new Static();
   }
}