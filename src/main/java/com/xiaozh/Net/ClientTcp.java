package com.xiaozh.Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        Socket client = new Socket("127.0.0.1", 6666);  //客户端
        // 2.通过Scoket,获取输出流对象
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("hello".getBytes());
// ==============解析回写=========================
        // 4. 通过Scoket,获取 输入流对象

        InputStream in = client.getInputStream();
        // 5. 读取数据数据
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes));
        // 6. 关闭资源 .
        in.close();
        os.close();
        client.close();
    }
}
