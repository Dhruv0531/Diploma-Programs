import java.io.*;
import java.net.*;
import java.util.*;

class URLCon
{
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.msbte.org.in/index.html");
        URLConnection con = url.openConnection();

        System.out.println("Content Type: "+con.getContentType());
        System.out.println("Content Encoding: "+con.getContentEncoding());
        Date dd = new Date(con.getLastModified());
        System.out.println("Last Modified Date: "+dd.toString());
    }
}