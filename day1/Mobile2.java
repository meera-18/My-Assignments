package week1.day1;

public class Mobile2 {
	
	String mobilemodel ="iphone";
	float mobileweight= 12f;
	Boolean fullycharged=true;
	int mobilecost=50000;
	
			
	
	public void makeCall() {System.out.println("i want to make a call");}
	
	public void sendMsg() {System.out.println("sent a message");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile2 details=new Mobile2();


details.makeCall();
details.sendMsg();

System.out.println(details.mobilemodel);
System.out.println(details.mobileweight);
System.out.println(details.fullycharged);
System.out.println(details.mobilecost);
System.out.println("This is my mobile");
	}

}
