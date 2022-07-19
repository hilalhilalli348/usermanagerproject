package Models;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private String surName;

    public User(){}

    public User(String name,String surName){
        this.name = name;
        this.surName = surName;
    }

    public User(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
