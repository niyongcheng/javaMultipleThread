package singleton;

public final class Singleton {
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(instance != null){
            return instance;
        }
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
