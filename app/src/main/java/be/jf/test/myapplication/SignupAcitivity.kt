package be.jf.test.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import java.time.LocalDate

class SignupAcitivity : AppCompatActivity() {

    private lateinit var etBirthdate : EditText
    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var etLastname : EditText
    private lateinit var cbAgreeCondition : CheckBox
    private lateinit var btnSend : Button

    companion object {
        val TAG = SignupAcitivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_acitivity)

        etEmail = findViewById(R.id.et_email_signup)
        etPassword = findViewById(R.id.et_password_signup)
        etLastname = findViewById(R.id.et_lastname_signup)
        etBirthdate = findViewById(R.id.et_birthdate_signup)
        cbAgreeCondition = findViewById(R.id.cb_agree_condition_signup)
        btnSend = findViewById(R.id.btn_send_signup)

        btnSend.setOnClickListener {

            val intent = Intent(this, AuthActivity::class.java)

            if(!cbAgreeCondition.isChecked) {
                Toast.makeText(this, "Merci d'accepter nos conditions !", Toast.LENGTH_LONG).show()
            }

            if (cbAgreeCondition.isChecked) {
                Log.d(TAG, """/n
                    Bonjour ${etLastname.text.toString()},
                    Merci de vous être inscrit(e).
                    Voici vos coordonnées :
                        Date de naissance : ${etBirthdate.text.toString()},
                        Email : ${etEmail.text.toString()},
                        Password : ${etPassword.text.toString()}
                """.trimIndent())

                startActivity(intent)
            }
        }
    }
}