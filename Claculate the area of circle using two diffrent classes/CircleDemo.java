// Shuvon IT-23030
public class CircleDemo {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);

        // Using the getter
        System.out.println("Radius: " + circle.getRadius());

        // Calculating the area
        System.out.println("Area: " + circle.calculateArea());

        //setter to update the radius
        circle.setRadius(7.0);

        // Displaying updated radius
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
    }
}
