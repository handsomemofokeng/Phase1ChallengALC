package za.co.handsomemofokeng.phase1challengalc;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static za.co.handsomemofokeng.phase1challengalc.ApplicationClass.setupActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        assert actionBar != null;
        setupActionBar(actionBar, getString(R.string.app_name), getString(R.string.phase_1_challenge));
    }

    public void onClickButton(View view) {

        switch (view.getId()) {
            case R.id.btnAbout:
                startActivity(new Intent(getApplicationContext(), ActivityAboutALC.class));
                break;
            case R.id.btnProfile:
                startActivity(new Intent(getApplicationContext(), MyProfileActivity.class));
                break;
        }

    }
}
