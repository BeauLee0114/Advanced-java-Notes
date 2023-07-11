package route;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import utils.RabbitMQUtils;

import java.io.IOException;

public class Publisher {
    public void Routing() throws IOException {
        Connection connection = RabbitMQUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare("log_direct","direct");
        String key = "";
    //     发布消息
        channel.basicPublish("log_direct",key,null,("指定的route key"+key+"的消息").getBytes());

    }
}
