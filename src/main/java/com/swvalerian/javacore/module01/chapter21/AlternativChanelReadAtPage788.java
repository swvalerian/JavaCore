package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AlternativChanelReadAtPage788 {
    public static void main(String[] args) {
        int count;
        int charCount;
        Path filepath = null;

        // получаем путь к файлу
        try {
            filepath = Paths.get("C:\\BDA\\log.txt");
        } catch (InvalidPathException ex) {
            System.out.println("Ты выбрал неверный путь! - > " + ex);
            return; // завершим программу
        }

        // .hasremaining() - использовать этот метод, для проверки, есть ли что еще в буфере, для чтения!?
        //
        // создал массив, в качестве оболочки для буфера
        byte[] b = new byte[128];

        char[] charArray = new char[128];

        CharBuffer charBuffer = CharBuffer.wrap(charArray);

        ByteBuffer byteBuffer = ByteBuffer.wrap(b); // загнали буфер в обертку массива (заключили буфер в оболочку массива)
        // поравка - скорее наоборот. Массив загнали в обертку - в буфер.

        try ( SeekableByteChannel byteChannel = Files.newByteChannel(filepath);
              ) {
            do {

                // charCount = byteChannel.(charBuffer); // эксперимент, пытался сразу читать в чар буфер, чтоб потом не преобразовывать
                // не довел до конца, т.к. времени небыло, надо было учиться дальше...
                count = byteChannel.read(byteBuffer); // записали данные в буфер из канала связанного с файлом.
                // byteChannel.write(byteBuffer); // эта операция запишет информацию из буфера (аргумент) в файл (связан с каналом)

//                отладочная информация
                System.out.println("\n>" + count + "^" + byteBuffer.hasRemaining());
                System.out.println(byteBuffer.toString());

                byteBuffer.rewind();
                System.out.println("\n------------==========1=======--------------");
//                отладочная информация
                System.out.println(">" + count + "^" + byteBuffer.hasRemaining());
                System.out.println(byteBuffer.toString());

                // в этой программе использовал алгоритм на другом принципе - использовал метод .hasremaining из класса ByteBuffer
                while (byteBuffer.hasRemaining() && count !=-1) { // ладно, знаю как передалть алгоритм чтоб работал корректно, просто перечислять по count
                    System.out.print((char) + byteBuffer.get()); // здесь в последнем проходе, напечатается остаток от предыдущего буфера
                    // т.к. мы буфер не очищаем, а лишь переносим указатель. Если буду очищать буфер, тогда все отлично будет!
                }

                // без обнуления указателя буфера - будет считыdаться только первые 128байт и программа на этом завершиться
                // и программа зациклиться, т.к. в счетчике будет при первом проходе 128, а в последующие разы 0

                byteBuffer.rewind(); // ладно, знаю как передалть алгоритм чтоб работал корректно, просто перечислять по count

                System.out.println("\n------------=========2========--------------");

            } while (count != -1);

        } catch (IOException ex) {
            System.out.println("error!!!!!!!!!");
        }

    }
}
