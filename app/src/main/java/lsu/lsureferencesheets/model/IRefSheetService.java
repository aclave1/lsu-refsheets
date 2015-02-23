package lsu.lsureferencesheets.model;

import java.util.List;

public interface IRefSheetService {
    public List<Category> getCategories();
    public Category getCategory(int id);
    public void addCategory(Category c);
    public void rmCategory(int id);
}
