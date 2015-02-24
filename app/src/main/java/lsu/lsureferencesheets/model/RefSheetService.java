package lsu.lsureferencesheets.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class RefSheetService implements IRefSheetService{



    private Hashtable<Integer,Category> _categories;


    int cscCount = 0;
    int csc4351Count = 0;
    int mathCount = 0;
    int chemCount = 0;
    private Sheet[] csc4243Sheets = new Sheet[]{
            new Sheet(cscCount,"Test1.png","Test1 sheet"),
            new Sheet(++cscCount,"Test2.png","Test2 sheet"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet2"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet3"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet4"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet5"),
            new Sheet(++cscCount,"Test1.png","Test1 sheet"),
            new Sheet(++cscCount,"Test2.png","Test2 sheet"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet2"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet3"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet4"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet5"),
            new Sheet(++cscCount,"Test1.png","Test1 sheet"),
            new Sheet(++cscCount,"Test2.png","Test2 sheet"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet2"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet3"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet4"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet5"),
            new Sheet(++cscCount,"Test1.png","Test1 sheet"),
            new Sheet(++cscCount,"Test2.png","Test2 sheet"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet2"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet3"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet4"),
            new Sheet(++cscCount,"Test21.png","Test2 sheet5"),
    };

    private Sheet[] math1550Sheets = new Sheet[]{
            new Sheet(mathCount,"Test1.png","Test1 sheet"),
            new Sheet(++mathCount,"Test2.png","Test2 sheet"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet2"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet3"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet4"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet5"),
            new Sheet(++mathCount,"Test1.png","Test1 sheet"),
            new Sheet(++mathCount,"Test2.png","Test2 sheet"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet2"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet3"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet4"),
            new Sheet(++mathCount,"Test21.png","Test2 sheet5"),
    };

    private Sheet[] chem1201Sheets = new Sheet[]{
            new Sheet(chemCount,"test1.png","Test 1 formula sheet"),
            new Sheet(++chemCount,"test1.png","Test 2 formula sheet"),
            new Sheet(++chemCount,"test1.png","Test 2 formula sheet"),
            new Sheet(++chemCount,"test1.png","Test 3 formula sheet"),
            new Sheet(++chemCount,"test1.png","Test 5 formula sheet"),
            new Sheet(++chemCount,"test1.png","Test 2 formula sheet 2"),
            new Sheet(++chemCount,"test1.png","Test 11 formula sheet"),
            new Sheet(++chemCount,"test1.png","Quiz 1 formula sheet"),
            new Sheet(++chemCount,"test1.png","Test 2 formula sheet"),
    };

    private Sheet[] csc4351Sheets = new Sheet[]{
            new Sheet(csc4351Count,"test1.png","Test 1 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Test 2 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Test 2 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Test 3 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Test 5 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Test 2 formula sheet 2"),
            new Sheet(++csc4351Count,"test1.png","Test 11 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Quiz 1 formula sheet"),
            new Sheet(++csc4351Count,"test1.png","Test 2 formula sheet"),
    };




    public RefSheetService(){
        _categories = new Hashtable<>();
        int coursenum = 0;
        _categories.put(coursenum,new Course(coursenum,"CSC",4243,new ArrayList<Sheet>(Arrays.asList(csc4243Sheets))));
        _categories.put(++coursenum,new Course(coursenum,"Math",1550,new ArrayList<Sheet>(Arrays.asList(math1550Sheets))));
        _categories.put(++coursenum,new Course(coursenum,"Chem",1201,new ArrayList<Sheet>(Arrays.asList(chem1201Sheets))));
        _categories.put(++coursenum,new Course(coursenum,"CSC",4351,new ArrayList<Sheet>(Arrays.asList(csc4351Sheets))));
    }

    @Override
    public List<Category> getCategories() {
        return new ArrayList<>(_categories.values());
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


    private void init(){

    }

}
