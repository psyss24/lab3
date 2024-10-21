package COMP2013;

import java.util.ArrayList;

public class Zoo {
    private String location;
    private int numCompound;
    private static int numZoos = 0;
    private int zooID = 0;
    private ArrayList<Compound> compounds;


    public Zoo(String location, int numCompound) {
        this.setLocation(location);
        this.setNumCompound(numCompound);
        this.compounds = new ArrayList<>();
        zooID = numZoos;
        numZoos++;
    }

    public Zoo() {
        this.setLocation("unknown");
        this.setNumCompound(30);
        this.compounds = new ArrayList<>();
        zooID = numZoos;
        numZoos++;

    }

    public void addCompound(Compound compound){
        if (compounds.size() < numCompound){
            compounds.add(compound);
        }
        else{
            System.out.println("Zoo has reached compound capacity");
        }
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumCompound() {
        return numCompound;
    }

    public void setNumCompound(int numCompound) {
        this.numCompound = numCompound;
    }

    public void getInfo(){
        System.out.println(location);
        System.out.println(numCompound);
        System.out.println("num of zoos created: "+numZoos);
        System.out.println("zooID: "+zooID);
    }
}
