package main.myLessons.homeWork22January;
/*
Дано два числа, например 3 и 56, значение которых хранятся в переменных.
a)Необходимо составить следующие текстовые строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 1683
Используйте метод StringBuilder.append().
b)   Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
c)   Замените символ  слово “равно” на знак “=”. Используйте методы StringBuilder.replace().

 */
public class HWwithBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        int x=3;
        int y=56;
        int sum=x+y,sub=x-y,mul=x*y;
        System.out.println("-----3)a------");
        String StrSub=sub +"";
        String StrMul=mul+"";
        stringBuilder.append(x);
        stringBuilder.append(" + ");
        stringBuilder.append(y);
        stringBuilder.append(" = ");
        stringBuilder.append(sum);
        System.out.println(stringBuilder);
        System.out.println("-----------");
        stringBuilder.replace(2,3,"-");
        stringBuilder.replace(9,11,StrSub);
        System.out.println(stringBuilder);
        System.out.println("-----------");
        stringBuilder.replace(2,3,"*");
        stringBuilder.replace(9,11,StrMul);
        System.out.println(stringBuilder);
        System.out.println("-----3)b------");
        stringBuilder.delete(7,9);
        stringBuilder.insert(7,"равно ");
        System.out.println(stringBuilder);
        System.out.println("-----3)c------");
        stringBuilder.replace(7,12,"=");
        System.out.println(stringBuilder);
    }
}
