package computer_networking;

/*
    Create a server that accepts a UTC offset and returns the time in ISO 8601 format.
    Write a client that prompts the user to test.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static final int PORT = 5228;

    public static void main(String[] args) throws IOException
    {
        final ServerSocket ss = new ServerSocket(PORT);

        while (!ss.isClosed()) {
            Socket inboundConnection = ss.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(inboundConnection.getInputStream()));
            System.out.println("SERVER received: " + in.readLine());

            PrintWriter out = new PrintWriter(inboundConnection.getOutputStream(), true);
            out.println("PONG");

            inboundConnection.close();
        }
    }
}
