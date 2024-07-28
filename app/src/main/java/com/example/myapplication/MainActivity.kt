package com.example.myapplication

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var sttBtn: Button? = null
    var textView : TextView? = null
    val PERMISSION: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.i("start", "시작")
//
//        // 권한 요청
//        if (Build.VERSION.SDK_INT >= 23) {
//            ActivityCompat.requestPermissions(
//                this, arrayOf(
//                    Manifest.permission.INTERNET,
//                    Manifest.permission.RECORD_AUDIO
//                ), 1
//            )
//            Log.i("Permission", "권한 요청 O")
//        }
//
//        textView = findViewById(R.id.sttResult)
//        sttBtn = findViewById(R.id.sttStart)
//
//        // RecognizerIntent 생성
//        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
//        intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, packageName)
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ko-KR")
//        sttBtn!!.setOnClickListener {
//            val mRecognizer = SpeechRecognizer.createSpeechRecognizer(this@MainActivity)
//            mRecognizer.setRecognitionListener(listener)
//            mRecognizer.startListening(intent)
//        }
    }

//    private val listener: RecognitionListener = object : RecognitionListener {
//        override fun onReadyForSpeech(params: Bundle) {
//            Toast.makeText(getApplicationContext(), "음성인식을 시작합니다.", Toast.LENGTH_SHORT).show()
//        }
//
//        override fun onBeginningOfSpeech() {}
//
//        override fun onRmsChanged(rmsdB: Float) {}
//
//        override fun onBufferReceived(buffer: ByteArray) {}
//
//        override fun onEndOfSpeech() {}
//
//        override fun onError(error: Int) {
//            val message = when (error) {
//                SpeechRecognizer.ERROR_AUDIO -> "오디오 에러"
//                SpeechRecognizer.ERROR_CLIENT -> "클라이언트 에러"
//                SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS -> "퍼미션 없음"
//                SpeechRecognizer.ERROR_NETWORK -> "네트워크 에러"
//                SpeechRecognizer.ERROR_NETWORK_TIMEOUT -> "네트웍 타임아웃"
//                SpeechRecognizer.ERROR_NO_MATCH -> "찾을 수 없음"
//                SpeechRecognizer.ERROR_RECOGNIZER_BUSY -> "RECOGNIZER가 바쁨"
//                SpeechRecognizer.ERROR_SERVER -> "서버가 이상함"
//                SpeechRecognizer.ERROR_SPEECH_TIMEOUT -> "말하는 시간초과"
//                else -> "알 수 없는 오류임"
//            }
//            Toast.makeText(getApplicationContext(), "에러가 발생하였습니다. : $message", Toast.LENGTH_SHORT)
//                .show()
//        }
//
//        override fun onResults(results: Bundle) {
//            val matches =
//                results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
//
//            for (i in matches!!.indices) {
//                textView!!.text = matches[i]
//            }
//        }
//
//        override fun onPartialResults(partialResults: Bundle) {}
//
//        override fun onEvent(eventType: Int, params: Bundle) {}
//    }
}