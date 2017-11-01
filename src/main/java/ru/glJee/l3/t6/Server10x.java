package ru.glJee.l3.t6;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server10x {
    public static void main(String[] args) throws Exception {
//        NameService nameService=new DNSNameService();
//        InetAddress[] addresses=nameService.lookupAllHostAddr("yandex.ru");
//
//        for (InetAddress address:addresses){
//            System.out.println(address);
//            System.out.println(" "+nameService.getHostByAddr(address.getAddress()));
//        }

        ServerSocket serverSocket=new ServerSocket(81);

        while (true){
            System.out.println("....");
            Socket socket=serverSocket.accept();
            System.out.println("get one");

            try (InputStream is = socket.getInputStream();
                 OutputStream os=socket.getOutputStream()){
                //read request
//                byte[] request= HttpUtils.readR

            }finally {
                     socket.close();
            }
        }
    }
}
