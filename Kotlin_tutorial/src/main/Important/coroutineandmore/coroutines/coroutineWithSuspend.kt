package com.example.coroutineandmore.coroutines

//import android.util.Log
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.GlobalScope
//import kotlinx.coroutines.async
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//import kotlinx.coroutines.withContext
//import kotlinx.coroutines.yield
//
//class coroutineWithSuspend {
//
//    // read coroutines.txt
//
//    fun coroutine(){
//        /*
//        CoroutineScope(Dispatchers.Main).launch {
//
//
//            task1()
//        }
//
//        CoroutineScope(Dispatchers.Main).launch {
//            task2()
//        }
//
//         */
//
////        CoroutineScope(Dispatchers.IO).launch {
////            askFollower()
////        }
////        Log.d("thread", "Main task")
//
//
////      runBlocking { // not allow other thread or coroutine to execute until all coroutine inside this block is get finished.
////            launch {
////                delay(12000)
////                Log.d("info_follower","check")
////            }
////        }
//
//
//        // read after askFollower():
//
//        CoroutineScope(Dispatchers.IO).launch {
//
////            You can define multiple coroutine inside a coroutine:
//
////            to execute both function parallel:
//
////            by default it takes parent's Coroutine Context (Dispatchers). If you want to change, you can:
//            var f = async(Dispatchers.Main) { getFollower() }
//
////            it takes Dispatchers.IO as Coroutine context because it's parent has the Dispatchers.IO
//            var i = async { getInfo() }
//
////            If we wouldn't have used async{} then getInfo must wait for getFollower() to complete.
//
//            Log.d("info_follower", "${f.await()} ${i.await()}")
//        }
//
//
////        withContext:
//        var t = 0
//        GlobalScope.launch {
//           t =  executeContext()
//            Log.d("result",t.toString())
//        }
//        Log.d("result",t.toString())
//
//
//
//    }
//
//
//    private suspend fun askFollower() {
//
//        var follower:Int = 0
//
//
////        using launch:
//        var job = CoroutineScope(Dispatchers.IO).launch {
//       follower =  getFollower()
//
//            Log.d("follower",follower.toString()+" inside launch")
//        }
//
//        job.join() // don't execute next line until job done (coroutine complete).
//
//        Log.d("follower",follower.toString()+" launch")
//
//
////        using async:
//
//        var job2 = CoroutineScope(Dispatchers.IO).async {
//             getFollower() // last statement is return as result
//        }
//
//        Log.d("follower",job2.await().toString()+" await")
//
//
//    }
//
//    suspend fun task1()
//    {
//        Log.d("thread", "Starting task 1")
//        yield() // to define suspension point.
////        delay(2000)
//        Log.d("thread", "Ending task 1")
//    }
//
//    suspend fun task2()
//    {
//        Log.d("thread", "Starting task 2")
//        yield()
////        delay(3000)
//        Log.d("thread", "Ending task 2")
//    }
//
//    suspend fun getFollower():Int
//    {
//        delay(4000)
//        return 54
//    }
//
//    suspend fun getInfo():Int
//    {
//        delay(5000)
//        return 54
//    }
//
//
//    private suspend fun executeContext():Int{
//       return withContext(Dispatchers.Main){
//            delay(3000)
//            65
//        }
//    }
