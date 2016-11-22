package cn.edu.hdu.lab505.innovation.service;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by hhx on 2016/11/22.
 */
public class UDPTest {


    @Test
    public void send() throws IOException {
        byte[] bytes = {0x7e, 0x00, 0x00, 0x21, 0x58, 0x73,
                0x04, 0x27, 0x28, 0x57, 0x30, 0x00, 0x00, (byte) 0x88, 0x0c, 0x10, (byte) 0xdb, 0x0c, 0x01, 0x00, 0x04, 0x40,
                0x00, 0x44, (byte) 0x90, (byte) 0xdb, 0x0c, 0x02, 0x00, 0x04, (byte) 0xc0, 0x00, 0x44, 0x30, (byte) 0xdb, 0x0c, 0x03, 0x00,
                0x04, 0x00, 0x00, 0x42, 0x38, (byte) 0xdb, 0x0c, 0x04, 0x00, 0x04, 0x00, 0x00, (byte) 0xc2, 0x20, (byte) 0xdb, 0x0c,
                0x05, 0x00, 0x04, 0x03, 0x24, 0x00, 0x00, (byte) 0xdb, 0x0c, 0x06, 0x00, 0x04, 0x00, 0x00, 0x41, (byte) 0xe3,
                (byte) 0xdb, 0x0c, 0x07, 0x00, 0x04, (byte) 0xf7, (byte) 0x9f, 0x44, 0x4d, (byte) 0xdb, 0x0c, 0x08, 0x00, 0x04, 0x0b, (byte) 0x86,
                0x48, 0x4f, (byte) 0xdb, 0x0c, 0x09, 0x00, 0x04, 0x6f, 0x4a, (byte) 0xc8, 0x4e, (byte) 0xdb, 0x0c, 0x0a, 0x00, 0x04,
                0x03, 0x24, 0x00, 0x00, (byte) 0xdb, 0x0c, 0x0b, 0x00, 0x04, 0x00, 0x00, 0x00, 0x00, (byte) 0xdb, 0x0c, 0x0c,
                0x00, 0x04, 0x00, 0x00, 0x00, 0x00, (byte) 0xdb, 0x0c, 0x0d, 0x00, 0x04, 0x00, 0x00, 0x00, 0x00, (byte) 0xdb,
                0x0c, 0x0e, 0x00, 0x01, 0x00, (byte) 0xdb, 0x0c, 0x0f, 0x00, 0x01, 0x00, (byte) 0xdb, 0x0c, 0x10, 0x00, 0x00,
                (byte) 0xb4, 0x7e};
        DatagramSocket socket=new DatagramSocket(8000);
        InetAddress loc = InetAddress.getLocalHost();
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length,loc,6666);
        socket.send(packet);

        socket.close();
    }
}
