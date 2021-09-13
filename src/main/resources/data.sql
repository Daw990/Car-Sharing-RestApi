insert into brand_car (id, brand, created) values (1, 'Audi', '2021-03-08T12:36:38.223386300');
insert into brand_car (id, brand, created) values (2, 'Skoda', '2021-03-07T12:36:38.223386300');
insert into brand_car (id, brand, created) values (3, 'Volkswagen', '2021-03-06T12:36:38.223386300');
insert into brand_car (id, brand, created) values (4, 'Volvo', '2021-03-05T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (1, 1, 'A1', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (2, 1, 'A2', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (3, 1, 'A3', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (4, 1, 'A4', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (5, 1, 'A5', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (6, 1, 'A6', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (7, 1, 'A7', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (8, 1, 'A8', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (9, 2, 'Fabia', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (10, 2, 'Octavia', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (11, 2, 'Superb', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (12, 2, 'Kodiaq', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (13, 2, 'rapid', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (14, 3, 'Polo', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (15, 3, 'id', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (16, 3, 'Passat', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (17, 3, 'Golf', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (18, 3, 'Tiguan', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (19, 3, 'Arteon', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (20, 4, 'S60', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (21, 4, 'S90', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (22, 4, 'V60', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (23, 4, 'V90', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (24, 4, 'XC40', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (25, 4, 'XC60', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (26, 4, 'XC90', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (27, 4, 'S40', '2021-03-08T12:36:38.223386300');
insert into model_car (id, brand_car_id, model, created) values (28, 4, 'S70', '2021-03-08T12:36:38.223386300');

insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (1, 28, 4, 'GPU1345', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (2, 10, 2, 'GWE3234', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (3, 19, 3, 'WAW3114', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (4, 12, 2, 'KRA3004', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (5, 17, 3, 'GPU3994', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (6, 27, 4, 'GDA3224', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (7, 24, 4, 'GDY3234', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (8, 10, 2, 'GDA3934', false, false);
insert into company_car (id, model_car_id, brand_car_id, registration_number, rented, available) values (9, 3, 1, 'GDY8884', false, false);