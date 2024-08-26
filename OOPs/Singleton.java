public class Singleton {

    // Private static variable that holds the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public static method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Synchronized block to handle multi-threaded scenarios
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Other methods of the class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
