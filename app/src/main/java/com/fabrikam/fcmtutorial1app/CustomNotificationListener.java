package com.fabrikam.fcmtutorial1app;

import java.util.Map;
import android.util.Log;
import android.content.Context;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.RemoteMessage.Notification;
import com.microsoft.windowsazure.messaging.notificationhubs.NotificationListener;

public class CustomNotificationListener implements NotificationListener {
    @Override
    public void onPushNotificationReceived(Context context, RemoteMessage message) {
        String TAG = "onPushNotificationReceived";

        /* The following notification properties are available. */
        Notification notification = message.getNotification();
        String title = notification.getTitle();
        String body = notification.getBody();
        Map<String, String> data = message.getData();

        if (message != null) {
            Log.d(TAG, "Message Notification Title: " + title);
            Log.d(TAG, "Message Notification Body: " + message);
        }

        if (data != null) {
            for (Map.Entry<String, String> entry : data.entrySet()) {
                Log.d(TAG, "key, " + entry.getKey() + " value " + entry.getValue());
            }
        }
    }
}
