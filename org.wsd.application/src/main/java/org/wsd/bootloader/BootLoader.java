package org.wsd.bootloader;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.UUID;

@Configuration
@RequiredArgsConstructor
public class BootLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
}
