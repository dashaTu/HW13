package HW13;

public final class Month {
    private String nameMon;
    private int dayMon;
    private int dayWork;



    public Month(String nameMon, int dayMon, int dayWork) {
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

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }
}
