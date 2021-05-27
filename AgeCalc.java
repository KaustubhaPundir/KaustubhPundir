import java.util.Scanner;
public class AgeCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner();
        System.out.println("Date and input format-: dd/mm/yy");
        System.out.println("Enter your DOB ----------");
        System.out.print("Day = ");
        var D1=scan.nextInt();
        
        System.out.print("Month = ");
        var M1 = scan.nextInt();
        
        System.out.print("Year = ");
        var Y1 = scan.nextInt();
        
        System.out.println("Your Date of Birth = " + D1 + "/" + M1 + "/" + Y1);
        System.out.println("Enter current (or to) Date---------------");
        System.out.print("Day = ");
        var D2 = scan.nextInt();

        System.out.print("Month = ");
        var M2 = scan.nextInt();
        
        System.out.print("Year = ");
        var Y2 = scan.nextInt();

        System.out.println("Date (to) Entered = " + D2 + "/" + M2 + "/" + Y2);
        var ly=Y2%4;
        int D21=0;

        if(M2==01||M2==03||M2==05||M2==8||M2==10||M2==12){
            D21=M2+31;
        }
        if(M2==04||M2==06||M2==9||M2==11){
            D21=M2+30;
        }
        if(M2==02){
            if(ly==0){
                D21=M2+29;
            }
            else{
                D21=M2=28;
            }
        }
        if (D2>=D1){
            System.out.println("Day = "+(D2-D1));
        }
        else if(D2<D1){
            System.out.print("Day = "+(D21-D1));    
        }
        if (D2<D1){
            M2=M2-1;
            if(M2>=M1){
                System.out.println("Month = "+(M2-M1));
                System.out.println("Year = "+(Y2-Y1));
            }
            else{
                M2=M2+12;
                System.out.println("Month = "+(M2-M1));
                System.out.println("Year = "+((Y2-1)-Y1));
            }
        }
        else if(D2>D1) {
            if(M2>=M1){
                System.out.println("Month = "+(M2-M1));
                System.out.print("Year = "+(Y2-Y1));
            }
            else{
                M2=M2+12;
                System.out.println("Month = "+(M2-M1));
                System.out.print("Year = "+((Y2-1)-Y1));
            }
        }
    scan.close(); 
    }    
}
