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
    (10, 3500.00, '2023-01-15', 'en attente', 1, 'fournisseur', 1),
    (20, 6000.00, '2023-03-10', 'en cours', 2, 'fournisseur', 2),
    (15, 8000.00, '2023-06-25', 'livree', 3, 'fournisseur', 3),
    (8, 3200.00, '2023-09-05', 'en cours', 4, 'fournisseur', 5),
    (12, 4800.00, '2023-12-20', 'livree', 5, 'fournisseur', 4),
    (18, 7200.00, '2024-02-10', 'en attente', 1, 'fournisseur', 2),
    (22, 8800.00, '2024-04-15', 'en cours', 2, 'fournisseur', 3),
    (25, 10000.00, '2024-07-01', 'livree', 3, 'fournisseur', 4),
    (10, 4000.00, '2024-10-12', 'en attente', 4, 'fournisseur', 5),
    (14, 5600.00, '2024-12-28', 'livree', 5, 'fournisseur', 1);


INSERT INTO commandes_clients (quantite, prix_achat, date_commande, statut, utilisateur_id, type_commande, client_id)
VALUES
    (5, 1500.00, '2023-01-22', 'en attente', 1, 'client', 1),
    (8, 2400.00, '2023-03-18', 'en cours', 2, 'client', 2),
    (12, 3600.00, '2023-06-30', 'livree', 3, 'client', 3),
    (6, 1800.00, '2023-08-14', 'en attente', 4, 'client', 4),
    (10, 3000.00, '2023-11-09', 'en cours', 5, 'client', 5),
    (7, 2100.00, '2024-02-20', 'livree', 1, 'client', 2),
    (9, 2700.00, '2024-04-25', 'en attente', 2, 'client', 3),
    (15, 4500.00, '2024-07-18', 'en cours', 3, 'client', 4),
    (8, 2400.00, '2024-09-12', 'livree', 4, 'client', 5),
    (11, 3300.00, '2024-12-05', 'en attente', 5, 'client', 1);


-- For commandes_fournisseur
INSERT INTO lignesCommande (commandes_fournisseur_id, produit_id, quantite)
VALUES
    (1, 1, 10),
    (2, 2, 20),
    (3, 3, 15),
    (4, 4, 8),
    (5, 5, 12),
    (6, 2, 18),
    (7, 3, 22),
    (8, 4, 25),
    (9, 5, 10),
    (10, 1, 14);

-- For commandes_clients
INSERT INTO lignesCommande (commandes_clients_id, produit_id, quantite)
VALUES
    (1, 1, 5),
    (2, 2, 8),
    (3, 3, 12),
    (4, 4, 6),
    (5, 5, 10),
    (6, 2, 7),
    (7, 3, 9),
    (8, 4, 15),
    (9, 5, 8),
    (10, 1, 11);



-- For commandes_fournisseur
INSERT INTO mouvements_entree (produit_id, quantite, date_mouvement, utilisateur_id, emplacement_id)
VALUES
    (1, 10, '2023-01-20', 1, 1),
    (2, 20, '2023-03-15', 1, 2),
    (3, 15, '2023-06-20', 1, 3),
    (4, 8, '2023-09-10', 1, 4),
    (5, 12, '2023-12-15', 1, 5),
    (2, 18, '2024-02-05', 1, 1),
    (3, 22, '2024-04-10', 1, 2),
    (4, 25, '2024-07-05', 1, 3),
    (5, 10, '2024-10-10', 1, 4),
    (1, 14, '2024-12-20', 1, 5);

-- For commandes_clients
INSERT INTO mouvements_entree (produit_id, quantite, date_mouvement, utilisateur_id, emplacement_id)
VALUES
    (1, 5, '2023-01-27', 1, 1),
    (2, 8, '2023-03-22', 1, 2),
    (3, 12, '2023-07-05', 1, 3),
    (4, 6, '2023-08-20', 1, 4),
    (5, 10, '2023-11-15', 1, 5),
    (2, 7, '2024-02-15', 1, 1),
    (3, 9, '2024-04-20', 1, 2),
    (4, 15, '2024-07-12', 1, 3),
    (5, 8, '2024-09-15', 1, 4),
    (1, 11, '2024-12-10', 1, 5);

