package TP1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Company apple = new Company(0, "Apple", "+3362", "+3312");
        Individual anthony = new Individual(1, "Anthony", "Man", "Ed", "manant@gmail.com", "+3363");
        apple.getContact().setEmail("apple@apple.com");
        apple.getContact().setFirstName("Tim");
        apple.getContact().setLastName("Cook");

        anthony.getShipping().setCity("Paris");
        anthony.getShipping().setCountry("France");
        
        Product iphoneUnreleased = new Product(0, "iPhone 13 Pro", LockingType.SL_UserMode, Rehost.Leave_as_it_is, "The unreleased iPhone");
        Product iphone = new Product(0, "iPhone 12 Pro", LockingType.SL_UserMode, Rehost.Leave_as_it_is, "The new iPhone");
        Product mac = new Product(0, "Macbook Pro", LockingType.SL_UserMode, Rehost.Leave_as_it_is, "The new Mac");
        Feature macFeature = new Feature(0, "Touchbar", "The new Touchbar");
        ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(macFeature);
        mac.setAssociatedFeatures(features);
        
        Set<Product> anthonyProducts = new HashSet<>();
        anthonyProducts.add(iphone);
        anthonyProducts.add(mac);

        Set<Product> appleProducts = new HashSet<>();
        anthonyProducts.add(iphoneUnreleased);

        Date startDate = new Date();
        Date endDate = new Date();
        endDate.setYear(startDate.getYear() + 4);
        Entitlement entitlement = new Entitlement("23-KZ", EntitlementType.Contract, startDate, endDate, false, null);
        entitlement.setCustomer(anthony);
        entitlement.setProducts(anthonyProducts);

        Entitlement AppleEntitlement = new Entitlement("23-APPLE", EntitlementType.Contract, startDate, endDate, true, null);
        AppleEntitlement.setCustomer(apple);
        AppleEntitlement.setProducts(appleProducts);
    }
}