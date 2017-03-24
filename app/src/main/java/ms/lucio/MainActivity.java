package ms.lucio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onViewClick(View v){
        if(v.getId() == R.id.download){
            startActivity(DownloadSampleActivity.class);
        }
    }

    void startActivity(Class cls){
        Intent it = new Intent(this,cls);
        startActivity(it);
    }
}
