package singletonWzorzec.numberGeneratorWithSingleton;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Serializacja {

    public static void main(String[] args) {

        User user = new User("Jan", "Kowalski", 18);

        Gson gson = new GsonBuilder().create(); //ten temat pojawi sie pozniej

        String json = gson.toJson(user);
        System.out.println(json);

        User userFromJson = gson.fromJson(json, User.class);
        System.out.println(userFromJson);
    }
}
