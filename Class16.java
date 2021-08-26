
class Circle        // 定義類別Circle
{
   private static double pi=3.14;
   private double radius;

   public Circle(double r)       // Circle建構元
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle cir[];
	      cir=new Circle[6];
	      for(int i=0;i<cir.length;i++) {
	    	  cir[i]=new Circle((double) i);
	    	  cir[i].show();
	      }
	      	    
	     
	}

}
