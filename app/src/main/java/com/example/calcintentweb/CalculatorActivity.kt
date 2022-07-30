package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var firstno: EditText
    lateinit var secondno: EditText
    lateinit var ButtonAdd:Button
    lateinit var ButtonMultiply: Button
    lateinit var ButtonSub: Button
    lateinit var ButtonDiv: Button
    lateinit var txt_answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatoractivity)
        ButtonAdd=findViewById(R.id.add_button)
        ButtonSub=findViewById(R.id.subtract_button)
        ButtonDiv=findViewById(R.id.divide_button)
        ButtonMultiply=findViewById(R.id.multiply_button)
        firstno=findViewById(R.id.edt_firstno)
        secondno=findViewById(R.id.edt_secondno)
        txt_answer=findViewById(R.id.txt_answer)
        ButtonAdd!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() &&  secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty() ){
                txt_answer.text="input this shit please"
            }else{
                var answer=firstno.toDouble() + secondno.toDouble()
                txt_answer.text=answer.toString()
            }
        }
        ButtonSub!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty() ){
                txt_answer.text="input this shit please"
            }else{
                var answer=firstno.toDouble() - secondno.toDouble()
                txt_answer.text=answer.toString()
            }
        }
        ButtonMultiply!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty() ){
                txt_answer.text="input this shit please"
            }else{
                var answer=firstno.toDouble() * secondno.toDouble()
                txt_answer.text=answer.toString()
            }
        }
        ButtonDiv!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty() ){
                txt_answer.text="input this shit please"
            }else{
                var answer=firstno.toDouble() / secondno.toDouble()
                txt_answer.text=answer.toString()
            }
        }

    }
}