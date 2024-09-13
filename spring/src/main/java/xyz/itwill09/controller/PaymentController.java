package xyz.itwill09.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import xyz.itwill09.dto.Payment;
import xyz.itwill09.service.PaymentService;

@Controller
@RequestMapping("/pay")
@RequiredArgsConstructor
public class PaymentController {
	private final PaymentService paymentService;
	
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String pay() {
		return "pay";
	}
	
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	@ResponseBody
	public String pay(@RequestBody Payment payment, HttpSession session) {
		//결제 관련 OpenAPI를 이용하기 전에 결제 금액 검증을 위해
		session.setAttribute(payment.getMerchantUid(), payment.getAmount());
		return "ok";
	}
	
	@RequestMapping(value = "/copmplate", method = RequestMethod.POST)
	@ResponseBody
	public String complate(@RequestBody Payment payment, HttpSession session) {
		
		String accessToken=paymentService.getAccessToken();
		
		Payment returnPayment=paymentService.getPayment(accessToken, payment.getImpUid());
		
		Long beforeAmount=(Long)session.getAttribute(payment.getMerchantUid());
		session.removeAttribute(payment.getMerchantUid());
		
		Long amount = returnPayment.getAmount();
		
		if(beforeAmount == amount) {
			paymentService.addPayment(returnPayment);
			return "success";
		} else {
			paymentService.cancelPayment(accessToken, returnPayment);
			return "forgery";
		}
		
	}
}
