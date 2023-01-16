package com.test.xml;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import java.io.File;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoupClass {

    public static void main(String[] args) throws Exception{
        String path = jsoupClass.class.getClassLoader().getResource("a.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements);
    }
}
