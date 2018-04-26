public class Refreshement {

    private String mainCourse;
    private String dessert;

    public Refreshement(String mainCourse, String dessert) {

        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void printDetails(){

        System.out.println("mainCourse is"+mainCourse+"dessert"+dessert);
    }

}
