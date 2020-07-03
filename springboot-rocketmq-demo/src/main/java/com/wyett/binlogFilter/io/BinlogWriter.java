package com.wyett.binlogFilter.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/2 12:44
 * @description: TODO
 */

public class BinlogWriter {

    private static String fileName = "F:/tmp/rediscluster_insert.txt";

    public static void writeWithFileChannel(String msg) throws IOException {
        RandomAccessFile stream = new RandomAccessFile(fileName, "rw");
        FileChannel channel = stream.getChannel();

        long point = stream.length();
        stream.seek(point);

        byte[] strBytes = (msg +"\n").getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
        buffer.put(strBytes);
        buffer.flip();
        channel.write(buffer, point);

        stream.close();
        channel.close();

    }
}
