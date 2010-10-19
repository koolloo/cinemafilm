package org.domain.cincin.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class BookTicketTest extends SeamTest {

	@Test
	public void test_bookTicket() throws Exception {
		new FacesRequest("/bookTicket.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{bookTicket.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{bookTicket.bookTicket}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{bookTicket.value}").equals("seam");
			}
		}.run();
	}
}
