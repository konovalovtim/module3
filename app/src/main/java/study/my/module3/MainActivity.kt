package study.my.module3

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun testclick(view: View) {
        
        val editText: EditText = findViewById(R.id.editText)
        val string = editText.text.toString()
        if (string == null || string.equals("")) {
            Toast.makeText(this, "Введите текст", Toast.LENGTH_SHORT).show()
        }
        val imageView: ImageView = findViewById(R.id.imageView)
        Glide.with(this).load(string).into(imageView)
    }
}