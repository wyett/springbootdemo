package com.wyett.snstllistconsumer.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/2 12:23
 * @description: TODO
 */

public class OutputFile {

    private static File file;

    static {
        file = new File("f:/tmp", "sns_tllist_0_binlog.txt");
        if (!file.exists()) {
            try {
                if (file.exists())
                    file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFile(String info) throws IOException {
        byte bt[] = new byte[1024];
        bt = info.getBytes();
        FileOutputStream in = new FileOutputStream(file);
        in.write(bt, 0, bt.length);

        in.close();
    }
}
