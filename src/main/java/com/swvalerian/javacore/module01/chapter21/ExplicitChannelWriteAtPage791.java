package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWriteAtPage791 {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("C:\\BDA\\test.txt"),
                        StandardOpenOption.WRITE, // при таком открытии канала, данные будут записываться из буфера в самое начало файла!
                        StandardOpenOption.CREATE)) // а остальная часть файла не будет затираться или изменяться.
        {
            // получаем размер файла
            long fsize = fileChannel.size();

            // создам буфер в ОЗУ
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            // запишу данные в буфер
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            } // указатель в буфере будет стоять на последнем символе

            // запишу еще 26 случайных букв латиницы в буфер
            for (int i = 0; i < 26; i++) {
                int r = (int) (Math.random() * 26);
                mBuf.put((byte) ('A' + r));
            } // указатель в буфере будет стоять на последнем символе

            mBuf.put((byte) '\n');

            mBuf.rewind(); // обнулим указатель

            //запишем в файл данные из буфера
            fileChannel.write(mBuf); // внимание, записано будет 128 байт, из них тока 52 байта - это то, что я задал, остальное - пусто

        } catch (IOException ex) {
            System.out.println("Ошибка ввода-выода");
        } catch (InvalidPathException exip) {
            System.out.println("ошибка пути к файлу");
        }
    }
}
