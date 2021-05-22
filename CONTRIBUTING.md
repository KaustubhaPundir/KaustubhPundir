import java.util.Scanner;
public class AgeCalc {
    public static void main(String[] args){
        System.out.println("Date and input format-: dd/mm/yy");
        System.out.println("Enter your DOB ----------");
        System.out.print("Day = ");
        Scanner Day = new Scanner(System.in);
        var Day1 = Day.nextLine();
        var D1 = Integer.parseInt(Day1);
        
        System.out.print("Month = ");
        Scanner Month = new Scanner(System.in);
        var Month1 = Month.nextLine();
        var M1 = Integer.parseInt(Month1);
        
        System.out.print("Year = ");
        Scanner Year = new Scanner(System.in);
        var Year1 = Year.nextLine();
        var Y1 = Integer.parseInt(Year1);
        
        System.out.println("Your Date of Birth = " + D1 + "/" + M1 + "/" + Y1);
        System.out.println("Enter current (or to) Date---------------");
        System.out.print("Day = ");
        Scanner Day22 = new Scanner(System.in);
        var Day2 = Day22.nextLine();
        var D2 = Integer.parseInt(Day2);

        System.out.print("Month = ");
        Scanner Month22 = new Scanner(System.in);
        var Month2 = Month22.nextLine();
        var M2 = Integer.parseInt(Month2);
        
        System.out.print("Year = ");
        Scanner Year22 = new Scanner(System.in);
        var Year2 = Year22.nextLine();
        var Y2 = Integer.parseInt(Year2);

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
    Day.close();
    Day22.close();
    Month.close();
    Month22.close();
    Year.close();
    Year22.close();   
    }    
}
