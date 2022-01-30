
public class Point implements Shape { //point inheritence of shape class. can be checked by using IS-A checker
    private int x; //x-coordinate for the point
    private int y; //y-coordinate for the point

    public Point(){
        x=0; //initialized both coordinates are zero by default
        y=0;
    }

    public Point(int xval, int yval){
        x = xval; //mapped the value of x and y into xval and yval
        y = yval;
    }

    public int getX(){ //since x&y are private, thus other user cant access it, thus have this method to read the value of x&y
        return x;
    }

    public int getY(){ //for user to access since x & y values are private
        return y;
    }
    
    public double getArea () {
    	return 0;
    }

    public double getVolume () {
    	return 0;
    }
    
    public void setX(int xval){
        x=xval;
    }

    public void setY(int yval){
        y=yval;
    }

    public String getName(){ //return the value of getName in the shape class
        return "Point";
    }

    public String toString(){ //overriden toString which is inheritance of object to print some words
        return "The coordinates are [" + x + "," + y + "]";
    }

}