-- For internal movements related to commandes_fournisseur
INSERT INTO mouvements_interne (produit_id, quantite, date_mouvement, utilisateur_id, source_id, destination_id)
VALUES
    (1, 10, '2023-01-22', 1, 1, 2),
    (2, 20, '2023-03-18', 1, 2, 3),
    (3, 15, '2023-06-30', 1, 3, 4),
    (4, 8, '2023-09-15', 1, 4, 5),
    (5, 12, '2023-12-20', 1, 5, 1),
    (2, 18, '2024-02-20', 1, 1, 3),
    (3, 22, '2024-04-25', 1, 3, 4),
    (4, 25, '2024-07-10', 1, 4, 5),
    (5, 10, '2024-10-15', 1, 5, 1),
    (1, 14, '2024-12-25', 1, 1, 2);

-- For internal movements related to commandes_clients
INSERT INTO mouvements_interne (produit_id, quantite, date_mouvement, utilisateur_id, source_id, destination_id)
VALUES
    (1, 5, '2023-01-30', 1, 1, 2),
    (2, 8, '2023-03-25', 1, 2, 3),
    (3, 12, '2023-07-10', 1, 3, 4),
    (4, 6, '2023-08-25', 1, 4, 5),
    (5, 10, '2023-11-20', 1, 5, 1),
    (2, 7, '2024-02-25', 1, 1, 3),
    (3, 9, '2024-04-30', 1, 3, 4),
    (4, 15, '2024-07-15', 1, 4, 5),
    (5, 8, '2024-09-20', 1, 5, 1),
    (1, 11, '2024-12-15', 1, 1, 2);


-- For commandes_fournisseur
INSERT INTO mouvements_sortie (produit_id, quantite, date_mouvement, utilisateur_id, emplacement_id)
VALUES
    (1, 10, '2023-01-25', 1, 2),
    (2, 20, '2023-03-20', 1, 3),
    (3, 15, '2023-07-01', 1, 4),
    (4, 8, '2023-09-20', 1, 5),
    (5, 12, '2023-12-25', 1, 1),
    (2, 18, '2024-02-25', 1, 3),
    (3, 22, '2024-04-30', 1, 4),
    (4, 25, '2024-07-15', 1, 5),
    (5, 10, '2024-10-20', 1, 1),
    (1, 14, '2024-12-30', 1, 2);

-- For commandes_clients
INSERT INTO mouvements_sortie (produit_id, quantite, date_mouvement, utilisateur_id, emplacement_id)
VALUES
    (1, 5, '2023-02-01', 1, 2),
    (2, 8, '2023-03-30', 1, 3),
    (3, 12, '2023-07-15', 1, 4),
    (4, 6, '2023-08-30', 1, 5),
    (5, 10, '2023-11-25', 1, 1),
    (2, 7, '2024-03-01', 1, 3),
    (3, 9, '2024-05-05', 1, 4),
    (4, 15, '2024-08-01', 1, 5),
    (5, 8, '2024-09-25', 1, 1),
    (1, 11, '2024-12-20', 1, 2);


INSERT INTO alertes (type, date_creation, produit_id, seuil_declanchement, message, statut, date_resolution, priorite)
VALUES
    ('Stock Critique', '2024-08-01', 1, 10, 'Stock is below critical level.', 'Surstock', '2024-08-11', 'Haute'),
    ('Stock Bas', '2023-11-25', 2, 5, 'Stock is running low.', 'Nouvelle', '2023-12-05', 'Surstock'),
    ('Expire Soon', '2023-02-01', 3, 7, 'Product is nearing expiration.', 'Rupture', '2023-02-21', 'Basse'),
    ('Stock Critique', '2024-12-20', 4, 15, 'Stock is critically low.', 'Nouvelle', '2024-12-22', 'Haute'),
    ('Stock Bas', '2024-09-25', 5, 5, 'Stock is low.', 'Nouvelle', '2024-09-27', 'Rupture');

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
