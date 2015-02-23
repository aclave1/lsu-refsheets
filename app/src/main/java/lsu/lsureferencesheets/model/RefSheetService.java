package lsu.lsureferencesheets.model;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class RefSheetService implements IRefSheetService{



    private Dictionary<Integer,Category> _categories;

    public RefSheetService(){
        _categories = new Hashtable<>();
    }

    @Override
    public List<Category> getCategories() {
        throw new UnsupportedOperationException("Not Implemented");
    }

    @Override
    public Category getCategory(int id) {
        throw new UnsupportedOperationException("Not Implemented");
    }

    @Override
    public void addCategory(Category c) {
        throw new UnsupportedOperationException("Not Implemented");
    }

    @Override
    public void rmCategory(int id) {
        throw new UnsupportedOperationException("Not Implemented");
    }
}
