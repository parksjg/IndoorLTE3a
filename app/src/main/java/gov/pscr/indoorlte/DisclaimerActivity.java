package gov.pscr.indoorlte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisclaimerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DisclaimerView(this));
    }

    // Called when the user clicks the Accept button
    public void onAccept(View v) {
        Intent intent = new Intent(getBaseContext(), Main.class);
        startActivity(intent);
    }

}
