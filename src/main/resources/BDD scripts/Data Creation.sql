INSERT INTO categories (code, description)
VALUES
    ('CAT001', 'Electronics and gadgets'),
    ('CAT002', 'Home Appliances'),
    ('CAT003', 'Furniture'),
    ('CAT004', 'Clothing and Apparel'),
    ('CAT005', 'Books and Stationery');

INSERT INTO fournisseurs (code_fournisseur, nom, prenom, statut, email, telephone, adresse, nrc)
VALUES
    ('F001', 'Alibaba', 'Alice', TRUE, 'alice.fournisseur1@example.com', '123456789', '123 Street, City', 'NRC001'),
    ('F002', 'Amazon', 'Bob', TRUE, 'bob.fournisseur2@example.com', '987654321', '456 Avenue, City', 'NRC002'),
    ('F003', 'Google', 'Carol', TRUE, 'carol.fournisseur3@example.com', '555555555', '789 Boulevard, City', 'NRC003'),
    ('F004', 'FedEx', 'David', FALSE, 'david.fournisseur4@example.com', '444444444', '101 Road, City', 'NRC004'),
    ('F005', 'MicroBytes', 'Eve', TRUE, 'eve.fournisseur5@example.com', '666666666', '202 Lane, City', 'NRC005');

INSERT INTO emplacements (code, nom, description, type, capaciteMax, quantite_actuelle, statut)
VALUES
    ('EMP001', 'Shelf A', 'Aisle 1 shelf', 'Rack', 100.00, 50.00, 'Disponible'),
    ('EMP002', 'Shelf B', 'Aisle 2 shelf', 'Rack', 200.00, 80.00, 'Disponible'),
    ('EMP003', 'Bin 1', 'Storage bin 1', 'Bin', 50.00, 20.00, 'Disponible'),
    ('EMP004', 'Bin 2', 'Storage bin 2', 'Bin', 75.00, 30.00, 'Disponible'),
    ('EMP005', 'Pallet 1', 'Pallet storage area', 'Pallet', 500.00, 150.00, 'Disponible');


INSERT INTO produits (code, nom, description, categorie_id, seuilCritique, prix_u, prix_vente, quantite_en_stock, quantite_maximale, date_achat, date_expiration, fournisseur_id, emplacement_id)
VALUES
    ('PROD001', 'Smartphone', 'Latest model smartphone', 1, 10, 300.00, 350.00, 50, 100, CURRENT_TIMESTAMP, '2025-12-31',5,3),
    ('PROD002', 'Washing Machine', 'Automatic washing machine', 2, 5, 500.00, 600.00, 20, 40, CURRENT_TIMESTAMP, '2025-06-30',4,2),
    ('PROD003', 'Sofa', 'Comfortable 3-seater sofa', 3, 3, 700.00, 800.00, 0, 20, CURRENT_TIMESTAMP, '2025-12-31',3,1),
    ('PROD004', 'T-Shirt', 'Cotton t-shirt', 4, 50, 15.00, 20.00, 200, 500, CURRENT_TIMESTAMP, '2025-12-31',2,5),
    ('PROD005', 'Novel', 'Bestselling novel', 5, 30, 10.00, 12.00, 100, 300, CURRENT_TIMESTAMP, '2025-12-31',1,4),
    ('PROD006', 'notebook', 'a paper note pad', 4, 50, 15.00, 20.00, 510, 500, CURRENT_TIMESTAMP, '2025-12-31',2,3),
    ('PROD007', 'sneakers', 'a specific type of shoes.', 4, 50, 15.00, 20.00, 700, 500, CURRENT_TIMESTAMP, '2025-12-31',2,2);



INSERT INTO utilisateurs (nom, prenom, email, mot_de_passe, role)
VALUES
    ('Smith', 'John', 'john.smith@example.com', 'password123', 'admin'),
    ('Doe', 'Jane', 'jane.doe@example.com', 'password123', 'user'),
    ('Brown', 'Charlie', 'charlie.brown@example.com', 'password123', 'user'),
    ('Johnson', 'Emily', 'emily.johnson@example.com', 'password123', 'manager'),
    ('Williams', 'David', 'david.williams@example.com', 'password123', 'user');

INSERT INTO clients (code_client, categorie, nom, prenom, statut, email, telephone, adresse, nrc)
VALUES
    ('C001', 'Regular', 'Client1', 'Anna', 'Active', 'anna.client1@example.com', '777777777', '303 Street, City', 'NRC001'),
    ('C002', 'Premium', 'Client2', 'Brian', 'Inactive', 'brian.client2@example.com', '888888888', '404 Avenue, City', 'NRC002'),
    ('C003', 'Regular', 'Client3', 'Cathy', 'Active', 'cathy.client3@example.com', '999999999', '505 Boulevard, City', 'NRC003'),
    ('C004', 'Regular', 'Client4', 'Derek', 'Active', 'derek.client4@example.com', '000000000', '606 Road, City', 'NRC004'),
    ('C005', 'Premium', 'Client5', 'Ella', 'Inactive', 'ella.client5@example.com', '111111111', '707 Lane, City', 'NRC005');

