package TP1;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private LockingType lockingType;
    private Rehost rehost;
    private String description;
    private ArrayList<Feature> associatedFeatures;
    private ArrayList<Product> provisionnalProducts;
    private Product baseProduct;

    public Product(int id, String name, LockingType lockingType, Rehost rehost, String description) {
        this.id = id;
        this.name = name;
        this.lockingType = lockingType;
        this.rehost = rehost;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LockingType getLockingType() {
        return this.lockingType;
    }

    public void setLockingType(LockingType lockingType) {
        this.lockingType = lockingType;
    }

    public Rehost getRehost() {
        return this.rehost;
    }

    public void setRehost(Rehost rehost) {
        this.rehost = rehost;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Feature> getAssociatedFeatures() {
        return this.associatedFeatures;
    }

    public void setAssociatedFeatures(ArrayList<Feature> associatedFeatures) {
        this.associatedFeatures = associatedFeatures;
    }
}
