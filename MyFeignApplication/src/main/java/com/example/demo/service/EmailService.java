package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.MailRequest;

@FeignClient(name="EmailMicroservice")
public interface EmailService {

	@Transactional
	@PostMapping("/sendotp")
	public ResponseEntity<?> sendEmail(@RequestBody MailRequest request);
	
	@Transactional
	@PostMapping("/otpverified")
	public ResponseEntity<?> resendotp(@RequestBody MailRequest request);
}
