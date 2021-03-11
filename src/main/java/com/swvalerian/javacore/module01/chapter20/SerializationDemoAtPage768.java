package com.swvalerian.javacore.module01.chapter20;

import java.io.*;

public class SerializationDemoAtPage768 {
    public static void main(String[] args) {


        String dirName = "C:\\BDA\\";
        File dir = new File(dirName);

        FileOutputStream fout1 = null;

        try {
            fout1 = new FileOutputStream(dirName + "serial.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(fout1)) {
            MyClass ob1 = new MyClass("Ку-Ку", 44, 177.04);
            System.out.println("Object1: " + ob1);

            oos.writeObject(ob1); // записали обьект в файл!
        } catch (FileNotFoundException fnf) {
            System.out.println("ошибка - файл не найден!");
        } catch (IOException ex) {
            System.out.println("ошибка" + ex.getMessage());
        }

        // произведем десерриализацию обьекта (ну пока я это понимаю как сохранили и прочитали -получили обьект)
        // что характерно, присваеваемый фал - не стирается! ну это и логично по сути своей
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dirName + "serial.txt"))) {
            MyClass ob2forRead = (MyClass) ois.readObject(); // обратить внимание - как все просто!
            System.out.println("Object2: " + ob2forRead);

        } catch (FileNotFoundException fnf) {
            System.out.println("ошибка - файл не найден!");
        } catch (Exception ex) {
            System.out.println("ошибка" + ex.getMessage());
        }
    }
}

class MyClass implements Serializable {
    transient String s; // обьявили transient - по итогу эта переменная не сохраняется! так то!
    private int i; // привает - пофиг, сохраняется в файле. для последующей десиреализациии
    Double d;

    MyClass(String s,int i,Double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}