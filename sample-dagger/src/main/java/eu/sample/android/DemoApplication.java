package eu.sample.android;

import java.util.Arrays;
import java.util.List;

import android.app.Application;
import dagger.ObjectGraph;

public class DemoApplication extends Application {
	private ObjectGraph objectGraph;

	@Override
	public void onCreate() {
		super.onCreate();

		this.objectGraph = ObjectGraph.create(getModules().toArray());
	}

	protected List<Object> getModules() {
		return Arrays.<Object> asList(new SampleModule(this));
	}

	public void inject(Object object) {
		this.objectGraph.inject(object);
	}
}
