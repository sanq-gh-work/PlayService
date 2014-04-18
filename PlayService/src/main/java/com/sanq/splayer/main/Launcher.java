package com.sanq.splayer.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.sanq.splayer.service.PlayService;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 08.04.14
 * Time: 12:22
 */
public class Launcher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ((Button) findViewById(R.id.cmdStart)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startService(new Intent(Launcher.this, PlayService.class));
                    }
                }
        );

        ((Button) findViewById(R.id.cmdStop)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        stopService(new Intent(Launcher.this, PlayService.class));
                    }
                }
        );
    }
}
