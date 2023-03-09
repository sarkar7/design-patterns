package com.sarkar.design.pattern.behavioral.observer;

public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(Object object) {
        this.setNews((String) object);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
