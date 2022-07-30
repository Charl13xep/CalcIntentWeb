package com.example.calcintentweb

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebActivity : AppCompatActivity() {
    lateinit var webView: WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webView=findViewById(R.id.web_web)
        webview()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        webView.webViewClient= WebViewClient()
        webView.apply {
            loadUrl("https://youtu.be/iYx_aGlmyc4")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webView.canGoBack())webView.goBack()else
        super.onBackPressed()
    }
}