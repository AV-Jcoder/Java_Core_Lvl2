package org.example.part_16_Reflection_API.lesson_92_intro;

public class ReflectionApiExample {

    public static void main(String[] args) {
        User ivan = new User(25L, "Ivan");
        Class<? extends User> userClass = ivan.getClass();
        Class<User> userClass1 = User.class;
        System.out.println(userClass == userClass1);


    }

    private class Test1 {}

    private enum Test2 {
        ONE, TWO
    }

    private static class Test3 {}
}
