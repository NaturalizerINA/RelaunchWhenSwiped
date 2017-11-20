package mukminullah.com.relaunchwhenswiped;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getIntent().hasExtra("run_transparent")){
            finish();
        } else {
            startActivity(new Intent(this, SplashScreen.class));
            finish();
        }

    }
}
