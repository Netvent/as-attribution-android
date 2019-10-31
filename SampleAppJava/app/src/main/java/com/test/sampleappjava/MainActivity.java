package com.test.sampleappjava;

import androidx.appcompat.app.AppCompatActivity;
import com.ppsmr.attribution.attributionsdk.AttributionSDK;
import android.os.Bundle;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Put this initialization call in each onCreate method of initial activities
        AttributionSDK.Instance.initialize("aHR0cHM6Ly9wbGF5Lmdvb2dsZS5jb20vc3RvcmUvYXBwcy9kZXRhaWxzP2lkPWNvbS5zaGlidWkub2JsYXN0JmhsPWVufjM3MjZ%2BZmx5LXlvdS1mb29scy1wZDE1NzEyMzAzNzU%3D");
        setContentView(R.layout.activity_main);
    }

    public void onSimpleEventPressed(View v) {
        AttributionSDK.Instance.track("Simple Event");
    }

    public void onEventWithDataPressed(View v) {
        JSONObject data = new JSONObject();
        try {
            data.put("sample_data_int", 1);
            data.put("sample_data_str", "two");
            JSONArray arr = new JSONArray();
            arr.put("str_data");
            arr.put(3);
            data.put("sample_data_list", arr);
        } catch (JSONException ex){}
        AttributionSDK.Instance.track("Event With Data", data);
    }
}
