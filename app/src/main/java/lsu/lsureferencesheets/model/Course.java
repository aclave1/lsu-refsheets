package lsu.lsureferencesheets.model;

public class Course extends Category {
    public String dept;
    public int cnum;



    public Course(String dept, int cnum) {
        super();
        this.dept = dept;
        this.cnum = cnum;
    }

    public Course(int id, String dept, int cnum) {
        super(id);
        this.dept = dept;
        this.cnum = cnum;
    }

    @Override
    public String getTitle() {
        return String.format("%s %d",dept,cnum);
    }
}
