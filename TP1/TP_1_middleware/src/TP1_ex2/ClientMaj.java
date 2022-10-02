package TP1_ex2;
import java.net.*;
import java.io.*;
public class ClientMaj {
    public static void main(String[] args)  {

        try{

            Socket F_client= new Socket("localhost",1800);
            PrintWriter out = new PrintWriter(F_client.getOutputStream(), true);
            System.out.println("Donner une chaine de caratére");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader((new InputStreamReader(F_client.getInputStream())));

                    String messageSent = reader.readLine();
                    System.out.println("The message sent is: " + messageSent);
                    out.println(messageSent);
                    String messageReceived = in.readLine();
                    System.out.println("le résultat de conversion en majuscule effectué par le serveur est "+messageReceived);

            F_client.close();
        }catch (Exception e)
        {
            System.out.println("erreur");
        }
    }


}
