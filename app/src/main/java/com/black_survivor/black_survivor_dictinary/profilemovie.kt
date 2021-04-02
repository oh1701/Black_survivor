package com.black_survivor.black_survivor_dictinary

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class profilemovie : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilemovie)

        if(intent.hasExtra("아야")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=Z3OBLGyepzk&feature=emb_logo"))
            startActivity(intent)
            }
        if(intent.hasExtra("피오라")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=6R4I3s3MgtU&feature=emb_logo"))
            startActivity(intent)
        }

        if(intent.hasExtra("현우")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=Byu_r9lmoiI"))
            startActivity(intent)
        }
        if(intent.hasExtra("재키")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=ftUAFEGcDhY"))
            startActivity(intent)
        }
        if(intent.hasExtra("자히르")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=_HjXhkXBGxI"))
            startActivity(intent)
        }
        if(intent.hasExtra("매그너스")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=baRm6oD6cxY"))
            startActivity(intent)
        }
        if(intent.hasExtra("하트")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=zce-3RuFdw4"))
            startActivity(intent)
        }
        if(intent.hasExtra("나딘")) {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.youtube.com/watch?v=3P4Lw6PS8kg"))
            startActivity(intent)
        }
    }
}