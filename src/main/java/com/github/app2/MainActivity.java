package com.github.app2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    public static final String MAIN = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(MAIN, "create ----------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
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
}
