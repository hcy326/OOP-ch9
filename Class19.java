
class Data{
	private String Name;
	private Test score;
	class Test{
		private int english;
		private int math;
		public Test(int eng,int m) {
			english=eng; 
			math=m;
		}
		 double avg() {
			return (english+math)/2;
		}
	}
	public Data (String n,int eng,int m) {
		Name=n;
		score=new Test(eng,m);
	}
	public void show() {
		System.out.println("�ǥͩm�W"+Name);
		System.out.println("�^�妨�Z"+score.english);
		System.out.println("�ƾǦ��Z"+score.math);
		System.out.println("�������Z"+score.avg());
	}
}
public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu=new Data("Annie",85,92);
		stu.show();
	}

}
