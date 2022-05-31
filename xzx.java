
public class MainActivity extends AppCompatActivity {
    public static final String TAG = FCMService.TAG;
    //............Do something

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
