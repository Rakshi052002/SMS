package com.example.sms
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phnNumber: EditText = findViewById(R.id.etNumber)
        val msg: EditText = findViewById(R.id.etMessage)
        val btnSend : Button = findViewById(R.id.btSend)

        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS),10)

        btnSend.setOnClickListener {
            val number=phnNumber.text.toString()
            val Msg=msg.text.toString()
            val smsmanager:SmsManager
            smsmanager=SmsManager.getDefault()
            smsmanager.sendTextMessage(number,null,Msg,null,null)

        }



    }
}