
public class Triangle extends Rectangle {
  
	Triangle(int a,int b)
	{
		super(a,b);
	}
float getAreaOfTriangle()
{
	float area;
	area=(float)length*breadth/2;
	return area;
}

}
