package lat.pam.restaurantpizza

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Mengambil nilai dari intent sebelumnya (dari MainActivity)
        val userId = intent.getStringExtra("NAMA")
        val storeLocation = intent.getStringExtra("LOCATION")

        // Inisialisasi TextView
        val userIdTextView = findViewById<TextView>(R.id.user_id)
        val storeLocationTextView = findViewById<TextView>(R.id.store_location)

        // Menampilkan data yang diterima dari intent
        userIdTextView.text = "Hello, $userId"
        storeLocationTextView.text = storeLocation

        // Menambahkan listener untuk tombol "See Menus"
        val btnSeeMenus = findViewById<Button>(R.id.see_menus)
        btnSeeMenus.setOnClickListener {
            // Mengarahkan ke ThirdActivity
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("USER_ID", userId)
            intent.putExtra("STORE_LOCATION", storeLocation)
            startActivity(intent)
        }
    }
}
