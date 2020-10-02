import java.util.Scanner;

class AreaToRadius {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        double r=0;
        double area=0;
        
        System.out.println ("Find Your Radius!:)");
        System.out.println ("");
        System.out.print ("ENTER AREA: ");
        area= sc.nextDouble();
        
        r=Math.sqrt(area/Math.PI);
        System.out.println ("An area of "+area+" has a radius of "+r+" units.");

    }


}