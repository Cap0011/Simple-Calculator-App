package com.example.simplecaculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.ColorRes
import androidx.appcompat.widget.AppCompatButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var value:Double = 0.0
    var isValue:Boolean=false
    var isStart:Boolean=false
    var isDot:Boolean=false
    var isDigit:Boolean=false
    var isMi:Boolean=false
    private var curbtn:Button?=null
    var isDark:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var sum:Double=0.0
        var cur:Double=0.0
        var cal:String?=null
        var checkDot:Boolean = false
        var dotTimes:Double = 1.0
        var checkPos:Boolean = true
        var isCur:Boolean = false
        var isDark:Boolean=true
        var curbtn:Button?=null
        tvResult.text= sum.toString()

        btnmode.setOnClickListener {
            isDark=!isDark
            if(isDark){
                llo0.setBackgroundColor(Color.BLACK)
                btnmode.setImageResource(R.drawable.staron)
                tvResult.setTextColor(Color.WHITE)
            }else{
                llo0.setBackgroundColor(Color.WHITE)
                btnmode.setImageResource(R.drawable.staroff)
                tvResult.setTextColor(Color.BLACK)
            }
        }
        btn0.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 0.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot)sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()
        }
        btn1.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 1.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn2.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 2.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn3.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 3.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn4.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 4.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn5.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 5.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn6.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 6.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn7.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 7.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn8.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 8.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btn9.setOnClickListener {
            btnac.text = "C"
            var temp:Double = 9.0
            if(!checkPos) temp*=(-1.0)
            if(!checkDot) sum *= 10
            sum += temp*dotTimes
            if(checkDot) {
                dotTimes/=10
            }
            tvResult.text=sum.toString()}
        btnac.setOnClickListener {
            curbtn?.setBackgroundResource(R.drawable.yellow_btn)
            isCur=false
            sum=0.0
            cur=0.0
            checkDot=false
            dotTimes=1.0
            btnac.text = "AC"
            tvResult.text=sum.toString()
        }
        btneq.setOnClickListener {
            curbtn?.setBackgroundResource(R.drawable.yellow_btn)
            isCur=true
                when(cal){
                    "+"->{cur+=sum}
                    "-"->{cur-=sum}
                    "*"->{cur*=sum}
                    "/"->{cur/=sum}
                    else->{isCur=false}
                }

            cal=null
            sum=0.0
            tvResult.text = cur.toString()
        }
        btnpl.setOnClickListener {
            curbtn?.setBackgroundResource(R.drawable.yellow_btn)
            curbtn=btnpl
            (curbtn as AppCompatButton?)!!.setBackgroundResource(R.drawable.ye_clicked)
            if(!isCur) {
                cur = sum
                isCur = true
            }
            else {
                when (cal) {
                    "+" -> {
                        cur += sum
                    }
                    "-" -> {
                        cur -= sum
                    }
                    "*" -> {
                        cur *= sum
                    }
                    "/" -> {
                        cur /= sum
                    }
                    else -> {
                    }
                }
            }
            cal="+"
            sum=0.0
            checkDot=false
            checkPos=true
            dotTimes=1.0
            tvResult.text=cur.toString()
        }
        btnmi.setOnClickListener {
            curbtn?.setBackgroundResource(R.drawable.yellow_btn)
            curbtn=btnmi
            (curbtn as AppCompatButton?)!!.setBackgroundResource(R.drawable.ye_clicked)
            if(!isCur) {
                cur = sum
                isCur = true
            }
            else {
                when (cal) {
                    "+" -> {
                        cur += sum
                    }
                    "-" -> {
                        cur -= sum
                    }
                    "*" -> {
                        cur *= sum
                    }
                    "/" -> {
                        cur /= sum
                    }
                    else -> {
                    }
                }
            }
            cal="-"
            sum=0.0
            checkDot=false
            checkPos=true
            dotTimes=1.0
            tvResult.text=cur.toString()
        }
        btnmul.setOnClickListener {
            curbtn?.setBackgroundResource(R.drawable.yellow_btn)
            curbtn=btnmul
            (curbtn as AppCompatButton?)!!.setBackgroundResource(R.drawable.ye_clicked)
            if(!isCur) {
                cur = sum
                isCur = true
            }
            else {
                when (cal) {
                    "+" -> {
                        cur += sum
                    }
                    "-" -> {
                        cur -= sum
                    }
                    "*" -> {
                        cur *= sum
                    }
                    "/" -> {
                        cur /= sum
                    }
                    else -> {
                    }
                }
            }
            cal="*"
            sum=0.0
            checkDot=false
            checkPos=true
            dotTimes=1.0
            tvResult.text=cur.toString()
        }
        btndev.setOnClickListener {
            curbtn?.setBackgroundResource(R.drawable.yellow_btn)
            curbtn=btndev
            (curbtn as AppCompatButton?)!!.setBackgroundResource(R.drawable.ye_clicked)
            if(!isCur) {
                cur = sum
                isCur = true
            }
            else {
                when (cal) {
                    "+" -> {
                        cur += sum
                    }
                    "-" -> {
                        cur -= sum
                    }
                    "*" -> {
                        cur *= sum
                    }
                    "/" -> {
                        cur /= sum
                    }
                    else -> {
                    }
                }
            }
            cal="/"
            sum=0.0
            checkDot=false
            checkPos=true
            dotTimes=1.0
            tvResult.text=cur.toString()
        }

        btndot.setOnClickListener {
            if(!checkDot) {
                dotTimes /= 10
                checkDot = true
            }
        }
        btnper.setOnClickListener {
            if(tvResult.text==cur.toString()){
                cur/=100
                tvResult.text=cur.toString()
            }else{
                sum/=100
                tvResult.text=sum.toString()
            }
        }
        btnpm.setOnClickListener {
            if(tvResult.text==cur.toString()){
                if(cur==0.0) checkPos=!checkPos
            }else{
                if(sum==0.0) checkPos=!checkPos
            }
        }
         */
    }
    fun onStar(view: View){
        isDark=!isDark
        if(isDark){
            llo0.setBackgroundColor(Color.BLACK)
            btnmode.setImageResource(R.drawable.staron)
            tvResult.setTextColor(Color.WHITE)
        }else{
            llo0.setBackgroundColor(Color.WHITE)
            btnmode.setImageResource(R.drawable.staroff)
            tvResult.setTextColor(Color.BLACK)
        }
    }
    fun onPos(view: View){
        if(!isDigit&&!isMi){
            isMi = true
            tvResult.append("-")
        }
    }
    fun onClear(view:View){
        tvResult.text=""
        value = 0.0
        isValue=false
        isStart=false
        isDigit=false
        isDot=false
        isMi=false
    }
    fun onDigit(view: View){
        if(isStart){
            isStart=false
            tvResult.text=""
        }
        tvResult.append((view as AppCompatButton).text)
        isDigit=true
    }
    fun onDot(view: View){
        if(!isDot&&isDigit){
            tvResult.append(".")
            isDot=true
        }
    }
    fun onCal(view:View){
        if(isDigit) {
            val temp: Double = tvResult.text.toString().toDouble()
            if (isValue) {
                when (curbtn?.text) {
                    "+" -> {
                        value += temp
                    }
                    "−" -> {
                        value -= temp
                    }
                    "×" -> {
                        value *= temp
                    }
                    "÷" -> {
                        value /= temp
                    }
                    "%" -> {
                        value /= 100
                    }
                }
            } else {
                value = tvResult.text.toString().toDouble()
                isValue = true
                if (curbtn?.text == "%") {
                    value /= 100
                }
            }
            tvResult.text = value.toString()
            curbtn = (view as AppCompatButton)
            isStart = true
            isDigit = false
            isDot = false
            isMi = false
        }
    }
}