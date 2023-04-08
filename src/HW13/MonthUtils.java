package HW13;

 public class MonthUtils {

    public static final class Month {
        private String nameMon;
        private int dayMon;
        private int dayWork;

        private Month(String nameMon, int dayMon, int dayWork) {
            this.nameMon = nameMon;
            this.dayMon = dayMon;
            this.dayWork = dayWork;
        }

        public String getNameMon() {
            return nameMon;
        }

        public void setNameMon(String nameMon) {
            this.nameMon = nameMon;
        }

        public int getDayMon() {
            return dayMon;
        }

        public void setDayMon(int dayMon) {
            this.dayMon = dayMon;
        }

        public  int getDayWork() {
            return dayWork;
        }

        public void setDayWork(int dayWork) {
            this.dayWork = dayWork;
        }
    }

    //        Статические поля с объектами месяцев должны быть финальными

        static final Month January = new Month ("January", 31, 16);
        static final Month February = new Month("February", 28, 19);
        static final Month March = new Month("March", 31, 22);
        static final Month April = new Month("April", 30, 21);
        static final Month May = new Month("May", 31, 18);
        static final Month June = new Month("June", 30, 21);
        static final Month July = new Month("July", 31, 20);
        static final Month August = new Month("August", 31, 20);
        static final Month September = new Month("September", 30, 21);
        static final Month October = new Month("October", 30, 21);
        static final Month November = new Month("November", 30, 21);
        static final Month December = new Month("December", 31, 22);


    static String[] firstQuarter = {
            "January",
            "February", "March"
    };

    static String firstQuarterReturn() {
        String fqr = "";
        for (int i = 0; i < firstQuarter.length; i++)
            fqr += firstQuarter[i] + " ";

        return fqr;
    }


    static String[] secondQuarter = {
            "April", "May", "June"
    };

    static String secondQuarterReturn() {
        String fqr = "";
        for (int i = 0; i < secondQuarter.length; i++)
            fqr += secondQuarter[i] + " ";

        return fqr;
    }

    static String[] thirdQuarter = {
            "July", "August", "September"
    };

    static String thirdQuarterReturn() {
        String fqr = "";
        for (int i = 0; i < thirdQuarter.length; i++)
            fqr += thirdQuarter[i] + " ";

        return fqr;
    }

    static String[] fourthQuarter = {
            "October", "November", "December"
    };

    static String fourthQuarterReturn() {
        String fqr = "";
        for (int i = 0; i < fourthQuarter.length; i++)
            fqr += fourthQuarter[i] + " ";

        return fqr;
    }

    static String[] firstHalf = {
            "January", "February", "March", "April", "May", "June"
    };

    static String firstHalfReturn() {
        String fqr = "";
        for (int i = 0; i < firstHalf.length; i++)
            fqr += firstHalf[i] + " ";

        return fqr;
    }

    static String[] secondHalf = {
            "July", "August", "September", "October", "November", "December"
    };

    static String secondHalfReturn() {
        String fqr = "";
        for (int i = 0; i < secondHalf.length; i++)
            fqr += secondHalf[i] + " ";

        return fqr;
    }

    static String yearsNames[] = {
            "January", "February", "March",
            "April", "May", "June", "July",
            "August", "September", "October",
            "November", "December"};

    static String yearsNamesReturn() {
        String fqr = "";
        for (int i = 0; i < yearsNames.length; i++)
            fqr += yearsNames[i] + " ";

        return fqr;
    }


}
