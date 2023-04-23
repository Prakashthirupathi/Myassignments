package week1.day1;

public class Oneplus {

public void makeCall() {
	String mobileModel = "NordCE2";
	float mobileWeight = 0.173f;
		System.out.println(mobileModel);	
		System.out.println(mobileWeight);
}
	public void sendMsg() {
		boolean isFullcharged=true;
		int mobileCost=25500;
		System.out.println(isFullcharged);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Oneplus myMob=new Oneplus();
System.out.println("this is my mobile");
myMob.makeCall();
myMob.sendMsg();



	}
}
