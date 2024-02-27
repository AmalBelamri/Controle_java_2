package com.example.exesame;
//class CustomException extends Exception {
//    public CustomException(String message) {
//        super(message);
//    }
//}
public class ProduitEnSolde  extends  produit{
    private  Float remise;
    public  ProduitEnSolde(Float remise,int code, Double prix){
        super(code,prix);
        this.remise = valid_remise(remise);
    }
    public Float valid_remise(float remise){
        if (remise>0 && remise<=90){
            return  remise;
        }else 
            return 0.0F;
    }
    public  Float plise_remise(){
      return (float) (getPrix()*(1-getRemise()));
    }
    public  Float prixProduit(){
        return  this.remise;
    }
    public  Float getRemise(){
        return this.remise;
    }
    public void  setRemise(Float new_remise){
          this.remise= valid_remise(new_remise);
    }
    public  String ToString(){
        return super.ToString()+"; remise"+getRemise();
    }

}
