class CCount{
	private static int cnt=0;
	public CCount() {   //«Øºc¤¸
		count();
	}
	public static void count() {
		cnt++;
	}
	public static void setZero() {
		cnt=0;
	}
	public static void setValue(int n) {
		cnt=n;
	}
	 public static void show()
	    {
	        System.out.println("cnt="+cnt);
	    }
}
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount obj=new CCount();
		CCount obj1=new CCount();
		CCount.show();
		CCount.count();
		CCount.setZero();
		CCount.setValue(10);
		
		CCount.show();
		
	}

}
