package com.example.hrpayroll.resources;

import com.example.hrpayroll.entities.Payment;
import com.example.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping("/{workedId}/days/{days}")
    @ResponseStatus(HttpStatus.OK)
    public Payment find(@PathVariable Long workedId, @PathVariable Integer days) {
        return service.getPayment( workedId, days);
    }
}
