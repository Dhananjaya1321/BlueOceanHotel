package javaClass;

public class CheckPasswordAndUserName {
    private static String password;
    private static String userName;


    static {
        password="admin";
        userName="admin";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
