class Namecard{
	private String name;
	private String address;
	private Phone data;
	class Phone {
		private String campany;
		private String cell;
		public Phone (String s1,String s2) {
			campany=s1;
			cell=s2;
		}
	}
	public Namecard (String n,String a,String s1,String s2) {
		name=n;
		address=a;
		data=new Phone(s1,s2);
}
	public void show() {
		System.out.println("�n�ͩm�W�G"+name);
		System.out.println("�p���a�}�G"+address);
		System.out.println("���q�q�ܡG"+data.campany);
		System.out.println("������X�G"+data.cell);
	}
	}
public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namecard first =new Namecard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}

}
