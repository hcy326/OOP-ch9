class CWin{
	public static int cnt=0;
	private static String color;
	private static int width;
	private static int height;
	public static void count() {
		cnt++;
		System.out.println("cnt="+cnt);
	}
	public static void CWin(String str,int w,int h) {
		String color=str;
		int width=w;
		int height=h;
		System.out.println("color = "+color+" width = "+ width+" height = "+height);
	}
	public static void CWin() {
		String color="Red";
		int width=2;
		int height=2;
		System.out.println("color = "+color+" width = "+ width+" height = "+height);
	}
	public static void setZero() {
		cnt=0;
		System.out.println("cnt="+cnt);
	}
	public static void setValue(int n) {
		cnt=n;
		System.out.println("cnt="+cnt);
	}
	public static void show()
    {
        System.out.println("cnt="+cnt);
    }
}
public class Class08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin.count();
		CWin.CWin("Blue", 3, 9);
		CWin.CWin();
		CWin.setZero();
		CWin.setValue(10);
		CWin.show();
		
	}

}
