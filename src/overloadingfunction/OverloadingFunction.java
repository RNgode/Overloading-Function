
package overloadingfunction;


public class OverloadingFunction {
    
public double letaArea(double length, double width) {
return length*width;
}//End of function
   
public double letaArea(double length){
return length*length;
}

/**public double letaArea(){
    
    double radius;
    return radius*radius*3.142;
}**/

public void chora(){
System.out.println("******************************************");
}

    public static void main(String[] args) {
        
OverloadingFunction ovf = new OverloadingFunction();
//ovf is an instance variable/object
ovf.chora();
System.out.println("the area of the rectangle is:\t" +ovf.letaArea(40.5, 50.5/**These are Arguments**/));
System.out.println("the area of the square is:\t" +ovf.letaArea(4.2));
ovf.chora();

    }
    
}
