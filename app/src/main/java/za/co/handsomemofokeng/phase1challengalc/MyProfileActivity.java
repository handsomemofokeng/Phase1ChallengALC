package za.co.handsomemofokeng.phase1challengalc;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static za.co.handsomemofokeng.phase1challengalc.ApplicationClass.setupActionBar;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        ActionBar actionBar = getSupportActionBar();

        assert actionBar != null;
        setupActionBar(actionBar, getString(R.string.my_profile), getString(R.string.phase_1_challenge));
    }
}
