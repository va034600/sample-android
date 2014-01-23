package eu.sample.android;

import javax.inject.Inject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	@Inject
	SampleService sampleService;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		((DemoApplication) getApplication()).inject(this);

		Button myButton = (Button) findViewById(R.id.detail_button);
		myButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String message = "hello1," + sampleService.getMessage();
				Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

				String message2 = "hello2," + sampleService.getMessage2();
				Toast.makeText(MainActivity.this, message2, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
