package lsu.lsureferencesheets.model;

public class Sheet {
    public int id;
    public String filename;
    public String title;

    public Sheet(int id, String filename, String title) {
        this.id = id;
        this.filename = filename;
        this.title = title;
    }
}
