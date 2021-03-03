package uniyazservlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Okuma
{
    public ArrayList<Object> okuma()
    {
        ArrayList<Object> arrayList = new ArrayList<>();

        File file = new File("C:\\javaDemos\\ODEV\\Odev1\\doGetdoPost\\hesaplar.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file))
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            arrayList = (ArrayList) objectInputStream.readObject();
        } catch (IOException exception)
        {
            System.out.println("Dosya okuma hatası");
        } catch (ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        return arrayList;
    }
}
