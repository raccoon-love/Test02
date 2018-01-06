package com.example.orixb.test02;

/**
 * Created by orixb on 2018/01/06.
 */
public class Note {
    protected int id;
    protected String note;
    protected String lastupdate;

    public Note(int id, String note, String lastupdate){
        this.id = id;
        this.note = note;
        this.lastupdate = lastupdate;
    }

    public String getNote(){
        return note;
    }

    public String getLastupdate(){
        return lastupdate;
    }

    public int getId(){
        return id;
    }

}