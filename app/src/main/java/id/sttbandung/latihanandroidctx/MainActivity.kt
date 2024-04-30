package id.sttbandung.latihanandroidctx
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

        //input phone number
class MainActivity : AppCompatActivity() {

    private lateinit var phoneNumberEditText: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneNumberEditText = findViewById(R.id.editTextPhone)
    }
        //pennggunaan toast pada saat submit nomor
    fun onSubmitButtonClick(view: View) {
        val phoneNumber = phoneNumberEditText.text.toString().trim()

        if (isValidPhoneNumber(phoneNumber)) {
            Toast.makeText(this, "Phone number is valid", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Invalid phone number", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidPhoneNumber(phoneNumber: String): Boolean {
        // Validasi apakah nomor telepon memiliki panjang minimal.
        return phoneNumber.length >= 10
    }
}
