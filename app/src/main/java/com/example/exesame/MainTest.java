package com.example.exesame;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<produit> listProduit = new ArrayList<>();
        ProduitEnSolde produitEnSolde = new ProduitEnSolde(20.0F,5,22.2);
        listProduit.add(new ProduitEnSolde(20.3F,2,30.4));
        ProduitEnSolde p1= new ProduitEnSolde(100F,3,44.07);
        ProduitEnSolde p2= new ProduitEnSolde(0.005F,4,55.07);
        listProduit.add(p1);
        listProduit.add(p2);
        Boutique boutique = new Boutique(listProduit);
        System.out.println("Ajouter");
        boutique.Ajouter(new produit(5,99.99));
//        boutique.Supprime(5);
        System.out.println(listProduit);
        System.out.println("prix + remise ="+produitEnSolde.plise_remise());
//        System.out.println();
//        System.out.println("check in code produit"+boutique.index(2));
//
//       boolean test=  p2.equals_Produit(p1);
//        System.out.println( p2.valid_remise(p1.getRemise()));
////        System.out.printf(String.valueOf(p2.equals_Produit(p1)));
//        System.out.println(test);

    }
}
