package week3.day2;

public class SamsungTv extends AndroidTv {

	public void color()
	{
		System.out.println("Black Color");
	}
   
	public void watchVideo() 
	{
		System.out.println("I watch new movie");
		
	}
	public static void main(String[] args) {
		
		SamsungTv st=new SamsungTv();
		st.watchVideo();
		st.openApp();
		st.model();
		st.color();
		
	}

}
