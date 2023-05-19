package socket.socket01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
    public static void main(String[] args) {
    try(Socket socket = new Socket("localhost",8080)){
        System.out.println("已经连接到服务器");
    } catch (UnknownHostException e) {
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("服务器连接失败");
        e.printStackTrace();
    }
    }
}
