package hu.rendszerfejlesztes.bookshopbackend.dao.entities;

public enum Category {
    DRAMA("DRAMA"),
    AKCIO("AKCIO"),
    KALAND("KALAND"),
    ROMANTIKUS("ROMANTIKUS"),
    HORROR("HORROR"),
    UTAZAS("UTAZAS"),
    GYEREKEKNEK("GYEREKEKNEK"),
    MUVESZET("MUVESZET"),
    FOZES("FOZES"),
    ENCIKLOPEDIA("ENCIKLOPEDIA"),
    KOMEDIA("KOMEDIA"),
    SCIFI("SCIFI");

    private String category;

    Category (String category){ this.category = category;}

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
