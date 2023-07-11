package fanout;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.junit.jupiter.api.Test;
import utils.RabbitMQUtils;

import java.io.IOException;

public class Publisher {
    @Test
    public void testFanout() throws IOException {
        Connection connection = RabbitMQUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare("logs","fanout");
        channel.basicPublish("logs","",null,"hello".getBytes());
    }
}
