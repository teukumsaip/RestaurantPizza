package lat.pam.restaurantpizza

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val headerPizza = findViewById<TextView>(R.id.header_pizza)
        val headerSpaghetti = findViewById<TextView>(R.id.header_spaghetti)
        val headerBurger = findViewById<TextView>(R.id.header_burger)
        val headerSteak = findViewById<TextView>(R.id.header_steak)

        // Set onClickListener for headerPizza
        headerPizza.setOnClickListener {
            navigateToOrderActivity("Pizza")
        }

        // Set onClickListener for headerSpaghetti
        headerSpaghetti.setOnClickListener {
            navigateToOrderActivity("Spaghetti")
        }

        // Set onClickListener for headerBurger
        headerBurger.setOnClickListener {
            navigateToOrderActivity("Burger")
        }

        // Set onClickListener for headerSteak
        headerSteak.setOnClickListener {
            navigateToOrderActivity("Steak")
        }
    }

    private fun navigateToOrderActivity(itemName: String) {
        val intent = Intent(this, OrderActivity::class.java)
        intent.putExtra("item_name", itemName)
        startActivity(intent)
    }
}
