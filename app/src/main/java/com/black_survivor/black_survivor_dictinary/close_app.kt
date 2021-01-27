package com.black_survivor.black_survivor_dictinary

import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.kakao.adfit.ads.AdListener
import com.kakao.adfit.ads.ba.BannerAdView

class close_app : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_close_app)
        val adView: BannerAdView = findViewById(R.id.kakao_View)
        adView.setClientId("DAN-vH40oM1xdrny04Lo")  // 할당 받은 광고 단위(clientId) 설정
        adView.setAdListener(object : AdListener {  // optional :: 광고 수신 리스너 설정
            override fun onAdLoaded() {
                // 배너 광고 노출 완료 시 호출
            }

            override fun onAdFailed(errorCode: Int) {
                // 배너 광고 노출 실패 시 호출
            }

            override fun onAdClicked() {
                // 배너 광고 클릭 시 호출
            }

        })

// activity 또는 fragment의 lifecycle에 따라 호출
        lifecycle.addObserver(object : LifecycleObserver {

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun onResume() {
                adView.resume()
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            fun onPause() {
                adView.pause()
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy() {
                adView.destroy()
            }

        })
        adView.loadAd()

        var positive = findViewById<Button>(R.id.positive)
        var negative = findViewById<Button>(R.id.negative)

        positive.setOnClickListener {
            ActivityCompat.finishAffinity(this)
            System.exit(0)
        }
        negative.setOnClickListener {
            finish()
        }

    }
    override fun setTheme(resId: Int) {
        super.setTheme(R.style.Theme_AppCompat_Dialog)
    }



}