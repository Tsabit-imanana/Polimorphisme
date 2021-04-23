package Latihan4;

public class TestShape {
	public static void main(String[] args) {
		Shape kotak = new Rectangle("biru",5,5);
		System.out.println(kotak);
		System.out.println("Area is : " + kotak.getArea());
		
		Shape Segi3 = new Rectangle("merah",10,5);
		System.out.println(Segi3);
		System.out.println("Area is : " + Segi3.getArea());

	}
}
