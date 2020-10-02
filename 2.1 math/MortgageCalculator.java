import java.util.Scanner;

class MortgageCalculator {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        double p=0;
        double r=0;
        double n=0;
        double a=0;
        
        System.out.println ("Calculate your Interest!:)");
        System.out.println ("");
        System.out.print ("ENTER PRINCIPLE: ");
        p=sc.nextDouble();
        System.out.print ("ENTER RATE(%): ");
        r=sc.nextDouble();
        System.out.print ("ENTER YEAR: ");
        n=sc.nextDouble();
        
        a=p*Math.pow(1+r/100,n);
        System.out.println ("Your interest is $"+a+".");
        
        
    }
}