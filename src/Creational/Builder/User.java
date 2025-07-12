package Creational.Builder;

import java.util.UUID;

public class User {

    private UUID userId; //required
    private String userName; //required
    private String emailId; //Optional
    private int age; //Optional
    private int contactNumber; // required

    private User() {

    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public static class Builder {

        private User user = new User();

        public Builder(UUID userId, String userName, int contactNumber) {
            user.userId = userId;
            user.userName = userName;
            user.contactNumber = contactNumber;
        }

        public Builder emailId(String emailId) {
            user.emailId = emailId;
            return this;
        }

        public Builder age(int age) {
            user.age = age;
            return this;
        }

        public User build() {
            return user;
        }
    }

    public static Builder builder(UUID userId, String userName, int contactNumber) {
        return new Builder(userId, userName, contactNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", age=" + age +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
