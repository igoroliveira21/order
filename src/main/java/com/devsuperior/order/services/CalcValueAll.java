package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class CalcValueAll {

    public String calcularValorTotal(Order order) {
        double desconto = order.getBasicValue() * order.getDiscount();
        double valorComDesconto = order.getBasicValue() - desconto;
        double frete;

        if (valorComDesconto < 100) {
            frete = 20;
        } else if (valorComDesconto < 200) {
            frete = 12;
        } else {
            frete = 0.00;
        }

        return "Pedido código: " + order.getCode() + "\nValor total: " + (valorComDesconto + frete);
    }
}
