package HW13;

public class MonthUtils {


     static  String [] firstQuarter = {
            "January", "February", "March"
    };

    static  String firstQuarterReturn (){
        String fqr ="";
        for(int i = 0; i < firstQuarter.length;i++)
            fqr += firstQuarter[i] + " " ;

        return fqr;
}


     static  String [] secondQuarter = {
            "April", "May", "June"
    };

    static  String secondQuarterReturn (){
        String fqr ="";
        for(int i = 0; i < secondQuarter.length;i++)
            fqr += secondQuarter[i] + " " ;

        return fqr;
    }
     static  String [] thirdQuarter = {
            "July", "August", "September"
    };

    static  String thirdQuarterReturn (){
        String fqr ="";
        for(int i = 0; i < thirdQuarter.length;i++)
            fqr += thirdQuarter[i] + " " ;

        return fqr;
    }
    static  String [] fourthQuarter = {
            "October", "November", "December"
    };

    static  String fourthQuarterReturn (){
        String fqr ="";
        for(int i = 0; i < fourthQuarter.length;i++)
            fqr += fourthQuarter[i] + " " ;

        return fqr;
    }
    static  String [] firstHalf = {
            "January", "February", "March", "April", "May", "June"
    };

    static  String firstHalfReturn (){
        String fqr ="";
        for(int i = 0; i < firstHalf.length;i++)
            fqr += firstHalf[i] + " " ;

        return fqr;
    }
    static  String [] secondHalf = {
            "July", "August", "September","October", "November", "December"
    };
    static  String secondHalfReturn (){
        String fqr ="";
        for(int i = 0; i < secondHalf.length;i++)
            fqr += secondHalf[i] + " " ;

        return fqr;
    }
    static String yearsNames[] = {
            "January", "February", "March",
            "April", "May", "June", "July",
            "August", "September", "October",
            "November", "December"};

    static  String yearsNamesReturn (){
        String fqr ="";
        for(int i = 0; i < yearsNames.length;i++)
            fqr += yearsNames[i] + " " ;

        return fqr;
    }



}
