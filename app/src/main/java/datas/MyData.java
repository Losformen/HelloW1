package datas;

import java.util.ArrayList;

/**
 * Created by Simon ESPINOSA on 01/11/2015.
 */
public class MyData {

    private static MyData _instance = null;
    public  static MyData get_instance()
    {
        if (_instance == null)
            _instance = new MyData();
        return _instance;
    }


    public  ArrayList<Person> mesCouillons;
    public MyData()
    {
        mesCouillons = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            mesCouillons.add(new Person());
        }
    }
}
