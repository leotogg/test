/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planchejoliveautp3;

/**
 *
 * @author Yann
 */
public class ProduitDeriveTextile extends Produit {
private int taille ;
private String couleur;
private int anneeMiseStock;

public ProduitDeriveTextile (int taille, String couleur,int anneeMiseStock,String designation ,float prixVente, int stock){
    super(designation, prixVente, stock);//Classe mère
    
    this.taille = taille;
    
 
}
        
        

}
