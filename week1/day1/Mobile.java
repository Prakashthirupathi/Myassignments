package week1.day1;

public class Mobile {
	
	public void sendSms(){
		System.out.println("sms send successfully");
	}
	protected void makeCall(){
		System.out.println("Make a call");
	}
	
	private void takeVideo(){
		System.out.println("Video recorded");
	}
	
	public static void main(String[] args) {
		Mobile mob =new Mobile();
		mob.sendSms();
		mob.makeCall();
		mob.takeVideo();
	}

}
