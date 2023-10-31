package lat.pam.restaurantpizza

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mengambil data yang dipassing dari MainActivity
        val name = intent.getStringExtra("EXTRA_NAME")
        val location = intent.getStringExtra("EXTRA_LOCATION")

        // Inisialisasi elemen-elemen UI
        val orderDetailTextView = findViewById<TextView>(R.id.order_detail)
        val outputDetailTextView = findViewById<TextView>(R.id.outputDetail)
        val pickupCheckbox = findViewById<CheckBox>(R.id.pickupCheckbox)
        val deliveryCheckbox = findViewById<CheckBox>(R.id.deliveryCheckbox)
        val seeMenusButton = findViewById<MaterialButton>(R.id.done)

        // Menampilkan data yang diambil dari MainActivity
        val orderDetailText = "$name\nStore: $location\nPepperoni Pizza sudah dipesan"
        outputDetailTextView.text = orderDetailText

        // Tambahkan onClickListener untuk button "See Menus"
        seeMenusButton.setOnClickListener {
            // Di sini, Anda dapat menambahkan kode untuk berpindah ke aktivitas lain (OrderActivity).
            // Contohnya:
            // val intent = Intent(this, OrderActivity::class.java)
            // startActivity(intent)
        }
    }
}