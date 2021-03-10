package com.swvalerian.javacore.module01.chapter20;

import java.io.*;

public class DataInputOutputDemoAtPage748 {
    public static void main(String[] args) {
        FileOutputStream f = null;
        String pathname = "c:\\BDA\\newfile.dat";
        File file = new File(pathname);

        try {
            f = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        // запишем данные в файл
        try (DataOutputStream dataf = new DataOutputStream(f)) {
            dataf.writeDouble(44.44);
            dataf.writeBoolean(true);
            dataf.writeInt(150);
        } catch (FileNotFoundException exfnf) {
            System.out.println(exfnf.getMessage());
        } catch (IOException ex) {
            System.out.println("ошибка ввода - вывода");
        }

        // прочитаем данные из файла, и выведем их в консоль
        try (DataInputStream din = new DataInputStream(new FileInputStream(file))) {
            Double d = din.readDouble();
            boolean b = din.readBoolean();
            Integer i = din.readInt();


            System.out.println(d + " : " + b + " : " + i);
        } catch (FileNotFoundException fnf) {
            System.out.println("файл не найден");
        } catch (IOException ex) {
            System.out.println("ошибка ввода-вывода");
        }
    }
}
