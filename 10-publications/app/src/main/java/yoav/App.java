
package yoav;

import com.yoav.HttpClient;
import com.yoav.HttpClientWrapper;
// import com.yoav.TCPClient; // not in the compile CLASSPATH

public class App {
    public static void main(String[] args) {
        System.out.println("Yoav app");

        HttpClient httpClient = new HttpClient();
        HttpClientWrapper wrapper = new HttpClientWrapper(httpClient);

    }
}
