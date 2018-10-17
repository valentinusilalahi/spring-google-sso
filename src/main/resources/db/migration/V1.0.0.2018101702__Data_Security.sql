INSERT INTO s_permission ( id, permission_value, permission_label ) VALUES 
('viewrekening', 'VIEW_TRANSAKSI', 'Lihat Data Rekening'),
('viewmutasi', 'VIEW_MUTASI', 'Lihat Data Mutasi'),
('edittransfer', 'EDIT_TRANSFER', 'Input Transfer');

INSERT INTO s_role (id, description, name) VALUES
('staff', 'STAFF', 'Staff'),
('manager', 'MANAGER', 'Manager');

INSERT INTO s_role_permission (id_role, id_permission) VALUE
('staff', 'viewrekening'),
('staff', 'viewmutasi'),
('manager', 'viewrekening'),
('manager', 'viewmutasi'),
('manager', 'edittransfer');

INSERT INTO s_user (id, username, id_role) VALUES 
('u001', 'valentinus.silalahi@gmail.com', 'staff');

INSERT INTO s_user_password (id_user, password) VALUES
-- password : test123
('u001', '$2a$13$d2GZHGr6gedUiNk8r3Pbo.Jc8eH7oBVdTta.WGMG9g1dO9T4hlNPG');