package com.ktu;


public class Document implements Comparable<Document>{
    private final int requiredAmountPages;

    private final String title;

    private int pages;

    public Document(int totalPages, String title){
        this.requiredAmountPages = totalPages;
        this.title = title;
        pages = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getRequiredAmountPages() {
        return requiredAmountPages;
    }

    public void addPage(){
        pages++;
    }

    public int getPages(){
        return pages;
    }

    public boolean isCompleted(){
        return requiredAmountPages == pages;
    }


    @Override
    public int compareTo(Document otherDocument) {
        return String.CASE_INSENSITIVE_ORDER.compare(title, otherDocument.getTitle());
    }

    @Override
    public String toString(){
        return  String.format("Title: %s  Pages: %d/%d%n", getTitle(), getPages(), getRequiredAmountPages());
    }

}
