package org.supan.webflux.dao;

import org.springframework.stereotype.Component;
import org.supan.webflux.dto.Customer;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Dao ct as a publisher, Browser act as a subscriber
@Component
public class CustomerDao {

    public List<Customer> getCustomers() {
        return IntStream.rangeClosed(1, 50)
                .peek(CustomerDao::sleepExecution)
                .peek(i -> System.out.println("normal processing count : " + i))
                .mapToObj(i -> new Customer(i, "customer " + i))
                .collect(Collectors.toList());
    }

    public Flux<Customer> getCustomersStream() {
        return Flux.range(1, 10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("flux processing count : " + i))
                .map(i -> new Customer(i, "customer " + i));
    }

    public Flux<Customer> getCustomerList() {
        return Flux.range(1, 50)
                .doOnNext(i -> System.out.println("flux processing count without delay : " + i))
                .map(i -> new Customer(i, "customer " + i));
    }

    private static void sleepExecution(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
