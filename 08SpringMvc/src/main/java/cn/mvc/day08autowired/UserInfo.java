package cn.mvc.day08autowired;

import java.util.List;

public class UserInfo {
    private String username;
    private String password;
    private Car car;

    private List<BeautifulGirl> girlList;

    public List<BeautifulGirl> getGirlList() {
        return girlList;
    }

    public void setGirlList(List<BeautifulGirl> girlList) {
        this.girlList = girlList;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
