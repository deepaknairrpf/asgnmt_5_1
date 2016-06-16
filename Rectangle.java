
public class Rectangle {

	int length,breadth;
	Rectangle(){this(0,0);}
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	float getAreaOfRectangle()
	{
		return (float)length*breadth;
	}

}
