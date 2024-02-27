package com.example.exesame;

import java.util.ArrayList;

public class Boutique {
    public  static ArrayList<produit> listproduit = new ArrayList<>();

    public Boutique(ArrayList<produit> listproduit) {
        Boutique.listproduit =listproduit;
    }
    public  int index(int code){
        for (produit i:listproduit){
            if (i.getCode()==code){
                return listproduit.indexOf(i);
        }
        }
        return -1;
    }
    public  void  Ajouter(produit produit1){
        int valde= index(produit1.getCode());
        if (valde ==-1 ){
            listproduit.add(produit1);
        }
        else {
            System.out.printf("prodiut is add after");
        }
    }
    public boolean Supprime(int code){
        int check= index(code);
        if (check ==-1) {
            return false;
        }
        for (produit i:listproduit)
            if (i.getCode()==code)
                listproduit.remove(i);
        return true;
    }
    public boolean Supprime_Produit(produit code_produit){
        int check_prodoit= index(code_produit.getCode());
        if (check_prodoit ==-1 ){
            return false;
        }
        for (produit i:listproduit)
            if (i.getCode()== code_produit.getCode())
                listproduit.remove(i);
        return true;
    }
//    public  int nombreProduitEnsolde(){
//        for (int i= 0;i<listproduit.size();i++){
//            if ()
//        }
//    }

}
