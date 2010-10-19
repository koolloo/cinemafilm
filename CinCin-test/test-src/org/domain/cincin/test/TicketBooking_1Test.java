package org.domain.cincin.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class TicketBooking_1Test extends SeamTest {

	@Test
	public void test_ticketBooking_1() throws Exception {
		new FacesRequest("/ticketBooking_1.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{ticketBooking_1.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{ticketBooking_1.ticketBooking_1}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{ticketBooking_1.value}").equals("seam");
			}
		}.run();
	}
}
