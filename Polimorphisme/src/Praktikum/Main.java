package Praktikum;

public class Main extends Rect{
	public static void main(String []args) {
		
		Rect  Rect1 = new Rect(2,3,5,6);
		Rect  Rect2 = new Rect(2,3,4,4);
		
		 Rect intersection = Rect2.intersection(Rect1);
	        Rect union = Rect2.union(Rect1);
	        
	        //membuat variable untuk memfromat string, biar mudah
	        String PosisiRect1 = String.format("[%d, %d ; %d,%d]", Rect1.x1, Rect1.y1, Rect1.x2, Rect1.y2);
	        String PosisiRect2 = String.format("[%d, %d ; %d,%d]", Rect2.x1, Rect2.y1, Rect2.x2, Rect2.y2);
	        String Union = String.format("[%d, %d ; %d,%d]", union.x1, union.y1, union.x2, union.y2);
	        String Intersect = String.format("[%d, %d ; %d,%d]", intersection.x1, intersection.y1, intersection.x2, intersection.y2);
	        
	        System.out.println("<" + PosisiRect1 +","+ PosisiRect1 + ">" + " is inside the union");
	        System.out.println(PosisiRect2 + " union " + PosisiRect1 + " = " + Union );
	        System.out.println(PosisiRect2 + " union " + PosisiRect1 + " = " + Union );
	        
		
		
		
		
		
		
	}
}
