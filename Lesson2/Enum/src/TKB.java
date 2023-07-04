public class TKB {

    private Day thu;
    private String mon;
    
    public TKB(Day thu, String mon) {
        this.thu = thu;
        this.mon = mon;
    }

    public Day getThu() {
        return thu;
    }

    public String getMon() {
        return mon;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    @Override
    public String toString() {
        return "TKB [thu=" + thu + ", mon=" + mon + "]";
    }
    
    

}
