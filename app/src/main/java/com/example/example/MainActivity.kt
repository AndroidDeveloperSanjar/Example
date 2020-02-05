package com.example.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tasdiqlash.setOnClickListener{
            var result = ""
            if (radio_group.checkedRadioButtonId != -1){
                result += "Jinsingiz -> "
                if (rb_erkak.isChecked) result += "Erkak\n"
                else if (rb_ayol.isChecked) result += "Ayol\n"
            }
            result += "Ilovaning tili -> "
            if (chb_eng.isChecked) result += "English, "
            if (chb_rus.isChecked) result += "Русский, "
            if (chb_uzb.isChecked) result += "O'zbekcha, "

            tv_natija_1.text = result
        }

        btn_kopiya.setOnClickListener {
            tv_natija_2.text = et_text.text
        }
        
    }
}
