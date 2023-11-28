package comp;

import comp.Constants;

import java.io.*;
import java.net.*;

public class Manager {

    private static void sendDataToServer(Socket socket, BufferedReader consoleReader, PrintWriter writer, BufferedReader socketReader) throws IOException {
        String text;
        do {
            System.out.print("Enter text: ");
            text = consoleReader.readLine();

            writer.println(text);

            String time = socketReader.readLine();
            System.out.println(time);

        } while (!text.equals("bye"));
    }

    public static void main(String[] args) {
        String hostname = Constants.PATH;
        int port = Constants.PORT;

        try (Socket socket = new Socket(hostname, port);
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true);
             InputStream input = socket.getInputStream();
             BufferedReader socketReader = new BufferedReader(new InputStreamReader(input));
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

            sendDataToServer(socket, consoleReader, writer, socketReader);

        } catch (UnknownHostException ex) {
            System.out.println("Error: Server not found - " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: I/O exception - " + ex.getMessage());
        }
    }
}
