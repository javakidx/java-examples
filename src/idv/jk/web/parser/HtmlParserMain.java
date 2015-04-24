package idv.jk.web.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by javakidx on 2015/4/14.
 */
public class HtmlParserMain
{
    public static void main(String[] argv)
    {
        String url = "https://news.google.com.tw/news";
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc.title());
            Elements h1s = doc.select("span.titletext");

            Element thisOne = null;
            for(Iterator<Element> it = h1s.iterator(); it.hasNext();)
            {
                thisOne = it.next();
                System.out.println(thisOne.html());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
