package com.mycompany.part5.Utility;

public class Utility {
    private String message;

    public Utility() {
        message = "This is part 5";

    }

    public Utility(String mes) {
        this.message = mes;
    }

    public String getMes() {
        return message;
    }

    public void setMes(String mes) {
        this.message = mes;
    }

    @Override
    public String toString() {
        return "Utility{" +
                "message='" + message + '\'' +
                '}';
    }
}