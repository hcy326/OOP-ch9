class CRational
{
 public int n;
 public int d;
 public void setN(int num)
 {
  n=num;
 }
 public void setD(int num) 
 {
  d=num;
 }
 
 public void setND(int num, int den)
 {
  n = num;
  d = den;
  System.out.println(n + "/" + d);
 }
 public void show() 
 {
     System.out.println(n +"/"+d); 
 }
}
public class Class10a {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  CRational aaa=new CRational();
  aaa.setN(2);
  aaa.setD(5);
  aaa.show();
  aaa.setND(2, 5);
 }

}