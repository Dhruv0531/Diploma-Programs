import java.net.*;

class URLDemo
{
    public static void main(String[] args) throws MalformedURLException
    {
        URL url = new URL("https://www.msbte.org.in/index.html");
        String hostname = url.getHost();
        int portnum = url.getPort();
        String path = url.getPath();
        String prot = url.getProtocol();

        System.out.println("Protocol:"+prot);
        System.out.println("Host Name:"+hostname);
        System.out.println("Port:"+portnum);
        System.out.println("File Name:"+path);
    }
}