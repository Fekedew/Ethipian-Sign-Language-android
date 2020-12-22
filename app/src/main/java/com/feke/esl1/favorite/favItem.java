package com.feke.esl1.favorite;

public class favItem {

    private int imageResource;
    private String title;
    private String key_id;

    public favItem() {
    }

    public favItem(int imageResource, String title, String key_id) {
        this.imageResource = imageResource;
        this.title = title;
        this.key_id = key_id;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getkey_id() {
        return key_id;
    }

    public void setkey_id(String id) {
        this.key_id = id;
    }
}
