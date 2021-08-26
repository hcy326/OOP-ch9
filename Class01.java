class CRectangle{
	int width;
	int height;
    public CRectangle(int w,int h){
	    width=w;height=h;
	    System.out.println("constuctor1 is called");
	}
    public CRectangle(){
//	    width=10;height=8;
    	this(10,8);
    	System.out.println("constuctor2 is called");
	}

    public void show()
    {
        System.out.println("width="+this.width);
        System.out.println("height="+this.height);
    }
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle odj=new CRectangle(5,2);
		odj.show();
		CRectangle odj1=new CRectangle();
		odj1.show();
	}

}
