package com.feke.esl1;

public class LearnItem {

    private String imageResource;
    private String key_id;
    private String favStatus;
    private String name;
    private String descName;
    private String descTip;
//    private String[] imageResource;
//    private String[] key_id;
//    private String favStatus;
//    private String[] name;
//    private String[] descName;
//    private String[] descTip;

    public LearnItem() {
    }

    public LearnItem(String imageResource, String name, String descName, String descTip, String key_id, String favStatus) {
        this.imageResource = imageResource;
        this.name = name;
        this.descName = descName;
        this.descTip = descTip;
        this.key_id = key_id;
        this.favStatus = favStatus;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescName() {
        return descName;
    }

    public void setDescName(String descName) {
        this.descName = descName;
    }

    public String getDescTip() {
        return descTip;
    }

    public void setDescTip(String descTip) {
        this.descTip = descTip;
    }

    public String getImageResource() {
        return imageResource;
    }

    public void setImageResource(String imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String name) {
        this.name = name;
    }

    public String getkey_id() {
        return key_id;
    }

    public void setkey_id(String id) {
        this.key_id = id;
    }

    public String getFavStatus() {
        return favStatus;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

}
