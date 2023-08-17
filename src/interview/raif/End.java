package interview.raif;

/**
 * @author Andrei Karabaev
 */
public class End {
    public static void main(String[] args) {
        MyCustomConsumer<String> a = str -> System.out.println("First " + str);
        MyCustomConsumer<String> then = a.then(s -> System.out.println("Second " + s));
        MyCustomConsumer<String> then1 = then.then(s -> System.out.println("Third " + s));
        then1.consume("Hello");
    }



    @FunctionalInterface
    private interface MyCustomConsumer<T>{
        void consume(String text);

        default MyCustomConsumer<T> then(MyCustomConsumer<T> consumer){
            return (String text) -> {
                consume(text);
                consumer.consume(text);
            };
        }
    }
}
//
// First Hello
// Second Hello
// Third Hello