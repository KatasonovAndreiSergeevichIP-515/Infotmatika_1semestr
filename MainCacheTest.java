public class MainCacheTest {
    public static void main(String[] args) {
        Cache<String> stringCache = new Cache<>(3);

        stringCache.add("A");
        stringCache.add("B");
        stringCache.add("C");
        System.out.println("Первый: " + stringCache.getFirst());
        System.out.println("Последний: " + stringCache.getLast());

        stringCache.add("D");
        System.out.println("После добавления D, первый: " + stringCache.getFirst());

        System.out.println("Существует C? " + stringCache.exists("C"));
        System.out.println("Удаляем B: " + stringCache.remove("B"));
        System.out.println("Существует B? " + stringCache.exists("B"));

        System.out.println("Элемент по индексу 1: " + stringCache.getItemByIndex(1));

        Cache<Integer> intCache = new Cache<>(2);
        intCache.add(10);
        intCache.add(20);
        intCache.add(30);
        System.out.println("Первый int: " + intCache.getFirst());
        System.out.println("Последний int: " + intCache.getLast());
        System.out.println("Существует 20? " + intCache.exists(20));
        System.out.println("Удаляем 20: " + intCache.remove(20));
        System.out.println("Существует 20? " + intCache.exists(20));
    }
}
