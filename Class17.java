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
		System.out.println("好友姓名："+name);
		System.out.println("聯絡地址："+address);
		System.out.println("公司電話："+data.campany);
		System.out.println("手機號碼："+data.cell);
	}
	}
public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namecard first =new Namecard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}

}
