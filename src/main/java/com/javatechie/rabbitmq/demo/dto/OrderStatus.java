package com.javatechie.rabbitmq.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderStatus {

    private Order order;
    private String status;//progress,completed
    private String message;
}
