import java.net.*;

class DemoInet
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress ia = InetAddress.getByName("www.google.com");
        String hostnm = ia.getHostName();
        String ip = ia.getHostAddress();

        System.out.println("Host Name:"+hostnm);
        System.out.println("IP Address:"+ip);
    }
}