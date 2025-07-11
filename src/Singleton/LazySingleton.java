package Singleton;

class LazySingleton {
    // The single instance, initially will be null
    private static LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton() {}

    // Public method to return the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            // If instance is null, create a new instance
            instance = new LazySingleton();
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
}
