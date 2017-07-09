package co.uk.spring.boot.task.two.invoice.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Random;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	@RequestMapping(value = "/create/{orderId}", method = GET, produces = APPLICATION_JSON_VALUE)
	public String createInvoice(@PathVariable Integer orderId) {
		Random rnd = new Random();
		return "{\"invoiceId\":\"" + rnd.nextInt(5000) + "\"," + "\"orderId\":\"" + orderId + "\"}";
	}
}
