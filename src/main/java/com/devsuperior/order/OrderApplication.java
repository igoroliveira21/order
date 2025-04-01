package com.devsuperior.order;

import com.devsuperior.order.entities.Order;
import com.devsuperior.order.services.CalcValueAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	private final CalcValueAll calcValueAll;

	@Autowired
    public OrderApplication(CalcValueAll calcValueAll) {
        this.calcValueAll = calcValueAll;
    }

    public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1, 150.0, 20.0);
		String resultado1 = calcValueAll.calcularValorTotal(order1);
		System.out.println(resultado1);

		Order order2 = new Order(2, 800.0, 10.0);
		String resultado2 = calcValueAll.calcularValorTotal(order2);
		System.out.println(resultado2);

		Order order3 = new Order(3, 95.90, 0.0);
		String reusltado3 = calcValueAll.calcularValorTotal(order3);
		System.out.println(reusltado3);
	}
}
