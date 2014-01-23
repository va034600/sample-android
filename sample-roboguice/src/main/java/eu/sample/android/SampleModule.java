package eu.sample.android;

import com.google.inject.AbstractModule;

public class SampleModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(SampleService.class).to(SampleServiceImpl.class);
	}
}
