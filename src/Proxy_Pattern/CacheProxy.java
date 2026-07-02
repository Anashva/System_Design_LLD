package Proxy_Pattern;

import java.util.HashMap;

public class CacheProxy implements UserServices{
    private UserServices services;
    private HashMap<String,String> cache=new HashMap<>();
    public CacheProxy(UserServices services){
        this.services=services;
    }

    @Override
    public void getUser(String userId) {
        if(cache.containsKey(userId)){
            System.out.println("Returing user from cache");
            System.out.println(cache.get(userId));
            return;
        }
        services.getUser(userId);
        cache.put(userId, "Cached User : " + userId);
    }
}
