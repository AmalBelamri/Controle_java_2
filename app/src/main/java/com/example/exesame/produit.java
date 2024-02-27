package com.example.exesame;

public class produit {
   private  int code ;
   private  Double prix;
   public  produit(int code , Double prix){
       this.code = code;
       this.prix= prix;
   }
   public int getCode(){
       return  this.code;
   }
   public  void  setCode(int new_code){
       this.code= new_code;
   }
   public double getPrix(){
       return this.prix;
   }
   public void  setPrix(Double new_Prix){
       this.prix= new_Prix;
   }
   public  Boolean equals_Produit(Object object){
       if (this.code ==((produit) object).code ){
           return  true;
       }else
           return false;
   }

   public String ToString(){
       return  "code"+this.code+";prix"+this.prix;
   }
}
