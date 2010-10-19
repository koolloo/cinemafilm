package org.domain.cincin.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class ChoosingCinemaTest extends SeamTest {

	@Test
	public void test_choosingCinema() throws Exception {
		new FacesRequest("/choosingCinema.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{choosingCinema.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{choosingCinema.choosingCinema}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{choosingCinema.value}").equals("seam");
			}
		}.run();
	}
}
