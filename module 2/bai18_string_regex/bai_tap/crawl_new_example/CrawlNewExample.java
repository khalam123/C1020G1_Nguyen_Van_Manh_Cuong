package bai18_string_regex.bai_tap.crawl_new_example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewExample {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\R", "");
            content = content.replaceAll("(&quot)", "");
            Pattern p = Pattern.compile("<h3 class='news-item__title'> {20}<a {2}data-utm=\"(.*?)\" {2}href=\"(.*?)\" {2}title=\"(.*?)\"");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(3));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
        }
    }
}

