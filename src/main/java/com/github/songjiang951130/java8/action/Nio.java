package com.github.songjiang951130.java8.action;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Nio {

    public void read() throws IOException {
        RandomAccessFile aFile = null;
        try {
            aFile = new RandomAccessFile("README.md", "rw");
            System.out.println(aFile.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(byteBuffer);

        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            byteBuffer.flip();

            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear();
            bytesRead = inChannel.read(byteBuffer);
        }
        System.out.println("out");
        try {
            aFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Nio nio = new Nio();
        nio.read();
    }
}
