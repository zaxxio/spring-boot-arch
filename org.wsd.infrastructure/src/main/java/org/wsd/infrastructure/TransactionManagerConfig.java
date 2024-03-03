package org.wsd.infrastructure;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.transaction.KafkaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.UUID;

@Log4j2
@Configuration
@RequiredArgsConstructor
@EnableTransactionManagement
public class TransactionManagerConfig {


    private final ProducerFactory<UUID, Object> producerFactory;

    @Bean(name = "kafkaTransactionManager")
    public KafkaTransactionManager<UUID, Object> kafkaTransactionManager() {
        return new KafkaTransactionManager<>(producerFactory);
    }

}
