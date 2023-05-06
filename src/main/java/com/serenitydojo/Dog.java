package com.serenitydojo;
public class Dog {

    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;
    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.setName(name);
        this.setFavoriteToy(favoriteToy);
        this.setAge(age);
        this.isFed = false;
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return Dog.DOG_NOISE;
    }

    public boolean isFed() {
        return isFed;
    }

    public void feed() {
        isFed = true;
    }
}
