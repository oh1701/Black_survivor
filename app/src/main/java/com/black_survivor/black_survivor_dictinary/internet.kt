package com.black_survivor.black_survivor_dictinary
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class internet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet)


        MobileAds.initialize(this,"ca-app-pub-8417791108068506~7524991405")


        val webview = findViewById<WebView>(R.id.webview2)
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.webChromeClient = WebChromeClient()


        var adview = findViewById<AdView>(R.id.adView11)
        val adRequest = AdRequest.Builder().build()
        adview.loadAd(adRequest)

        if(intent.hasExtra("Lank"))
            webview.loadUrl("https://playeternalreturn.com/ko/ranking/")
        if(intent.hasExtra("patch"))
            webview.loadUrl("https://playeternalreturn.com/ko/category/patch-notes-kr/")
        if(intent.hasExtra("news"))
            webview.loadUrl("https://steamcommunity.com/app/1049590/allnews/?l=korean")
        if(intent.hasExtra("inven"))
            webview.loadUrl("http://www.inven.co.kr/board/er/5684")
        if(intent.hasExtra("survivor"))
            webview.loadUrl("http://matchhistory.playeternalreturn.com/kr")
        if(intent.hasExtra("dakgg"))
            webview.loadUrl("https://dak.gg/bser")
        if(intent.hasExtra("loot_dakgg"))
            webview.loadUrl("https://dak.gg/bser/routes")
        if(intent.hasExtra("bs_inven"))
            webview.loadUrl("http://er.inven.co.kr/")
        if(intent.hasExtra("bs_dc"))
            webview.loadUrl("https://gall.dcinside.com/mgallery/board/lists/?id=bser")


        if(intent.hasExtra("search"))
        {
            if(a.length > 0)
                webview.loadUrl("https://dak.gg/bser/search/players?playerName=$a")
            else
                false

        }
        if(intent.hasExtra("아야")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%95%84%EC%95%BC")
        }
        if(intent.hasExtra("피오라")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%ED%94%BC%EC%98%A4%EB%9D%BC")
        }
        if(intent.hasExtra("재키")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%9E%AC%ED%82%A4")

        }
        if(intent.hasExtra("현우")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%ED%98%84%EC%9A%B0")
        }
        if(intent.hasExtra("아드리아나")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%95%84%EB%93%9C%EB%A6%AC%EC%95%84%EB%82%98")
        }
        if(intent.hasExtra("키아라")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%ED%82%A4%EC%95%84%EB%82%98")

        }
        if(intent.hasExtra("하트")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%ED%95%98%ED%8A%B8")

        }
        if(intent.hasExtra("혜진")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%ED%98%9C%EC%A7%84")

        }
        if(intent.hasExtra("아이솔")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%95%84%EC%9D%B4%EC%86%94")

        }
        if(intent.hasExtra("리 다이린")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EB%A6%AC%EB%8B%A4%EC%9D%B4%EB%A6%B0")
        }
        if(intent.hasExtra("매그너스")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EB%A7%A4%EA%B7%B8%EB%84%88%EC%8A%A4")

        }
        if(intent.hasExtra("나딘")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EB%82%98%EB%94%98")

        }
        if(intent.hasExtra("쇼이치")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%87%BC%EC%9D%B4%EC%B9%98")

        }
        if(intent.hasExtra("실비아")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?come_idx=5684&category=%EC%8B%A4%EB%B9%84%EC%95%84")

        }
        if(intent.hasExtra("시셀라")){
            webview.loadUrl( "http://www.inven.co.kr/board/er/5684?category=%EC%8B%9C%EC%85%80%EB%9D%BC")

        }
        if(intent.hasExtra("쇼우")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%87%BC%EC%9A%B0")

        }
        if(intent.hasExtra("유키")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%9C%A0%ED%82%A4")

        }
        if(intent.hasExtra("자히르")){
            webview.loadUrl("http://www.inven.co.kr/board/er/5684?category=%EC%9E%90%ED%9E%88%EB%A5%B4")
        }
    }
}