package TP1_ex1;

import java.net.*;
import java.io.*;
public class ServeurFact {
    static int fact(int n){
        if (n == 0)
            return 1;
        else
            return(n * fact(n-1));
    }
    public static void main(String[] args)  {
        try {
                ServerSocket socket_ecoute= new ServerSocket(1800);
                Socket service=socket_ecoute.accept();
                OutputStream out=service.getOutputStream() ;
                InputStream in=service.getInputStream();
                int A= in.read();
                out.write(fact(A));
                System.out.println("l’entier reçu de la part du client est "+A);
                service.close();
                socket_ecoute.close();
        }catch (Exception e){
        System.out.println("erreur");
        }
    }

}
