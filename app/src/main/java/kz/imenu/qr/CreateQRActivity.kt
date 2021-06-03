package kz.imenu.qr

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_create_qr.*
import kz.imenu.R


class CreateQRActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_qr)

        Picasso.get()
            .load("https://hsto.org/getpro/habr/upload_files/74f/738/1a1/74f7381a15ca4bdcd4046005b780e63f.png")
            .into(qrImage)

        generate.setOnClickListener {
            hideKeyboard(this)
            qrImage.visibility = VISIBLE
            download.visibility = VISIBLE

            generate.visibility = GONE
            number.visibility = GONE
        }


        download.setOnClickListener {
            Toast.makeText(this, "Скачано успешно", Toast.LENGTH_SHORT).show()
            hideKeyboard(this)

            generate.visibility = VISIBLE
            number.visibility = VISIBLE


            qrImage.visibility = GONE
            download.visibility = GONE
        }
    }

    fun hideKeyboard(activity: Activity) {
        val imm: InputMethodManager =
            activity.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view: View? = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
    }
}