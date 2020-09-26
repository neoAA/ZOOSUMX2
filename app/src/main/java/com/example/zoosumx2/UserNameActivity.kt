package com.example.zoosumx2

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.RelativeLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_name.*

class UserNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_name)

        //사용자 이름

        val nextButton = findViewById<Button>(R.id.userName_button_next)
        nextButton.setOnClickListener{
            val intent = Intent(this, GetRegionActivity::class.java)
            intent.putExtra("user_name",userName_edit.text.toString())
            if(!TextUtils.isEmpty(userName_edit.getText())){
                startActivity(intent)
            }
        }
    }}