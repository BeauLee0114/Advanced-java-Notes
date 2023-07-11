package helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import utils.RabbitMQUtils;


import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {
    @Test
    public void testSendMessage() throws IOException, TimeoutException {
        Connection connection = RabbitMQUtils.getConnection();
        Channel channel = connection.createChannel();



        channel.queueDeclare("hello",false,false,false,null);

        channel.basicPublish("","hello",null,"hello rabbitmq".getBytes());

        channel.close();
        connection.close();
    }
}
