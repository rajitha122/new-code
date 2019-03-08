package ThreadDemo;

public class Syncro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First fnew=new First();
		second ss=new second(fnew,"welcome");
		second ss1=new second(fnew,"Thread");
		second ss2=new second(fnew,"programmer");
	}

}
