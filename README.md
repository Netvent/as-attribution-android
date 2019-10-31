# AppSamurai Attribution SDK
[![alt text](https://appsamurai.com/wp-content/uploads/2018/10/as_dark_logotype-8.png "AppSamurai")](https://www.appsamurai.com)

## Getting Started
The AppSamurai Attribution SDK is available via:

**JCenter AAR**
    [ ![Download](https://api.bintray.com/packages/appsamurai/maven/attribution/images/download.svg) ](https://bintray.com/appsamurai/maven/attribution/_latestVersion)
    The AppSamurai Attribution SDK is available as an AAR via JCenter; to use it, add the following to your `build.gradle`.

   ``` java
   repositories {
       jcenter() // includes the AppSamurai Attribution SDK
   }

   dependencies {
       // Be sure that you are using latest version
       implementation 'com.ppsmr.attribution.attributionsdk:attribution:<latest-version>'
   }
   ```

## Supported SDK Versions
Minimum supported SDK version is 14. Be sure that minSdkVersion in your gradle file isn't lower than 14.

## Usage
You can check sample applications in the repository to see the examples of how to integrate and use the SDK.

### SDK Import
**Kotlin Users**
```kotlin
import com.ppsmr.attribution.attributionsdk.AttributionSDK
```

**Java Users**
```java
import com.ppsmr.attribution.attributionsdk.AttributionSDK;
```

### SDK Initialization
AppSamurai Attribution SDK is required for tracking. Application cannot track any information before SDK initialization is complete.
In application’s `onCreate` method of the initial activity, call  `AttributionSDK.initialize` function with `applicationId` parameter. This parameter should be your application id from [AppSamurai User Dashboard](https://www.appsamurai.com), you can use your application id for integration purposes. Be sure to call this initialization in each `onCreate` method of initial activities. Check the following codes for sample:

**Kotlin Users**
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    AttributionSDK.initialize("your-user-id")
}
```

**Java Users**
```java
@Override
protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AttributionSDK.Instance.initialize("your-user-id");
}
```

### Custom Event Tracking
Using AppSamurai Attribution SDK, you are able to track the frequency of custom events by placing the following code piece into your own application code. You can also attach data to your events. Only JSONObject is accepted as data. If you are planning to put an object as a value in JSONObject, make sure the object is JSON serializable.

**Kotlin Users**
```kotlin
AttributionSDK.track(eventName: String)
AttributionSDK.track(eventName: String, data: JSONObject)
```

**Java Users**
```java
AttributionSDK.Instance.track(String eventName);
AttributionSDK.Instance.track(String eventName, JSONObject data);
```

### Log Level
AppSamurai Attribution SDK logging level can be changed with `setLogLevel` after  `AttributionSDK.initialize` call. Default is <ASLog.Level.DEBUG>.

**Kotlin Users**
```kotlin
AttributionSDK.setLogLevel(<ASLog.Level>)
```

**Java Users**
```java
AttributionSDK.Instance.setLogLevel(<ASLog.Level>);
```

## Author
App Samurai Mobile Team, mobile@appsamurai.com
## License
Copyright 2018 App Samurai Inc.
[![alt text](https://appsamurai.com/wp-content/uploads/2014/12/web_home_cta_2.png "AppSamurai")](https://www.appsamurai.com)
