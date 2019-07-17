package za.co.handsomemofokeng.phase1challengalc;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import static za.co.handsomemofokeng.phase1challengalc.ApplicationClass.setupActionBar;

public class ActivityAboutALC extends AppCompatActivity {

   private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        ActionBar actionBar = getSupportActionBar();

        assert actionBar != null;
        setupActionBar(actionBar, getString(R.string.about_alc), getString(R.string.alc_url));

        webView = findViewById(R.id.wvWebView);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(getString(R.string.alc_url));

        Toast.makeText(this, webView.getUrl(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
