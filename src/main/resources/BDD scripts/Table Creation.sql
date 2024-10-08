CREATE TABLE utilisateurs (
                              utilisateur_id SERIAL PRIMARY KEY,
                              nom VARCHAR(255) NOT NULL,
                              prenom VARCHAR(255),
                              email VARCHAR(255) NOT NULL UNIQUE,
                              mot_de_passe VARCHAR(255) NOT NULL,
                              role VARCHAR(50) NOT NULL
);

CREATE TABLE fournisseurs (
                              fournisseur_id SERIAL PRIMARY KEY,
                              code_fournisseur VARCHAR(80) NOT NULL,
                              nom VARCHAR(255) NOT NULL,
                              prenom VARCHAR(255) NOT NULL,
                              statut BOOLEAN NOT NULL,
                              email VARCHAR(255),
                              telephone VARCHAR(50),
                              adresse TEXT,
                              nrc VARCHAR(80)

);

CREATE TABLE categories (
    categorie_id SERIAL PRIMARY KEY,
    code VARCHAR(80) NOT NULL,
    description TEXT
);

CREATE TABLE produits (
    produit_id SERIAL PRIMARY KEY,
	code VARCHAR (80) NOT NULL,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    categorie_id INT REFERENCES categories(categorie_id),
	seuilCritique DECIMAL NOT NULL,
    prix_u DECIMAL(10, 2) NOT NULL,
    prix_vente DECIMAL(10, 2) NOT NULL,
    quantite_en_stock DECIMAL NOT NULL,
    quantite_maximale DECIMAL NOT NULL,
	date_achat TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	date_expiration DATE NOT NULL,
    fournisseur_id INT REFERENCES fournisseurs(fournisseur_id)
);

CREATE TABLE clients (
    client_id SERIAL PRIMARY KEY,
	code_client VARCHAR(80) NOT NULL,
	categorie VARCHAR(80),
    nom VARCHAR(255) NOT NULL,
	prenom VARCHAR(255) NOT NULL,
    statut VARCHAR(80) NOT NULL,
    email VARCHAR(255),
    telephone VARCHAR(50),
    adresse TEXT,
	nrc VARCHAR(80)
);

CREATE TABLE commandes_fournisseur (
    commande_id SERIAL PRIMARY KEY,
    quantite DECIMAL  NOT NULL,
    prix_vente DECIMAL NOT NULL,
    date_commande TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    statut VARCHAR(50) NOT NULL,
    utilisateur_id INT REFERENCES utilisateurs(utilisateur_id),
    type_commande VARCHAR(20) NOT NULL DEFAULT 'fournisseur',
    fournisseur_id INT REFERENCES fournisseurs(fournisseur_id)
);

CREATE TABLE commandes_clients (
    commande_id SERIAL PRIMARY KEY,
    quantite DECIMAL  NOT NULL,
	prix_achat DECIMAL NOT NULL,
    date_commande TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    statut VARCHAR(50) NOT NULL, --en attente, en cours, livree
    utilisateur_id INT REFERENCES utilisateurs(utilisateur_id),
    type_commande VARCHAR(20) NOT NULL DEFAULT 'client',
	client_id INT REFERENCES clients(client_id)
);

CREATE TABLE lignesCommande (
    lignesCommande_id SERIAL PRIMARY KEY,
    quantite DECIMAL NOT NULL,
    produit_id INT REFERENCES produits(produit_id),
    commandes_fournisseur_id INT REFERENCES commandes_fournisseur(commande_id),
    commandes_clients_id INT REFERENCES commandes_clients(commande_id)
);

CREATE TABLE emplacements (
    emplacement_id SERIAL PRIMARY KEY,
	code VARCHAR(80) NOT NULL,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
	type VARCHAR(80),
	capaciteMax DECIMAL NOT NULL,
	quantite_actuelle DECIMAL NOT NULL,
	statut VARCHAR (80) DEFAULT 'Disponible'
);


CREATE TABLE mouvements_entree(
	mouvement_id SERIAL PRIMARY KEY,
    produit_id INT REFERENCES produits(produit_id),
    quantite DECIMAL NOT NULL,
    date_mouvement TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    utilisateur_id INT REFERENCES utilisateurs(utilisateur_id),
    emplacement_id INT REFERENCES emplacements(emplacement_id)
);


CREATE TABLE mouvements_interne(
	mouvement_id SERIAL PRIMARY KEY,
    produit_id INT REFERENCES produits(produit_id),
    quantite DECIMAL NOT NULL,
    date_mouvement TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    utilisateur_id INT REFERENCES utilisateurs(utilisateur_id),
    source_id INT REFERENCES emplacements(emplacement_id),
    destination_id INT REFERENCES emplacements(emplacement_id)
);


CREATE TABLE mouvements_sortie(
	mouvement_id SERIAL PRIMARY KEY,
    produit_id INT REFERENCES produits(produit_id),
    quantite DECIMAL NOT NULL,
    date_mouvement TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    utilisateur_id INT REFERENCES utilisateurs(utilisateur_id),
    emplacement_id INT REFERENCES emplacements(emplacement_id)
);


CREATE TABLE alertes (
    alerte_id SERIAL PRIMARY KEY,
	type VARCHAR(80) NOT NULL,
	date_creation TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	produit_id INT REFERENCES produits(produit_id),
	seuil_declanchement DECIMAL NOT NULL,
	message TEXT,
	statut VARCHAR(80) DEFAULT 'Nouvelle',
	date_resolution TIMESTAMP,
	priorite VARCHAR(80)
);

CREATE TABLE emplacement_produits (
                                      emplacement_id INT NOT NULL REFERENCES emplacements(emplacement_id) ON DELETE CASCADE,
                                      produit_id INT NOT NULL REFERENCES produits(produit_id) ON DELETE CASCADE,
                                      quantite DECIMAL NOT NULL,
                                      PRIMARY KEY (emplacement_id, produit_id)
);


ALTER TABLE produits
    ADD COLUMN emplacement_id INT;

ALTER TABLE produits
    ADD CONSTRAINT fk_emplacement
        FOREIGN KEY (emplacement_id)
            REFERENCES emplacements (emplacement_id);

commit