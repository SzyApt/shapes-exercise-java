public class Circle extends Point{ //circle inheritance from point
    private double r; //the value for radius

    public Circle(){
        super(); //call the value from superclass
        r=0; //initialized the value r=0 by default
    }

    public Circle(int x, int y, double r){
        super(x,y); //send the value to superclass about the coordinates
        setRadius(r); //use method setRadius to get value of r (the radius)
    }

    public double getRadius(){ //for user to access the value of the radius since r is private
        return r;
    }
    public void setRadius(double rval){
        r = rval < 0 ? 0 : rval; //exception where if the r value is below 0, it will return 0 value.
    }

    public String getName(){
        return "Circle"; //return getName value to shape class
    }

    public double getArea(){
        return  Math.PI*r*r; //get the value of area using equation PI*r^2 and send the value to shape class
    }

    public String toString(){
        return "The circle has an area of " + getArea() + ", with radius of " + getRadius() + ", at the coordinates of [" + this.getX() + "," + this.getY() + "]";
    } //overridden the value of toString to print

}
