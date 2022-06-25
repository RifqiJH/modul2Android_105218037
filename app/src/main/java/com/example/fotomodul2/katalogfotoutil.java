package com.example.fotomodul2;

import java.util.ArrayList;
import java.util.List;

public class katalogfotoutil {
    private static int[]ridArray={
            R.drawable.iphone,
            R.drawable.oppo,
            R.drawable.samsung,
            R.drawable.xiaomi
    };
    private static String[]filenamearray ={
            "iphone","oppo","samsung","xiaomi"
    };
    private static List<katalogfoto>katalogfotoList;
    public static void init(){
        katalogfotoList= new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogfotoList.add(new katalogfoto(ridArray[i],filenamearray[i]));
        }
    }

    public static List<katalogfoto> getKatalogfotoList() {

        return katalogfotoList;
    }
    public static katalogfoto getkatalogFotoAt(int i ){
        return katalogfotoList.get(i);
    }
}
