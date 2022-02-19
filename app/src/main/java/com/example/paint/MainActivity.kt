package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        redBtn.setOnClickListener {
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
           // Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
        }
        blueBtn.setOnClickListener {
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
            //Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
        }
        whiteBtn.setOnClickListener {
            paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)
           // Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
        }
        purpleBtn.setOnClickListener {
            paintBrush.color = Color.MAGENTA
            currentColor(paintBrush.color)
           // Toast.makeText(this, "5", Toast.LENGTH_SHORT).show()
        }
        greenBtn.setOnClickListener {
           // Toast.makeText(this, "6", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }
        brownBtn.setOnClickListener {
           // Toast.makeText(this, "7", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.DKGRAY
            currentColor(paintBrush.color)

        }
        yellowBtn.setOnClickListener {
          //  Toast.makeText(this, "8", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)

        }
        clear.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color : Int){
        currentBrush = color
        path = Path()
    }
}