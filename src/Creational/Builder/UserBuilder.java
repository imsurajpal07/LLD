package Creational.Builder;

import java.util.UUID;

public class UserBuilder {

    public static void main(String[] args) {

        User user = User.builder(UUID.randomUUID(), "Suraj Pal", 1234567890)
                        .age(28)
                        .build();

        System.out.println(user);
    }
}
