package decision.maker;



import android.os.Bundle;
//import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Screen1 extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        
        final  EditText et = (EditText)findViewById(R.id.editText2);
        final  EditText et1 = (EditText)findViewById(R.id.EditText01);
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(Screen1.this, Screen2.class);
				intent.putExtra("firstevent", et.getText().toString());
				intent.putExtra("secondevent", et1.getText().toString());
				startActivity(intent);
				
					
			}
			
		});
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_screen1, menu);
        return true;
    }
}
