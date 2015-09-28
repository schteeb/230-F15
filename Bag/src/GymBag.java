import adt.*;


public class GymBag {

	public static void main(String[] args) {
		BagInterface<String> gymBag = new JavaBag<String>();
		gymBag.add("socks");
		gymBag.add("tennis ball");
		System.out.println(gymBag.getFrequencyOf("shoes"));
	}

}
