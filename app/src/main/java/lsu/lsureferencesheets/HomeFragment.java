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

import lsu.lsureferencesheets.listeners.SheetClickListener;
import lsu.lsureferencesheets.model.Category;
import lsu.lsureferencesheets.model.IRefSheetService;
import lsu.lsureferencesheets.model.RefSheetService;
import lsu.lsureferencesheets.model.Sheet;


public class HomeFragment extends Fragment {

    private final IRefSheetService service = new RefSheetService();
    private LinearLayout.LayoutParams linearParams;

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
        wrapper.setMinimumHeight(300);
        wrapper.setMinimumWidth(300);

        TextView title = buildTitle(c, cat);

        HorizontalScrollView row = new HorizontalScrollView(c);
        LinearLayout rowScroll = new LinearLayout(c);
        rowScroll.setOrientation(LinearLayout.HORIZONTAL);
        rowScroll.setMinimumHeight(300);
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
        card.setBaselineAligned(false);


        TextView title = getSheetTitle(c, sheet);

        ImageView image = buildImageView(c, sheet);


        card.addView(image);
        card.addView(title);


        row.addView(card);
    }

    private TextView getSheetTitle(Context c, Sheet sheet) {
        TextView title = new TextView(c);
        title.setGravity(Gravity.BOTTOM);

        title.setText(sheet.toString());
        return title;
    }

    private ImageView buildImageView(Context c, Sheet sheet) {
        final Activity main = getActivity();
        ImageView image = new ImageView(c);


        styleImage(image);

        int resId = sheet.resourceId != -1 ? sheet.resourceId : R.drawable.ic_launcher;
        image.setImageResource(resId);
        image.setOnClickListener(new SheetClickListener(main,sheet));
        return image;
    }


    private void styleImage(View v){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100,100);
        params.gravity = Gravity.CENTER;
        params.height = 250;
        params.width= 200;
        v.setLayoutParams(params);
    }

    //builds the "card" that wraps the sheet and sheet title
    private LinearLayout buildCard(Context c){
        LinearLayout card = new LinearLayout(c);
        LinearLayout.LayoutParams layoutparams = new LinearLayout.LayoutParams(200,325);
        card.setPadding(8,8,8,8);
        layoutparams.setMargins(10,10,10,10);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setBackgroundColor(getResources().getColor(R.color.basecolor_light));
        card.setLayoutParams(layoutparams);
        return card;
    }


}
