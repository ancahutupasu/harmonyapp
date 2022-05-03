package com.example.harmony.model;

import java.util.HashMap;
import java.util.Map;

public class UserDetails {

    private String name, city, description, age, address;


    public UserDetails() {
        name = "";
        city = "";
        description = "";
        age = "";
        address = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("city", city);
        result.put("description", description);
        result.put("age", age);
        result.put("address", address);
        return result;
    }
}
