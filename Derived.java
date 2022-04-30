public class Derived extends Base { 
  @Override
   public void methodOne()
   {
      super.methodOne();
      System.out.print("C");
   }
  @Override
   public void methodTwo()
   {
     System.out.print("D");
     super.methodTwo();
       }
}