package com.marcos.formulariodecadastro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trocaTela(view : View){
        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        var troca = Intent(this, pag2::class.java)
        startActivity(troca)

    }

}