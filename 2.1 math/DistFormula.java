import java.util.Scanner;

class DistFormula {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        double x1=0;
        double y1=0;
        double x2=0;
        double y2=0;
        double dist=0;
        
        System.out.println ("Find The Distance Between X And Y!:)");
        System.out.println ("");
        System.out.print ("ENTER X1 Coordinate: ");
        x1= sc.nextDouble();
        System.out.print ("ENTER Y1 Coordinate: ");
        y1= sc.nextDouble();
        System.out.print ("ENTER X2 Coordinate: ");
        x2= sc.nextDouble();
        System.out.print ("ENTER Y2 Coordinate: ");
        y2= sc.nextDouble();
        
        dist= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println ("The distance between the 2 coordinates ("+x1+","+y1+")and ("+x2+","+y2+") is "+dist+" units.");
        
        
        
    }
}