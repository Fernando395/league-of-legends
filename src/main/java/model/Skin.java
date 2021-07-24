package model;

public class Skin {
    private String name;
    private String releaseDateOf;
    private int storePrice;
    private boolean obtainable;

    public Skin(String name, String releaseDateOf, int storePrice, boolean obtainable) {
        this.name = name;
        this.releaseDateOf = releaseDateOf;
        this.storePrice = storePrice;
        this.obtainable = obtainable;
    }

    public String getName() {
        return name;
    }

    public int getStorePrice() {
        return storePrice;
    }

    public String getReleaseDateOf() {
        return releaseDateOf;
    }

    public boolean getObtainable() {
        return obtainable;
    }
}
