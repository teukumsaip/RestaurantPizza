package lat.pam.restaurantpizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var storeSpinner: Spinner
    private lateinit var edtName: TextInputEditText
    private lateinit var btnMasuk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storeTextView: TextView = findViewById(R.id.store)
        storeSpinner = findViewById(R.id.store_spinner)
        edtName = findViewById(R.id.edt_name)
        btnMasuk = findViewById(R.id.btn_masuk)

        val storeOptions = resources.getStringArray(R.array.store_spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, storeOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        storeSpinner.adapter = adapter

        btnMasuk.setOnClickListener {
            val nama = edtName.text.toString()

            // Mengarahkan ke SecondActivity sambil mengirimkan nama
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAMA", nama)
            startActivity(intent)
        }
    }
}
