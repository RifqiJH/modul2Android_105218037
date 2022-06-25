package com.example.fotomodul2;

public class katalogfoto {

    private int resID;
    private String filename;
    public katalogfoto(int _resID, String _filename){
        resID=_resID;
        filename=_filename;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
