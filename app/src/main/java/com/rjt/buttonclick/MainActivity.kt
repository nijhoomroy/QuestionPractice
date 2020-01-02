package com.rjt.buttonclick

import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding.view.RxView
import io.reactivex.Observable
import io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe
import kotlinx.android.synthetic.main.activity_main.*
import rx.functions.Action0

import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RxView.clicks(btn_1).subscribe {
            // Replace below with your click handling code
            Log.d("Nijhoom", "Clicked")
        }

        /*fun Button.longPressObservable(){
            return (Toast.makeText(applicationContext,"Button Pressed", Toast.LENGTH_LONG).show())
        }*/

        RxView.longClicks(btn_2)
            .throttleFirst(5, TimeUnit.MILLISECONDS)
            .subscribe{
                Log.d("Nijhoom", "Buttom Clicked")
            }


      }




    }




