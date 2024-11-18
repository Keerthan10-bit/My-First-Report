import java.util.Random;
class RandomGen extends Thread
{
  String threadname;
  RandomGen(String str)
  { 
    threadnmae = str;
}
  public void run()
  {
     Random r = new Random();
     int num = r.nextInt();
     for(int i=0;i<23;i++)
     { 
       System.out.println(r);
       }
     }
   }
class AlphabetsAZ extends Thread
{
    String threadname;
    AlphabetsAZ(String str)
    {
       threadname = str;
}
  public void run()
  {
  char ch;
  for(  
class Alphabetsaz extends Thread
{
  public String threadName;
  AlphabetsAZ(String str)
  {
      threadName = str;
      }
      public void run()
      {
      char ch;
      for(ch = 'A'; ch <= 'Z'; ch++)
      {
        System.out.println(threadName +" prints:"+ch);
        try
        {  
          Thread
class ThreeThreadDemo
{
 RandomGen t1 =  new RandomGen("Thread-Integer");
 AlphabetsAZ t2 = new Alphabets("Thread-AZ");
 Alphabetsaz t3 = new Alphabets("Thread-az");
