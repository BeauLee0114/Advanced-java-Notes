package socket.socket01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try(ServerSocket server = new ServerSocket(8080)){
            System.out.println("等待客户链接...");
            Socket socket = server.accept();
            System.out.println("客户端已链接，IP地址为："+socket.getInetAddress().getHostAddress());
            System.out.println(socket.getInetAddress().getHostName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
