package lsu.lsureferencesheets;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ManageClasses extends ActionBarActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expandableListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_classes);

        //get the listview
        expandableListView = (ExpandableListView) findViewById(R.id.lvExp);

        //preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this,listDataHeader, listDataChild);

        //setting list adapter
        expandableListView.setAdapter(listAdapter);

        // Listview on child click listener
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });



    }

    //preparing the list data function
    private void prepareListData(){
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










    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_manage_classes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
