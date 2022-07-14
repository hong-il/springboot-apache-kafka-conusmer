package apache.kafka;

import apache.kafka.consumer.Consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApacheKafkaConusmerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApacheKafkaConusmerApplication.class, args);
        Consumer.run();
    }

}
