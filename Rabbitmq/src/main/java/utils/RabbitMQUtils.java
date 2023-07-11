package utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQUtils {
    private static ConnectionFactory connectionFactory;

    static{
        connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("192.168.0.199");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/Study");
        connectionFactory.setUsername("bobo");
        connectionFactory.setPassword("bobo");
    }
    public static Connection getConnection(){

        try {
            return connectionFactory.newConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnectionAndChanel(Channel channel,Connection connection){
        try {
            if (channel!=null) channel.close();
            if (connection!=null) connection.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
