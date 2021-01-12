package geektech;

public class Main {

    public static void main(String[] args) {

        //Создать обобщенный класс и обобщенный интерфейс и реализовать этот интерфейс классом.
        // Ограничить параметры типов классом Number.
        // В главном классе создать несколько экземпляров обобщенного класса.

        SomeOneClass<Integer> someOneClass = new SomeOneClass<>(1);
        SomeOneClass<Integer> someOneClass2 = new SomeOneClass<>(2);
        SomeOneClass<Integer> someOneClass3 = new SomeOneClass<>(3);
        SomeOneClass<Integer> someOneClass4 = new SomeOneClass<>(4);
        SomeOneClass<Integer> someOneClass5 = new SomeOneClass<>(5);

        System.out.println(someOneClass.getId());
        System.out.println(someOneClass2.getId());
        System.out.println(someOneClass3.getId());
        System.out.println(someOneClass4.getId());
        System.out.println(someOneClass5.getId());

    }
}
