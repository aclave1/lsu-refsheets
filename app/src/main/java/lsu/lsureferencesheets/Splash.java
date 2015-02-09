package lsu.lsureferencesheets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by micronx on 2/8/15.
 */
public class Splash extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread span = new Thread(){
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 5000){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent(getBaseContext(),MainActivity.class));
                }
                catch (InterruptedException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                finally{
                    finish();
                }
            }
        };
        span.start();
    }
}
