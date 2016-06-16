
public class asgnmt_5_1 {

	/**
	 * This program is based on the relation between the area of a Rectangle and a Triangle
	 * that the area of a Parallelogram is twice the area of a triangle with length as one side and base of
	 * the triangle as another.The formula for area of a Rectangle and a Parallelogram is the product of two adjacent sides.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=12,breadth=5;
		Triangle t1 = new Triangle(length,breadth);
		Rectangle r1 = new Rectangle(length,breadth);
		System.out.print("The area of a rectangle with length " + length + " and breadth " + breadth + " is\t");
		System.out.println(r1.getAreaOfRectangle());
		System.out.print("The area of a triangle with length " + length + " and breadth " + breadth + " is\t");
		System.out.println(t1.getAreaOfTriangle());
	}

}
