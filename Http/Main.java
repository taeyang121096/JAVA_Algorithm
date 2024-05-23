import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.run();

    }

    private void run() throws IOException {
        InetSocketAddress address = new InetSocketAddress(5678);
        HttpServer httpServer = HttpServer.create(address, 0);




        httpServer.start();
    }
}
