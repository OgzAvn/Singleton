package com.oguzavanoglu.landmarkjava;

public class Singleton {

    private Landmark sentLandmark;
    private static Singleton singleton;


    private Singleton() {

    }

    public Landmark getSentLandmark(){
        return sentLandmark;
    }

    public void setSentLandmark(Landmark sentLandmark){
        this.sentLandmark = sentLandmark;
    }

    public static Singleton getInstance(){  //Singleton.getInstance ı nerede çağırırsam çağırayım.
        //hep aynı objeyi döndürecek.

        if(singleton==null){  //Yani daha önce oluşturulmamışsa
            singleton = new Singleton();
        }
        return singleton;
    }

}
