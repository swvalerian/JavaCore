package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


// создаем специальную версию класса SimpleFileVisitor
// в которой переопределяется метод visitFile
class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrib) throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE; // продолжать обход каталогов
    }
}
public class DirTreeListAtPage804 {
    public static void main(String[] args) {
        String dirName = "C:\\BDA";

        System.out.println("Дерево каталогов, начиная с каталога" + dirName +
                "\n");

        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
