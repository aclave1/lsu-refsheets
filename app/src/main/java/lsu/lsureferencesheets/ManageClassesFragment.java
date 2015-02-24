package lsu.lsureferencesheets;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ManageClassesFragment extends Fragment {

    ExpandableListAdapter listAdapter;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        final ViewGroup _container = container;

        View v = inflater.inflate(R.layout.activity_manage_classes,container,false);


        ExpandableListView expandableListView = (ExpandableListView) v.findViewById(R.id.lvExp);

        //preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(container.getContext(), listDataHeader, listDataChild);

        //setting list adapter
        expandableListView.setAdapter(listAdapter);




        return v;
    }


    //preparing the list data function
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        //add child data
        listDataHeader.add("Select Course");
        //adding child data
        List<String> Course = new ArrayList<String>();
        Course.add("Operating Systems");
        Course.add("Compiler Architecture");
        Course.add("Interface Design");
        Course.add("Finance");
        Course.add("Marketing");
        Course.add("UnderWater");
        Course.add("Basket");
        Course.add("Weaving");
        Course.add("...");

        listDataChild.put(listDataHeader.get(0), Course); //header, child data
    }




}
