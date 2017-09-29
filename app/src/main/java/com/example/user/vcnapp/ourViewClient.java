package com.example.user.vcnapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by User on 9/29/2017.
 */

public class ourViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url)
    {
        v.loadUrl(url);
        return true;
    }
}
