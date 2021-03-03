package uniyazservlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Yazma
{
    public void yazma(ArrayList<Object> a)
    {
        ArrayList arrayList = a;

        File file = new File("C:\\javaDemos\\ODEV\\Odev1\\doGetdoPost\\hesaplar.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file))
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            objectOutputStream.flush();
        }
        catch (IOException exception)
        {
            System.out.println("Dosya yazma hatası");
        }
    }
}
