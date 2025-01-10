import java.util.Vector;

public static void main(String[] args) {
    Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
    Vector3D v2 = new Vector3D(4.0, 5.0, 6.0);

    System.out.println("magnitude of v1: " + v1.getMagnitude());

    System.out.println(v1.dotProduct(v2));

    System.out.println(v1.angleBetween(v2));

    System.out.println(v1.crossProduct(v2));

    System.out.println(v1.normalize());


}