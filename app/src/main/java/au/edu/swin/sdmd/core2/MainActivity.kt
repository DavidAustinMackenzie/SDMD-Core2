package au.edu.swin.sdmd.core2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

/*
* Images sourced from: www.formula1.com
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get image view inputs
        val imgAlbertPark = findViewById<ImageView>(R.id.imgViewAlbertPark)
        val imgAbuDhabi = findViewById<ImageView>(R.id.imgViewAbuDhabi)
        val imgMonaco = findViewById<ImageView>(R.id.imgViewMonaco)
        val imgMonza = findViewById<ImageView>(R.id.imgViewMonza)

        //Setup onClick listeners
        imgAlbertPark.setOnClickListener{
            val intent = Intent(this,AlbertParkActivity::class.java).apply{
                //putExtra()
            }
            startActivity(intent)
        }
        imgAbuDhabi.setOnClickListener{
            val intent = Intent(this,AbuDhabiActivity::class.java).apply{
                //putExtra()
            }
            startActivity(intent)
        }
        imgMonaco.setOnClickListener{
            val intent = Intent(this,MonacoActivity::class.java).apply{
                //putExtra()
            }
            startActivity(intent)
        }
        imgMonza.setOnClickListener{
            val intent = Intent(this,MonzaActivity::class.java).apply{
                //putExtra()
            }
            startActivity(intent)
        }




    }
}