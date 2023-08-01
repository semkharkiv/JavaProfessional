package exampleJavaPro._03_06_2023;

import methods.Methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SampleExercise { /*
    1) создать новый объект
    2) получить имя конструктора
    3)получить публичные методы класса
    4) создать объект из метода2 и запустить его
    5) создать объект из поля s и заменить его значение на "группа 48m"
    6) создать объект из методов 1 и 3 и их запустить
     */
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Sample sample = new Sample();

        Class aClass = sample.getClass();
        System.out.println(aClass.getName());

        Constructor constructor = aClass.getDeclaredConstructor();
        String constructorName = constructor.getName();
        System.out.println(constructorName);

        Method[] methods = Sample.class.getMethods();
        for (Method method : methods){
            System.out.println(method);

        }

        Field field = Sample.class.getDeclaredField("s");
        field.setAccessible(true);
        field.set(sample,"java 48m");

        Method method1 = aClass.getDeclaredMethod("method1");
        method1.invoke(sample);

        Method method2 = aClass.getMethod("method2", int.class);
        method2.invoke(sample,21);


        Method method3 = aClass.getDeclaredMethod("method3");
        method3.setAccessible(true);
        method3.invoke(sample);

    }
}
