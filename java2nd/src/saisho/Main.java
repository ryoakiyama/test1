package saisho;

public class Main {

	public static void main(String[] args) {
		calcTriangleArea(10,5);
		calcCircleArea(4);


	}

		public static double calcTriangleArea(double bottom,double height){
			double t= bottom * height /2;
			System.out.println(t);
			return t;
	}
		public static double calcCircleArea(double radius){
			double s = radius * radius * 3.14;
			System.out.println(s);
			return s;

		}



}
