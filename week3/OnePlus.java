package week3.day2;

public class OnePlus extends AndroidTv{

	
	public void watchVideo()
	{
		System.out.println("we watch any series");
		
	}
	public static void main(String[] args) {
		OnePlus op=new OnePlus();
		op.openApp();
		op.watchVideo();
		op.model();
		
	}

}
