package lsu.lsureferencesheets.model;

import java.util.Collection;
import java.util.List;

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

    public Course(int id, String dept,int cnum, Collection<Sheet> sheets) {
        super(id);
        this.dept = dept;
        this.cnum = cnum;
        for(Sheet s : sheets){
            addSheet(s.id,s);
        }
    }

    @Override
    public String getTitle() {
        return String.format("%s %d",dept,cnum);
    }
}
