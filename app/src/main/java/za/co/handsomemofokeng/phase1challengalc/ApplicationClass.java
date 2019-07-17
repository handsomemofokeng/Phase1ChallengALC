package za.co.handsomemofokeng.phase1challengalc;

import android.app.Application;
import android.support.v7.app.ActionBar;

public class ApplicationClass extends Application {


    /**
     * This method sets up an Action Bar for any given Activity
     *
     * @param actionBar to be shown on Activity
     * @param title     of the Activity
     * @param subtitle  shows additional details
     * @return inflated and customised action bar
     */
    public static ActionBar setupActionBar(ActionBar actionBar, String title, String subtitle) {

        /*
          Setup a new action bar
         */
        assert actionBar != null;
        actionBar.setLogo(R.mipmap.ic_launcher);
        actionBar.setTitle(" " + title);
        actionBar.setSubtitle(" " + subtitle);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        return actionBar;


    }
}
