
package com.example.twapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    private Button btn_WristbandLock;
    private Button btn_CurrentLocation;
    //............Do something
        btn_WristbandLock = findViewById(R.id.btn_WristbandLock);
        btn_CurrentLocation = findViewById(R.id.btn_CurrentLocation);
    
        btn_WristbandLock.setOnClickListener(new View.OnClickListener(){
            int flag = 0;
            public void onClick(View v){
                switch(flag){
                    case 0:
                        btn_WristbandLock.setActivated(false);
                        flag = 1;
                        break;
                    case 1:
                        btn_WristbandLock.setActivated(true);
                        flag = 0 ;
                        break;
                }
            }
        });

        btn_CurrentLocation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    
        //............Do something
    }
}
