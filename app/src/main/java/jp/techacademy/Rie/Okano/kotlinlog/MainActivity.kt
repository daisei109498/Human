package jp.techacademy.Rie.Okano.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("岡野理恵", 35, "音楽")
        human.say()
        human.think()

        val human2 = Human("Rie.Okano", 5,"スマホ")
        human2.say()
        human2.think()
    }
}