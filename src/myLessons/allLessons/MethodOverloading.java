package myLessons.allLessons;

public class MethodOverloading {
    void show (int i1){
        System.out.println(i1);
    }
    void show (boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }
    void show(String s,int a){
        System.out.println("String: "+ s + "Int: "+ a);
    }
}
class Overloading2{
    int sum(int i1,int i2){
    return i1+i2;
        }
        String sum(String s1,String s2){
        return s1+s2;
        }

}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO=new MethodOverloading();
        int a=500;
        mO.show(a);
        mO.show(true);
        mO.show("Hello");
        mO.show("parametr String"+" dalee int "+ 14);
        Overloading2 oV =new Overloading2();
        int a1=oV.sum(52,48);
        System.out.println(a1);
        String s= oV.sum("Я стану программистом,", "чего бы это не стоило");
        System.out.println(s);
     }
}