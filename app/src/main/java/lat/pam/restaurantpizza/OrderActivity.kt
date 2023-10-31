package lat.pam.restaurantpizza

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val buttonOrder = findViewById<MaterialButton>(R.id.order)
        val buttonBack = findViewById<MaterialButton>(R.id.back)

        buttonOrder.setOnClickListener {
            // Arahkan ke DetailActivity ketika tombol Order ditekan
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        buttonBack.setOnClickListener {
            // Kembali ke ThirdActivity ketika tombol Back ditekan
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
