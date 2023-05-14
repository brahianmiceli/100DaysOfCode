package org.Practices.PracticesSimple;

public class users {

    private String name;
    private String lastname;
    private int year;
    private long id;

    public users(String name, String lastname, int year, long id) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.id = id;
    }

    public users() {
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYear() {
        return year;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(long id) {
        this.id = id;
    }
}
