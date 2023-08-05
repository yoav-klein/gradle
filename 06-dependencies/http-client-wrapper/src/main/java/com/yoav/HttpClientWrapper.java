
package com.yoav;

import com.yoav.HttpClient;
import com.yoav.TCPClient;

public class HttpClientWrapper {

    private HttpClient httpClient;
    private TCPClient tcpClient;

    public HttpClientWrapper(HttpClient client) {
        this.httpClient = client;

        tcpClient = new TCPClient();
    }

    private void openTCPConnection(TCPClient tcpClient) {
        tcpClient.openConnection();
        
    }
}
