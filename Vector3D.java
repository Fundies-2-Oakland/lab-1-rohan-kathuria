import java.text.DecimalFormat;
import java.math.*;
import java.util.Vector;

public class Vector3D {
    //get the tings
    private Double x;
    public Double getX() {
        return x;
    }

    private Double y;
    public Double getY() {
        return y;
    }

    private Double z;
    public Double getZ() {
        return z;
    }

    public Vector3D (Double x, Double y, Double z){
       this.x = x;
       this.y = y;
       this.z = z;
    }

    //toString override
    @Override
    public String toString() {
         return STR."(\{String.format("%.2f", getX())}, \{String.format("%.2f", getY())}, \{String.format("%.2f", getZ())})";
    }

    public double getMagnitude(){
       return Math.abs(Math.sqrt((getX()*getX()) + (getY()*getY()) + (getZ()*getZ())));
    }

    public Vector3D normalize(){
       return new Vector3D(this.x/getMagnitude(), this.y/getMagnitude(), this.z/getMagnitude());
    }

    public Vector3D add(Vector3D other){
        return new Vector3D(this.x + other.getX(), this.y + other.getY(), this.z + other.getZ());
    }

    public Vector3D multiply(float constant){
        return new Vector3D(this.x*constant, this.y*constant, this.z*constant);
    }

    public Double dotProduct(Vector3D other){
       return this.x*other.getX() + this.y*other.getY() + this.z*other.getZ();
    }

    public double angleBetween(Vector3D other){
        return (180*(Math.acos(dotProduct(other)/(this.getMagnitude()*other.getMagnitude()))))/3.14159;
    }

    public Vector3D crossProduct(Vector3D other){
        return new Vector3D(((this.y*other.getZ())-(this.z*other.getY())), ((this.z * other.getX())-(this.x*other.getZ())), ((this.x*other.getY())-(this.y*other.x)));

    }
}
