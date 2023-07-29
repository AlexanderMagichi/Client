package ua.org.com.alex.clientcode;

	import ua.org.com.alex.libs.shapebuilder.Shape;

	public class TestCallLibs {
	    public static void main(String[] args) {
	        int size = 10;

	        Shape.TriangleBuilder triangleBuilder = new Shape().new TriangleBuilder(size);

	        triangleBuilder.buildTriangle();
	        String triangle = triangleBuilder.getTriangle();

	        System.out.println(triangle);
	    }
	}
