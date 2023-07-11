package Topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.junit.jupiter.api.Test;
import utils.RabbitMQUtils;

import java.io.IOException;

public class Publisher {
    @Test
        public void topicPublish() throws IOException {
            Connection connection = RabbitMQUtils.getConnection();
            Channel channel = connection.createChannel();
            //生命交换机和交换机类型 topic 使用动态路由(通配符方式)
            channel.exchangeDeclare("topics","topic");
            String routekey = "user.save";//动态路由key
//发布消息
            channel.basicPublish("topics",routekey,null,("这是路由中的动态订阅模型,route key: ["+routekey+"]").getBytes());
        }
}
