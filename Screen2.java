package decision.maker;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class Screen2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText(getIntent().getExtras().getString((Math.random()>0.5)?"firstevent":"secondevent"));
        
    }
public void goBack(View view){
	Intent intent3 = new Intent(this, Screen1.class);
	startActivity(intent3);
	
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_screen2, menu);
        return true;
    }
}
