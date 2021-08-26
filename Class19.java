
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
		System.out.println("學生姓名"+Name);
		System.out.println("英文成績"+score.english);
		System.out.println("數學成績"+score.math);
		System.out.println("平均成績"+score.avg());
	}
}
public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu=new Data("Annie",85,92);
		stu.show();
	}

}
