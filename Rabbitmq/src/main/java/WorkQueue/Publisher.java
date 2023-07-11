package WorkQueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;
import org.junit.jupiter.api.Test;
import utils.RabbitMQUtils;

import java.io.IOException;

public class Publisher {
    @Test
    public void testWorkQueue() throws IOException {
        Connection connection = RabbitMQUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("work",true,false,false,null);

        for (int i = 0; i <10; i++) {
            // for循环发送消息
            channel.basicPublish("","work", null,(i+"hello work queue").getBytes());
        }

    //关闭资源
        RabbitMQUtils.closeConnectionAndChanel(channel,connection);
    }

}
