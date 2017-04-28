package com.rafilutfansyah.volleyexamples;

/**
 * Created by Rafi Lutfansyah on 23/04/2017.
 */

public class Model {
    private String id, title, detail, img, category, username, avatar, email;

    public Model() {

    }

    public Model(String id, String title, String detail, String img, String category, String username, String avatar, String email) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.img = img;
        this.category = category;
        this.username = username;
        this.avatar = avatar;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
