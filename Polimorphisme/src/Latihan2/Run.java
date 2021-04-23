package Latihan2;

public class Run {
	public static void main(String[] args) {
		
		Line A = new Line(1,2,3,4);
		Line B = new Line(5,8,7,8);
		
		if(A.isEqual(A, B)){
			System.out.println("panjang A dan B sama");
		}else if(A.isGreater(A, B)) {
			System.out.println("A lebih panjang dari B");			
		}else if(A.isLess(A, B)) {
			System.out.println("B lebih panjang dari A");
		}
		
	}
}
