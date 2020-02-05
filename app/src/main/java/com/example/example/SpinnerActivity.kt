package com.example.example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val colors = arrayOf("Ko'k","Yashil","Qora","Oq")

        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colors)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                tv_natija_3.text = "Bosilgan rang ->  "
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                tv_natija_3.text = colors[position]
            }
        }

        seek_bar.max = 100
        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tv_natija_4.text = "Shuncha  $progress % yuriyapti!"
            }

            @SuppressLint("SetTextI18n")
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                tv_natija_4.text = "${seekBar?.progress} % dan boshlandi!"
            }

            @SuppressLint("SetTextI18n")
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                tv_natija_4.text = "${seekBar?.progress} % da to'xtadi!"
            }
        })
    }
}
