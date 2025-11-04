package com.example.inferonclass1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // 여기 밑에 코드는 화면을 보여주는 코드
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 합니다(프로그램이)
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.btsImage2)
        val image3 = findViewById<ImageView>(R.id.btsImage3)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

    }
}