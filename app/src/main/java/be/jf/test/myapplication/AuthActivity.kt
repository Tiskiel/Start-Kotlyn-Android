package be.jf.test.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class AuthActivity : AppCompatActivity() {

    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var  btnReset : Button

    companion object {
        val TAG = AuthActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        etEmail = findViewById(R.id.et_email_auth)
        etPassword = findViewById(R.id.et_password_auth)
        btnLogin = findViewById(R.id.btn_login_auth)
        btnReset = findViewById(R.id.btn_reset_auth)

        btnLogin.setOnClickListener {
            Log.d(TAG, "Email : ${etEmail.text.toString()}, password : ${etPassword.text.toString()}")
        }

        btnReset.setOnClickListener {
            etEmail.setText("")
            etPassword.setText("")
        }

    }
}