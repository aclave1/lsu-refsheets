package lsu.lsureferencesheets.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import lsu.lsureferencesheets.NoteView;
import lsu.lsureferencesheets.model.Sheet;

public class SheetClickListener implements View.OnClickListener {

    public static String imageIdProp = "imageid";

    private Sheet sheet;
    private Activity activity;
    public SheetClickListener(Activity a, Sheet sheet){
        this.sheet = sheet;
        this.activity = a;
    }



    @Override
    public void onClick(View v) {
        Intent i = new Intent(activity, NoteView.class);
        i.putExtra(imageIdProp,sheet.resourceId);
        activity.startActivity(i);
    }
}
