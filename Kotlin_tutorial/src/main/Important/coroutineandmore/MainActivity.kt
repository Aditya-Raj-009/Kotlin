package com.example.coroutineandmore

//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.TextView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.coroutineandmore.coroutines.coroutineWithSuspend
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.GlobalScope
//import kotlinx.coroutines.MainScope
//import kotlinx.coroutines.launch
//import kotlin.concurrent.thread
//
//class MainActivity : AppCompatActivity() {
//    fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//
////        read coroutine.txt.
//
//
//        var coroutineWithSuspend = coroutineWithSuspend()
//        coroutineWithSuspend.coroutine()
//    }
///*
//    fun updateCounter(view: View) {
//       var counterText =  findViewById<TextView>(R.id.count)
//        counterText.text = "${counterText.text.toString().toInt()+1}"
//    }
//
//    fun longRunning(view: View) {
//
////        // using thread:
////        thread(start = true){
////            executinLongRunning()
////        Log.d("threadName", "${Thread.currentThread().name}")
////        }
//
////        Using Coroutine:
//        CoroutineScope(Dispatchers.IO).launch {
//            Log.d("threadName", " 1 ${Thread.currentThread().name}")
//
//        }
//
//        GlobalScope.launch(Dispatchers.Main) {
//            Log.d("threadName", " 2 ${Thread.currentThread().name}")
//        }
//
//        MainScope().launch(Dispatchers.Main) {
//            Log.d("threadName", " 3 ${Thread.currentThread().name}")
//        }
//
//    }
//    */
////    Suspend function :
//



    private fun executinLongRunning() {
        for (i in 1..999999999L)
        {

        }
    }
