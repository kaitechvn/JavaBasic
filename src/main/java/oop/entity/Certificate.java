package oop.entity;

import java.time.LocalDate;

public class Certificate {

    private String name;
    private String rank;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Certificate(String name, String rank, LocalDate date) {

        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public Certificate() {
    }
}
