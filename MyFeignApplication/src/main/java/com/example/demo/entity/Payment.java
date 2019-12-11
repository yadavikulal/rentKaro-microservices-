package com.example.demo.entity;

import java.util.Date;



import com.example.demo.util.PaymentMode;
import com.example.demo.util.PaymentStatus;




public class Payment {

    
    private int id;
   
    private String email;
    
    private String name;
   
    private String phone;
    
    private String productInfo;
   
    private Double amount;
   
    private PaymentStatus paymentStatus;
   
    private Date paymentDate;
    
    private String txnId;
    
    private String mihpayId;
    
    private PaymentMode mode;
    
}