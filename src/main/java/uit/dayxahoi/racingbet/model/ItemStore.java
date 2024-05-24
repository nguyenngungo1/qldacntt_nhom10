package uit.dayxahoi.racingbet.model;

import java.io.Serializable;

public class ItemStore implements Serializable {

    private int itemSkin1Price = 50;
    private boolean isItemSkin1;
    private int itemSkin2Price = 100;
    private boolean isItemSkin2;
    // private int itemSkin3Price = 1000;
    // private boolean isItemSkin3;

    private int itemMap1Price = 100;
    private boolean isItemMap1 = true;
    private int itemMap2Price = 100;
    private boolean isItemMap2;
    // private int itemMap3Price = 1000;
    // private boolean isItemMap3;

    public ItemStore() {
    }

    public int getItemSkin1Price() {
        return itemSkin1Price;
    }

    public void setItemSkin1Price(int itemSkin1Price) {
        this.itemSkin1Price = itemSkin1Price;
    }

    public boolean isItemSkin1() {
        return isItemSkin1;
    }

    public void setItemSkin1(boolean itemSkin1) {
        isItemSkin1 = itemSkin1;
    }

    public int getItemSkin2Price() {
        return itemSkin2Price;
    }

    public void setItemSkin2Price(int itemSkin2Price) {
        this.itemSkin2Price = itemSkin2Price;
    }

    public boolean isItemSkin2() {
        return isItemSkin2;
    }

    public void setItemSkin2(boolean itemSkin2) {
        isItemSkin2 = itemSkin2;
    }

    public int getItemMap1Price() {
        return itemMap1Price;
    }

    public void setItemMap1Price(int itemMap1Price) {
        this.itemMap1Price = itemMap1Price;
    }

    public boolean isItemMap1() {
        return isItemMap1;
    }

    public void setItemMap1(boolean itemMap1) {
        isItemMap1 = itemMap1;
    }

    public int getItemMap2Price() {
        return itemMap2Price;
    }

    public void setItemMap2Price(int itemMap2Price) {
        this.itemMap2Price = itemMap2Price;
    }

    public boolean isItemMap2() {
        return isItemMap2;
    }

    public void setItemMap2(boolean itemMap2) {
        isItemMap2 = itemMap2;
    }

}
