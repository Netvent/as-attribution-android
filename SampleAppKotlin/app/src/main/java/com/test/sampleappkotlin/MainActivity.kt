package com.test.sampleappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ppsmr.attribution.attributionsdk.AttributionSDK
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Put this initialization call in each onCreate method of initial activities
        AttributionSDK.initialize("aHR0cHM6Ly9wbGF5Lmdvb2dsZS5jb20vc3RvcmUvYXBwcy9kZXRhaWxzP2lkPWNvbS5zaGlidWkub2JsYXN0JmhsPWVufjM3MjZ%2BZmx5LXlvdS1mb29scy1wZDE1NzEyMzAzNzU%3D")
        setContentView(R.layout.activity_main)
    }

    fun onSimpleEventPressed(v: View){
        AttributionSDK.track("Simple Event")
    }

    fun onEventWithDataPressed(v: View){
        val data = JSONObject()
        try {
            data.put("sample_data_int", 1)
            data.put("sample_data_str", "two")
            val arr = JSONArray()
            arr.put("str_data")
            arr.put(3)
            data.put("sample_data_list", arr)
        } catch (ex: JSONException) {}
        AttributionSDK.track("Event With Data", data)
    }
}
