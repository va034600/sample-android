package eu.sample.android;

import javax.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends RoboActivity {
	@InjectView(R.id.detail_button)
	Button myButton;
	@Inject
	SampleService sampleService;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		myButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String message = "hello2," + sampleService.getMessage();
				Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
