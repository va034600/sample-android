package eu.sample.android;

import javax.inject.Inject;

public class SampleServiceImpl implements SampleService {
	@Inject
	SampleDao sampleDao;

	public String getMessage() {
		return "aaa";
	}

	public String getMessage2() {
		return this.sampleDao.getMessage2();
	}
}
