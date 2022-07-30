package com.example.calcintentweb

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class IntentActivity : AppCompatActivity() {
    var ButtonSms:Button ?= null
    var ButtonEmail:Button ?= null
    var ButtonCamera:Button ?= null
    var ButtonsCall:Button ?= null
    var ButtonStk:Button ?= null
    var ButtonDail:Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        ButtonEmail = findViewById(R.id.btn_email)
        ButtonSms = findViewById(R.id.btn_sms)
        ButtonCamera = findViewById(R.id.btn_camera)
        ButtonsCall = findViewById(R.id.btn_call)
        ButtonStk = findViewById(R.id.btn_stk)
        ButtonDail = findViewById(R.id.btn_dail)

        ButtonSms!!.setOnClickListener {
            val uri = Uri.parse("smsto: +254 791 712324")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("sms_body", "The SMS text")

            startActivity(intent)

        }
        ButtonEmail!!.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))


        }
        ButtonDail!!.setOnClickListener {
            val phone = "+254 791 712324"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        ButtonsCall!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254 791 712324"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }
        ButtonStk!!.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }


        }

        }
    }
}