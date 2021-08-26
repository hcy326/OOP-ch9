class Caaa{
	private int value;
//	public int value;
	public Caaa (){
		value=10;
	}
	public Caaa (int i){
		value=i;
	}
	public void show() {
		System.out.println("value="+value);
	}
}
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1=new Caaa();
		Caaa obj2=new Caaa(12);
		obj1.show();
		obj2.show();
	}

}
