package com.company;

public class PostInfo {
    private int postnymmer;
    private String byNavn;
    public PostInfo(int postnymmer, String byNavn){
        this.postnymmer = postnymmer;
        this.byNavn = byNavn;
    }

    public int getPostnymmer() {
        return postnymmer;
    }

    public void setPostnymmer(int postnymmer) {
        this.postnymmer = postnymmer;
    }

    public String getByNavn() {
        return byNavn;
    }

    public void setByNavn(String byNavn) {
        this.byNavn = byNavn;
    }

    @Override
    public String toString() {
        return "Postnymmer: " + postnymmer + " byNavn:" + byNavn;
    }
}
