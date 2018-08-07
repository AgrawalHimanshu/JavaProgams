public class Print extends Thread
{
  static volatile int count;
  
  public static void main(String[] args)
  {
    new Print().start();
  }
  
  public void run()
  {
    System.out.println("Hello World");
    if (++count < 100)
      new Print().start();
  }
  
}