package eu.sample.android;

import dagger.Module;
import dagger.Provides;

@Module(injects = { MainActivity.class, SampleServiceImpl.class, SampleDao.class })
public class SampleModule {
	private DemoApplication application;

	public SampleModule(DemoApplication application) {
		this.application = application;
	}

	@Provides
	SampleService provideSampleService() {
		SampleService sampleService = new SampleServiceImpl();
		application.inject(sampleService);
		return sampleService;
	}

	@Provides
	SampleDao provideSampleDao() {
		return new SampleDaoImpl();
	}
}
