class Lis
{
  public int Lenofarray(int arr[],int n)
  {
     int max=1;
     int len=1;
    for(int i=1;i<n-1;i++)
   {
      if(arr[i]>arr[i-1])
      {
         len++;
      }
       else
       {
           if(max<len)
             { 
               max=len;
              }
         len=1;
        }
    }        
    if(max<len)
    {
      max=len;
     }
    return max;
}
 public static void main(String[] args)
{
   int arr[]={3,2,5,7,4,8,9,11,31};
   int n=arr.length;
   Lis l=new Lis();
   System.out.println("Lengthof longest increasing subarray is:"+l.Lenofarray(arr,n));
}
}     
    