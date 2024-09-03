package com.BdeB.StockVisioBackEnd.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
@NamedQuery(name = "Client.findALl", query = "Select c from Client c")


/*
*   uses Data Transfer
*/
@NamedQuery(name = "Client.Profits", query  = """
        SELECT new com.BdeB.StockVisioBackEnd.model.dataTransferObjects.ClientProfitDTO((c.nom || ', ' || c.prenom),MIN(c.id),SUM(lc.quantite * p.prixU))
        from LigneCommande lc
        join Produit p on p.id = lc.produit.id
        join CommandeClient cc on lc.commandeClient.id = cc.id
        join Client c on c.id = cc.id
        group by c.id
        order by SUM(lc.quantite * p.prixU) desc
    """)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int id;

    @Column(name = "code_client", nullable = false, length = 80)
    private String codeClient;

    @Column(name = "categorie", length = 80)
    private String categorie;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 255)
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "telephone", length = 50)
    private String tel;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "statut", nullable = false)
    private String statut;

    @Column(name = "nrc", length = 80)
    private String nrc;

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }
}