package sg.edu.np.mad.week2pracmadnathan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;   

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser =  new User();
        myUser.setFollowed(false);

        Button myfollowbutton = findViewById(R.id.FollowButton);
        myfollowbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean bool = myUser.getFollowed();
                bool = !bool;
                myUser.setFollowed(bool);
                Log.v(TAG, "on Destroy....");
                if (myUser.getFollowed() == Boolean.FALSE){
                    myfollowbutton.setText("Follow");
                }
                else {
                    myfollowbutton.setText("Unfollow");
                }
                Log.v(TAG, "on Destroy....");
                }
        });

    }

}