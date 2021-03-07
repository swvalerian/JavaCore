package com.swvalerian.javacore.module01.chapter10;

public class AtPage275Throws {
            public static void throwOne() throws IllegalAccessException, NullPointerException
                {
                    System.out.println("Пишу из тела метода throwOne()");
                    // int i = 5/0;
                    // до генерация нижнего исключения дело не дойдет, если убрать комменты
                    throw new IllegalAccessException("я новый Exception");
                    //System.out.println("А до меня дело нет никому ( ");
                }


            public static void main(String[] args) {

                try {
                    throwOne();
                } catch (IllegalAccessException e) {
                    System.out.println("Перехвачено исключение: " + e);
                } catch (ArithmeticException e) {
                    System.out.println(e.getStackTrace());
                }

            }
}
