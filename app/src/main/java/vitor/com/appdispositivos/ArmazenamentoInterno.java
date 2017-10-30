package vitor.com.appdispositivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.naming.Context;

/**
 * Created by aluno on 30/10/17.
 */

public class ArmazenamentoInterno {

    public void Salvar (Object objeto, String caminho){

        try{
            FileOutputStream saveFile = new FileOutputStream(caminho);
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);

            //SALVA O OBJETO

            stream.writeObject(objeto);

            stream.close();
        }


        catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public Object Restaurar (String caminho){

        Object object = null;

        try {
            FileInputStream resFile = new FileInputStream(caminho);
            ObjectInputStream stream = new ObjectInputStream(resFile);

            // RECUPERA O OBJETO

            object = stream.readObject();

            stream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
