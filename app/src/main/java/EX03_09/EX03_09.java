package EX03_09;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import com.example.myapplicati.R;

public class EX03_09 extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);

}
    public void onclick(View v){
        Intent intent=new Intent();
        intent.setClass(EX03_09.this,EX03_09_1.class);
        startActivity(intent);
        EX03_09.this.finish();
    }
}