INSERT INTO commandes_fournisseur (quantite, prix_vente, date_commande, statut, utilisateur_id, type_commande, fournisseur_id)
VALUES
    (10, 3500.00, CURRENT_TIMESTAMP, 'en attente', 1, 'fournisseur', 1),
    (20, 6000.00, CURRENT_TIMESTAMP, 'en cours', 2, 'fournisseur', 2),
    (15, 8000.00, CURRENT_TIMESTAMP, 'livree', 3, 'fournisseur', 3),
    (5, 2000.00, CURRENT_TIMESTAMP, 'en attente', 4, 'fournisseur', 4),
    (8, 3200.00, CURRENT_TIMESTAMP, 'en cours', 5, 'fournisseur', 5);

INSERT INTO commandes_clients (quantite, prix_achat, date_commande, statut, utilisateur_id, type_commande, client_id)
VALUES
    (5, 1500.00, CURRENT_TIMESTAMP, 'en attente', 1, 'client', 1),
    (8, 2400.00, CURRENT_TIMESTAMP, 'en cours', 2, 'client', 2),
    (12, 3600.00, CURRENT_TIMESTAMP, 'livree', 3, 'client', 3),
    (6, 1800.00, CURRENT_TIMESTAMP, 'en attente', 4, 'client', 4),
    (10, 3000.00, CURRENT_TIMESTAMP, 'en cours', 5, 'client', 5);

INSERT INTO lignesCommande (quantite, produit_id, commandes_fournisseur_id, commandes_clients_id)
VALUES
    (5, 1, 1, NULL),
    (3, 2, 2, NULL),
    (7, 3, 3, NULL),
    (2, 4, 4, NULL),
    (4, 5, 5, NULL),
    (6, 1, NULL, 1),
    (8, 2, NULL, 2),
    (10, 3, NULL, 3),
    (5, 4, NULL, 4),
    (9, 5, NULL, 5);


INSERT INTO mouvements_entree (produit_id, quantite, date_mouvement, utilisateur_id, emplacement_id)
VALUES
    (1, 10, CURRENT_TIMESTAMP, 1, 1),
    (2, 20, CURRENT_TIMESTAMP, 2, 2),
    (3, 15, CURRENT_TIMESTAMP, 3, 3),
    (4, 25, CURRENT_TIMESTAMP, 4, 4),
    (5, 5, CURRENT_TIMESTAMP, 5, 5);

INSERT INTO mouvements_interne (produit_id, quantite, date_mouvement, utilisateur_id, source_id, destination_id)
VALUES
    (1, 5, CURRENT_TIMESTAMP, 1, 1, 2),
    (2, 10, CURRENT_TIMESTAMP, 2, 2, 3),
    (3, 7, CURRENT_TIMESTAMP, 3, 3, 4),
    (4, 15, CURRENT_TIMESTAMP, 4, 4, 5),
    (5, 3, CURRENT_TIMESTAMP, 5, 5, 1);

INSERT INTO mouvements_sortie (produit_id, quantite, date_mouvement, utilisateur_id, emplacement_id)
VALUES
    (1, 5, CURRENT_TIMESTAMP, 1, 2),
    (2, 8, CURRENT_TIMESTAMP, 2, 3),
    (3, 4, CURRENT_TIMESTAMP, 3, 4),
    (4, 10, CURRENT_TIMESTAMP, 4, 5),
    (5, 2, CURRENT_TIMESTAMP, 5, 1);

INSERT INTO alertes (type, date_creation, produit_id, seuil_declanchement, message, statut, date_resolution, priorite)
VALUES
    ('Stock Critique', CURRENT_TIMESTAMP, 1, 10, 'Stock is below critical level.', 'Nouvelle', NULL, 'Haute'),
    ('Stock Bas', CURRENT_TIMESTAMP, 2, 5, 'Stock is running low.', 'Nouvelle', NULL, 'Moyenne'),
    ('Expire Soon', CURRENT_TIMESTAMP, 3, 7, 'Product is nearing expiration.', 'Nouvelle', NULL, 'Basse'),
    ('Stock Critique', CURRENT_TIMESTAMP, 4, 15, 'Stock is critically low.', 'Nouvelle', NULL, 'Haute'),
    ('Stock Bas', CURRENT_TIMESTAMP, 5, 5, 'Stock is low.', 'Nouvelle', NULL, 'Moyenne');

INSERT INTO emplacement_produits (emplacement_id, produit_id, quantite)
VALUES
    (1, 1, 10),  -- Shelf A storing 10 units of Smartphone
    (2, 2, 20),  -- Shelf B storing 20 units of Washing Machine
    (3, 3, 15),  -- Bin 1 storing 15 units of Sofa
    (4, 4, 25),  -- Bin 2 storing 25 units of T-Shirt
    (5, 5, 5),   -- Pallet 1 storing 5 units of Novel
    (1, 6, 5),   -- Shelf A storing 5 units of Notebook
    (2, 7, 15),  -- Shelf B storing 15 units of Sneakers
    (3, 1, 5),   -- Bin 1 storing 5 additional units of Smartphone
    (4, 3, 10),  -- Bin 2 storing 10 additional units of Sofa
    (5, 7, 30);  -- Pallet 1 storing 30 units of Sneakers
