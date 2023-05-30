package com.jossdarky.abstractclass.controller;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jossdarky.abstractclass.service.IPaymentService;

@Controller
public class ConsoleControllerImpl implements IConsoleController {

	@Autowired
	private IPaymentService paymentService;

	private final Logger LOG = LoggerFactory.getLogger(ConsoleControllerImpl.class);

	public void process() {
		LOG.info("\n\nWELCOME, Select an option:\n\n1.Pay with PayUx\n2.Pay with PayPol\n0.Exit");
		try (Scanner scanner = new Scanner(System.in)) {
			String line = "";
			while (!line.equals("0")) {
				line = scanner.nextLine();
				switch (line) {
					case "0":
						LOG.info("Bye bye!");
						break;
					case "1":
					paymentService.processPayment("PayUx");
						break;
					case "2":
					paymentService.processPayment("PayPol");
						break;
					default:
						LOG.error("Command not valid");
				}

			}
		}
	}

}
