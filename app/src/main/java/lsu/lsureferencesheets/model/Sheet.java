package lsu.lsureferencesheets.model;

public class Sheet {
    public int id;
    public String filename;
    public int resourceId;
    public String title;

    public Sheet(int id, String filename, String title) {
        this.id = id;
        this.filename = filename;
        this.title = title;
        this.resourceId = -1;
    }

    public Sheet(int id, int resourceId, String title) {
        this.id = id;
        this.resourceId = resourceId;
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }
}
