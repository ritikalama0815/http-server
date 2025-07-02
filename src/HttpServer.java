import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    public static void main(String[] args) throws Exception {
        final ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Listening for connection on port 3000..");
        //allows us to keep our program running. without this infinite loop our program would exit immediately,
        //and server will shut down
        while (true) { 
            //accept incoming connection by blocking call
             Socket client = serverSocket.accept();
            //Read HTTP request from the client socket
            //Prepare an HTTP response
            //Send HTTP response to the client
            //CLose the socket
            //HTTP is stateless which means it doesn't need to remember the previous connections, only cares for incoming
            //ones

            // This reads the request in the HTTP server
            InputStreamReader reader = new InputStreamReader(client.getInputStream());
            BufferedReader bfrReader = new BufferedReader(reader);
            String line = bfrReader.readLine();
            while(!line.isEmpty()){
                System.out.println(line);
                line = bfrReader.readLine();
            }

        }
    }
}

