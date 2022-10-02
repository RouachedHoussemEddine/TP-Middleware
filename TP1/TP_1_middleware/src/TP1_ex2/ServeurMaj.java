package TP1_ex2;

import java.io.*;
import java.net.*;
public class ServeurMaj {
    public static void main(String[] args)  {
        try {
            ServerSocket socket_ecoute = new ServerSocket(1800);
            Socket service = socket_ecoute.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(service.getInputStream()));
            PrintWriter out = new PrintWriter(service.getOutputStream(), true);
            String chaine = in.readLine();
            System.out.println(" la chaine reçue de la part du client est " + chaine);
            String modifiedMessage = chaine.toUpperCase();
            out.println(modifiedMessage);
            service.close();
            socket_ecoute.close();
        }
        catch(Exception e){
            System.out.println("erreur");
        }

    }
}
