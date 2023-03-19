package com.sarkar.design.pattern.behavioral.observer;

public class ObserverApplication {

    public static void main(String[] args) {
        String news1 = "This is news 1";
        String news2 = "This is news 2";

        NewsAgency agency = new NewsAgency();
        NewsChannel channel = new NewsChannel();
        agency.addObserver(channel);
        agency.setNews(news1);
        System.out.println(channel.getNews());

        agency.setNews(news2);
        System.out.println(channel.getNews());
    }
}
