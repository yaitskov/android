package com.github.app2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity
        extends Activity
        implements View.OnClickListener
{

    public static final String MAIN = "MAIN";
    Button btn;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        Log.d(MAIN, "create ----------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter = 0;
        Log.d(MAIN, "resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MAIN, "stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MAIN, "START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MAIN, "PAUSE");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MAIN, "DESTROY -----------------------------------");
    }

    @Override
    public void onClick(View view) {
        counter += 1;
        btn.setText("Clicked " + counter);
        Log.i(MAIN, "HELLO world!!!!!" + view.getX() + ":" + view.getY());
    }
}
