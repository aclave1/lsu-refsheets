package lsu.lsureferencesheets.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//Base class for Courses and anything else you might want.
//For example, we could add functionality to create a row of sheets for a single test
public abstract class Category {
    private int id;
    private Hashtable<Integer,Sheet> _sheets;


    public Category(){
        id=0;
    }

    public Category(int id){
        this.id = id;
        _sheets = new Hashtable<>();
    }

    public abstract String getTitle();

    public Sheet getSheet(int id){
        return _sheets.get(id);
    }

    public void addSheet(int id, Sheet s){
        _sheets.put(id, s);
    }

    public List<Sheet> getSheets(){
        return  new ArrayList<>(_sheets.values());
    }
}
