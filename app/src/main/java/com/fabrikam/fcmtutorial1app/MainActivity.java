package com.fabrikam.fcmtutorial1app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.windowsazure.messaging.notificationhubs.NotificationHub;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotificationHub.setListener(new CustomNotificationListener());
        NotificationHub.start(this.getApplication(), "Hub Name", "Connection String");

    }
}
