import java.util.Arrays;


public class TestCallJavier {

	public static void main(String[] args) {
		JavierMascherano JavierMascherano = new JavierMascherano ();
		System.out.println("name : "+JavierMascherano.getName());
		System.out.println("position : "+JavierMascherano.getPosition());
		System.out.println("friend : "+Arrays.toString(JavierMascherano.getFriend()));
	}

}
