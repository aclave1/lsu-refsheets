package lsu.lsureferencesheets;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassesFragment extends Fragment {
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


            for(int j = 0; j< 20; j++){
                ImageView image = new ImageView(c);
                image.setImageResource(R.drawable.ic_launcher);
                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(main,NoteView.class);
                        startActivity(i);
                    }
                });

                ll.addView(image);
            }
            h.addView(ll);
            sv.addView(h);

        }


        return v;
    }
}
