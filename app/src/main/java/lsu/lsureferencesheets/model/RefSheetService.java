package lsu.lsureferencesheets.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import lsu.lsureferencesheets.R;

public class RefSheetService implements IRefSheetService{



    private Hashtable<Integer,Category> _categories;


    int cscCount = 0;
    int csc4351Count = 0;
    int mathCount = 0;
    int chemCount = 0;
    private Sheet[] csc4243Sheets = new Sheet[]{
            new Sheet(cscCount, R.drawable.csc3,"Test1 sheet"),
            new Sheet(++cscCount,R.drawable.csc1,"Test2 sheet"),
            new Sheet(++cscCount,R.drawable.csc4,"Test2 sheet2"),
            new Sheet(++cscCount,R.drawable.csc5,"Test2 sheet3"),
            new Sheet(++cscCount,R.drawable.csc6,"Test2 sheet4"),
            new Sheet(++cscCount,R.drawable.csc7,"Test2 sheet5"),
            new Sheet(++cscCount,R.drawable.csc2,"Test1 sheet"),
            new Sheet(++cscCount,R.drawable.csc1,"Test2 sheet"),
            new Sheet(++cscCount,R.drawable.csc2,"Test2 sheet2"),
            new Sheet(++cscCount,R.drawable.csc3,"Test2 sheet3"),
            new Sheet(++cscCount,R.drawable.csc4,"Test2 sheet4"),
            new Sheet(++cscCount,R.drawable.csc5,"Test2 sheet5"),
            new Sheet(++cscCount,R.drawable.csc6,"Test1 sheet"),
            new Sheet(++cscCount,R.drawable.csc7,"Test2 sheet"),
            new Sheet(++cscCount,R.drawable.csc4,"Test2 sheet2"),
            new Sheet(++cscCount,R.drawable.csc6,"Test2 sheet3"),
            new Sheet(++cscCount,R.drawable.csc3,"Test2 sheet4"),
            new Sheet(++cscCount,R.drawable.csc1,"Test2 sheet5"),
            new Sheet(++cscCount,R.drawable.csc6,"Test1 sheet"),
            new Sheet(++cscCount,R.drawable.csc5,"Test2 sheet"),
            new Sheet(++cscCount,R.drawable.csc4,"Test2 sheet2"),
            new Sheet(++cscCount,R.drawable.csc2,"Test2 sheet3"),
            new Sheet(++cscCount,R.drawable.csc1,"Test2 sheet4"),
            new Sheet(++cscCount,R.drawable.csc2,"Test2 sheet5"),
    };

    private Sheet[] math1550Sheets = new Sheet[]{
            new Sheet(mathCount,R.drawable.csc1,"Test1 sheet"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet2"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet3"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet4"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet5"),
            new Sheet(++mathCount,R.drawable.csc1,"Test1 sheet"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet2"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet3"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet4"),
            new Sheet(++mathCount,R.drawable.csc1,"Test2 sheet5"),
    };

    private Sheet[] chem1201Sheets = new Sheet[]{
            new Sheet(chemCount,R.drawable.chem7,"Test 1 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 2 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 2 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 3 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 5 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 2 formula sheet 2"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 11 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Quiz 1 formula sheet"),
            new Sheet(++chemCount,R.drawable.chem7,"Test 2 formula sheet"),
    };

    private Sheet[] csc4351Sheets = new Sheet[]{
            new Sheet(csc4351Count,R.drawable.csc5,"Test 1 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 2 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 2 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 3 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 5 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 2 formula sheet 2"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 11 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Quiz 1 formula sheet"),
            new Sheet(++csc4351Count,R.drawable.csc5,"Test 2 formula sheet"),
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
