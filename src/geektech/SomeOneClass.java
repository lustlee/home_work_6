package geektech;

public class SomeOneClass <T extends Number> implements SomeOneInterface<T> {
        private final T id;

//    public void setId(T id) {
//        this.id = id;
//    }
    // Тут вопрос есть! а почему он просит сделать его FINAL???
    // Я могу сделать его "setter" ??? или как решить эту данную, типа проблему?
    // Потому как и без этого работает всё норм =)

    public SomeOneClass(T id){
            this.id=id;
        }

        public T getId() {
            return id;
        }
}
