
public class Cylinder extends Circle{ //cylinder is inheritance from circle. for confirmation, Cylinder IS-A Circle
    private double h; //variable of height of cylinder

    public Cylinder(){
        super(); //copy the characteristic of superclass
        h = 0; // and add another variable called h for the height, initialized to zero by default
    }

    public Cylinder (int x, int y, double r, double h){
        super(x,y,r); //send the value of xyr to superclass which has the same characteristic as cyclinder
        setHeight(h); //send the value for new variable that superclass does not have
    }

    public double getHeight(){ //accessible for user to get the value of h
        return h;
    }
    public void setHeight(double hval){
        h = hval < 0 ? 0 : hval; //exception where h cannot be below 0, else it will return zero
    }

    public String getName(){
        return "Cylinder"; //give the value to shapes class for the name of this shape
    }

    public double getArea(){
        return 2*super.getArea() + 2*Math.PI*getRadius()*h; //return the value of the area where by using equation of area of cylinder
    }

    public double getVolume(){
        return super.getArea()*h; //return the value of getvolume which overridden the zero by default at shapes class
    }

    public String toString(){
        return "The cylinder has a volume of " + getVolume() + ", and the area is " + getArea() + " with the height of " + getHeight() + " at the coordinates of [" + this.getX() + "," + this.getY() + "]";
    } //overwrite toString value which is under object class to print
}
