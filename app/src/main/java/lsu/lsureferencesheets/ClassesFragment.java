package lsu.lsureferencesheets;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import lsu.lsureferencesheets.model.Category;
import lsu.lsureferencesheets.model.IRefSheetService;
import lsu.lsureferencesheets.model.RefSheetService;
import lsu.lsureferencesheets.model.Sheet;


public class ClassesFragment extends Fragment {

    private final IRefSheetService service = new RefSheetService();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final Activity main = getActivity();
        View v = inflater.inflate(R.layout.fragment_classlist,container,false);
        Context c = v.getContext();
        LinearLayout sv = (LinearLayout) v.findViewById(R.id.classlist_scroll);

        for(Category cat : service.getCategories()){
            addRow(c,sv,cat);
        }

        return v;
    }



    private void addRow(Context c,LinearLayout mainList,Category cat){
        LinearLayout wrapper = new LinearLayout(c);
        wrapper.setOrientation(LinearLayout.VERTICAL);
        wrapper.setMinimumHeight(200);
        wrapper.setMinimumWidth(200);

        TextView title = buildTitle(c,cat);

        HorizontalScrollView row = new HorizontalScrollView(c);
        LinearLayout rowScroll = new LinearLayout(c);
        rowScroll.setOrientation(LinearLayout.HORIZONTAL);
        rowScroll.setMinimumHeight(200);
        rowScroll.setMinimumWidth(200);
        for(Sheet sheet : cat.getSheets()){
            addItem(c,rowScroll,sheet);
        }
        row.addView(rowScroll);
        wrapper.addView(title);
        wrapper.addView(row);
        mainList.addView(wrapper);
    }

    private TextView buildTitle(Context c, Category cat) {
        TextView title = new TextView(c);
        title.setText(cat.getTitle());
        title.setTextColor(getResources().getColor(R.color.textcolor));
        title.setTextSize(TypedValue.COMPLEX_UNIT_DIP,35);
        title.setTypeface(null, Typeface.BOLD);
        return title;
    }

    private void addItem(Context c, LinearLayout row, Sheet sheet){
        final Activity main = getActivity();
        LinearLayout card = buildCard(c);







        TextView title = new TextView(c);
        title.setText(sheet.toString());

        ImageView image = new ImageView(c);
        center(image);

        image.setMinimumHeight(200);
        image.setMinimumWidth(200);


        image.setImageResource(R.drawable.ic_launcher);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main, NoteView.class);
                startActivity(i);
            }
        });


        card.addView(image);
        card.addView(title);


        row.addView(card);
    }

    private void center(View v){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100,100);
        params.gravity = Gravity.CENTER;
        v.setLayoutParams(params);
    }


    private LinearLayout buildCard(Context c){
        LinearLayout card = new LinearLayout(c);

        LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(200,200);
        layoutparams.setMargins(10,10,10,10);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setBackgroundColor(getResources().getColor(R.color.basecolor_light));
        card.setLayoutParams(layoutparams);



        return card;
    }








}
