package com.example.tabwidgetsample;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Андрей on 29.10.2016.
 */

public class ClassesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        String contentText = res.getString(R.string.tab3_content);
        TextView textView = new TextView(this);
        textView.setText(contentText);
        setContentView(textView);
    }

}
