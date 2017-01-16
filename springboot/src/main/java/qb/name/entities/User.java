package qb.name.entities;

/**
 * @author qb
 * @description:
 * @date 2017-1-14 17:22
 */
public class User {
    private String id;
    private String userName;
    private String password;
    private int sex;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                '}';
    }

    public String toJson(){
        String sexStr = (sex == 0 ? "男" : sex == 1 ? "女" : "未知");
        return "[{" +
                "userId='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sexStr + '\'' +
                "}]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
