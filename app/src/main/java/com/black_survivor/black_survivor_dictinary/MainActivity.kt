package com.black_survivor.black_survivor_dictinary

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.material.navigation.NavigationView

lateinit var a:String
class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    @RequiresApi(Build.VERSION_CODES.O)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this){}
        var adview6 = findViewById<AdView>(R.id.adview6)
        adview6.loadAd(AdRequest.Builder().build())

        var ch = findViewById<Button>(R.id.Character)
        var item = findViewById<Button>(R.id.Item)
        var menu = findViewById<ImageView>(R.id.menu)
        var layoutdrawer = findViewById<DrawerLayout>(R.id.layout_drawer)
        var naviView = findViewById<NavigationView>(R.id.navi_view)
        var src = findViewById<Button>(R.id.src_btn)
        var lank = findViewById<Button>(R.id.Lank)
        var patch = findViewById<Button>(R.id.patch)
        var skill = findViewById<Button>(R.id.Weapon_skill)
        var rvmap = findViewById<RecyclerView>(R.id.map_list)
        var map = findViewById<ImageView>(R.id.map_ima)
        var lay = findViewById<LinearLayout>(R.id.lay1)
        var animal = findViewById<Button>(R.id.animal)
        var loot = findViewById<Button>(R.id.loot)

        var name = findViewById<EditText>(R.id.search)
        var webview = findViewById<WebView>(R.id.webview)

        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.webChromeClient = WebChromeClient()

        fun inten(a:String){
            val intent = Intent(this, internet::class.java)
            intent.putExtra(a, a)
            startActivity(intent)
        }

        name.setOnEditorActionListener { v, actionId, event -> //텍스트 완료 이벤트
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                a = name.text.toString()
                name.text = null
                if (a.length > 0) {
                    lay.visibility = View.VISIBLE
                    webview.visibility = View.GONE
                    inten("search")
                } else
                    false
            }
            false
        }

        animal.setOnClickListener {
            val intent = Intent(this, creature::class.java)
            startActivity(intent)
        }

        src.setOnClickListener { //서치 버튼 클릭 이벤트
            a = name.text.toString()
            lay.visibility = View.VISIBLE
            webview.visibility = View.GONE
            inten("search")
        }

        ch.setOnClickListener { //캐릭터 이동
            val intent = Intent(this, Character::class.java)
            startActivity(intent)
        }

        item.setOnClickListener() { //아이템으로 이동
            val intent = Intent(this, Item::class.java)
            startActivity(intent)
        }

        skill.setOnClickListener {
            val intent = Intent(this, weaponskill::class.java)
            startActivity(intent)
        }
        loot.setOnClickListener {
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("loot_dakgg")
        }
        menu.setOnClickListener { //네비게이션바 왼쪽에서 시작
            layoutdrawer.openDrawer(GravityCompat.START)
        }

        lank.setOnClickListener(){ //랭킹 확인
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("Lank")
        }

        patch.setOnClickListener {
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("patch")
        }


        naviView.setNavigationItemSelectedListener(this)

        var maplist = arrayListOf(
                map_listclass("골목길") ,map_listclass("절"),
                map_listclass("번화가"),
                map_listclass("연못"),
                map_listclass("병원"),
                map_listclass("양궁장"),
                map_listclass("학교"),
                map_listclass("묘지"),
                map_listclass("공장"),
                map_listclass("호텔"),
                map_listclass("숲"),
                map_listclass("성당"),
                map_listclass("모래사장"),
                map_listclass("고급 주택가"),
                map_listclass("항구"),
                map_listclass("연구소"),
        )

        rvmap.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvmap.setHasFixedSize(true)
        rvmap.adapter = map_list(maplist)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var webview = findViewById<WebView>(R.id.webview)
        fun inten(a:String){
            val intent = Intent(this, internet::class.java)
            intent.putExtra(a, a)
            startActivity(intent)
        }

        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.webChromeClient = WebChromeClient()
        var lay = findViewById<LinearLayout>(R.id.lay1)

        var a = item.itemId

        if(a == R.id.me1_1){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("news")
        }
        if(a == R.id.me1_2){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("patch")
        }

        if(a == R.id.me2_1) {
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            val intent = Intent(this, Character::class.java)
            startActivity(intent)
        }
        if(a == R.id.me2_2)
        {
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            val intent = Intent(this, Item::class.java)
            startActivity(intent)
        }
        if(a == R.id.me2_3){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("inven")
        }
        if(a == R.id.me2_5){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("loot_dakgg")
        }
        if(a == R.id.me3_1){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("survivor")
        }
        if(a == R.id.me3_2){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("dakgg")

        }
        if(a == R.id.me4_1){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("bs_inven")
        }
        if(a == R.id.me4_2){
            webview.visibility = View.GONE
            lay.visibility = View.VISIBLE
            inten("bs_dc")
        }


        var dd = findViewById<DrawerLayout>(R.id.layout_drawer)
        dd.closeDrawers()
        return false
    }

    override fun onBackPressed() {
        var dd = findViewById<DrawerLayout>(R.id.layout_drawer)
        var webview = findViewById<WebView>(R.id.webview)
        var lay = findViewById<LinearLayout>(R.id.lay1)


        if (dd.isDrawerOpen(GravityCompat.START)) {
            dd.closeDrawers()
        }
        else {
            if (webview.visibility == View.VISIBLE) {
                webview.visibility = View.GONE
                lay.visibility = View.VISIBLE
            }
            else {
                val intent = Intent(this, close_app::class.java)
                startActivity(intent)
            }
        }
    }
}
