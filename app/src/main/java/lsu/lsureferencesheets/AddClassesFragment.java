package lsu.lsureferencesheets;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by micronx on 2/22/15.
 */
public class AddClassesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final Activity main = getActivity();
        View v = inflater.inflate(R.layout.fragment_classlist,container,false);
        Context c = v.getContext();
        LinearLayout sv = (LinearLayout) v.findViewById(R.id.classlist_scroll);

        for(int i=0;i<10;i++){
            HorizontalScrollView h = new HorizontalScrollView(c);
            LinearLayout ll = new LinearLayout(c);
            ll.setOrientation(LinearLayout.HORIZONTAL);
            ll.setMinimumHeight(200);
            ll.setMinimumWidth(200);

            h.addView(ll);
            sv.addView(h);
        }
        return v;
    }
}
