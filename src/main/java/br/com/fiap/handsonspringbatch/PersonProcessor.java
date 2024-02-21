package br.com.fiap.handsonspringbatch;

import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDateTime;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 21/02/2024
 * Project Name: spring-batch
 */

public class PersonProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person item) throws Exception {
        item.setCreateDateTime(LocalDateTime.now());
        return item;
    }
}
