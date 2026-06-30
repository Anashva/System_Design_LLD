package Singleton_Pattern;

public class Bill_Pugh {
    private Bill_Pugh() {}

    private static class Holder {

        private static final Bill_Pugh INSTANCE =
                new Bill_Pugh();
    }

    public static Bill_Pugh getInstance() {
        return Holder.INSTANCE;
    }
}
