package TP1_ex1;

import java.net.*;
import java.io.*;
import java.util.*;

public class ClientFact {
    public static void main(String[] args) {

        try{
            Scanner myObj = new Scanner(System.in);
            int numA = Integer.parseInt(myObj.nextLine());
            Socket F_client= new Socket("localhost",1800);
            OutputStream out=F_client.getOutputStream();
            InputStream   in=F_client.getInputStream();
            out.write(numA);
            System.out.println("le resultat de la factorisation effectué par le serveur est "+in.read());
            F_client.close();
        }catch (Exception e)
        {
            System.out.println("erreur");
        }
    }
}
