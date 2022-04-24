package com.example.projetandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        supportActionBar?.hide()
        val CalculatorResult = findViewById<TextView>(R.id.CalculatorResult)
        val button_cancel = findViewById<Button>(R.id.button_cancel)
        val button_back = findViewById<Button>(R.id.button_back)
        val button_divide = findViewById<Button>(R.id.button_divide)
        val button_modulo = findViewById<Button>(R.id.button_modulo)
        val button_multiply = findViewById<Button>(R.id.button_multiply)
        val button_minus = findViewById<Button>(R.id.button_minus)
        val button_plus = findViewById<Button>(R.id.button_plus)
        val button_comma = findViewById<Button>(R.id.button_comma)
        val button_0 = findViewById<Button>(R.id.button_0)
        val button_1 = findViewById<Button>(R.id.button_1)
        val button_2 = findViewById<Button>(R.id.button_2)
        val button_3 = findViewById<Button>(R.id.button_3)
        val button_4 = findViewById<Button>(R.id.button_4)
        val button_5 = findViewById<Button>(R.id.button_5)
        val button_6 = findViewById<Button>(R.id.button_6)
        val button_7 = findViewById<Button>(R.id.button_7)
        val button_8 = findViewById<Button>(R.id.button_8)
        val button_9 = findViewById<Button>(R.id.button_9)
        val button_equal = findViewById<Button>(R.id.button_equal)
        button_cancel.setOnClickListener {
            CalculatorResult.setText("");
        }
        button_back.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.substring(0, CalculatorResult.text.length - 1));
        }
        button_divide.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "/");
        }
        button_modulo.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "%");
        }
        button_multiply.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "x");
        }
        button_minus.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "-");
        }
        button_plus.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "+");
        }
        button_comma.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + ".");
        }
        button_0.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "0");
        }
        button_1.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "1");
        }
        button_2.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "2");
        }
        button_3.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "3");
        }
        button_4.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "4");
        }
        button_5.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "5");
        }
        button_6.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "6");
        }
        button_7.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "7");
        }
        button_8.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "8");
        }
        button_9.setOnClickListener {
            CalculatorResult.setText(CalculatorResult.text.toString() + "9");
        }
        button_equal.setOnClickListener {
            var result = 0
            var tempIndex = 0
            val calcul = CalculatorResult.text.toString()
            if (calcul != "") {
                var i = 0
                while (i < calcul.length) {
                    if (calcul[i] == '/' && i < calcul.length - 1) {
                        i += 1
                        tempIndex = i
                        while (calcul[i+1].isDigit()) {
                            i += 1
                        }
                        result /= calcul.substring(tempIndex, i + 1).toInt()
                        tempIndex = 0
                        i += 1
                    }
                    else if (calcul[i] == '%' && i < calcul.length - 1) {
                        i += 1
                        tempIndex = i
                        while (calcul[i+1].isDigit()) {
                            i += 1
                        }
                        result %= calcul.substring(tempIndex, i + 1).toInt()
                        tempIndex = 0
                        i += 1
                    }
                    else if (calcul[i] == 'x' && i < calcul.length - 1) {
                        i += 1
                        tempIndex = i
                        while (calcul[i+1].isDigit()) {
                            i += 1
                        }
                        result *= calcul.substring(tempIndex, i + 1).toInt()
                        tempIndex = 0
                        i += 1
                    }
                    else if (calcul[i] == '-' && i < calcul.length - 1) {
                        i += 1
                        tempIndex = i
                        while (calcul[i+1].isDigit()) {
                            i += 1
                        }
                        result -= calcul.substring(tempIndex, i + 1).toInt()
                        tempIndex = 0
                        i += 1
                    }
                    else if (calcul[i] == '+' && i < calcul.length - 1) {
                        i += 1
                        tempIndex = i
                        while (calcul[i+1].isDigit()) {
                            i += 1
                        }
                        result += calcul.substring(tempIndex, i + 1).toInt()
                        tempIndex = 0
                        i += 1
                    }
                    else if (calcul[i].isDigit()) {
                        tempIndex = i
                        while (calcul[i+1].isDigit()) {
                            i += 1
                        }
                        result += calcul.substring(tempIndex, i + 1).toInt()
                        tempIndex = 0
                        i += 1
                    }
                }
            }
            CalculatorResult.setText(CalculatorResult.text.toString() + "0");
        }
    }
}