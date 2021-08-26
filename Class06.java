class Cbox{
	public static void add2n(int n) {
		int count=0;
		for(int m=1;m<=n;m++) {
			count+=m;
		}
		System.out.println("1+2+...+"+n+"="+count);
	}
}
public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbox.add2n(5);
		Cbox.add2n(10);
	
	}

}
