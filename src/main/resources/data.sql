INSERT INTO barber
(email, name, phone_number)
VALUES
    ('jack@gmail.com', 'Jackson', '5141112222'),
    ('luc@gmail.com', 'Lucas', '5141112223'),
    ('oli@gmail.com', 'Oliver', '5141112224'),
    ('theok@gmail.com', 'Theo', '5141112225');


INSERT INTO service (name, duration, price)
VALUES
    ('Mens Haircut', 30, 50),
    ('Beard Trimming',30, 20),
    ('Mens Colouration',30, 30),
    ('Blow-dry / Brushing', 30, 20),
    ('Highlights',30, 50);

INSERT INTO service_provider
(service_id, barber_id)
VALUES
    (1, 3),
    (1, 4),
    (1, 5),
    (1, 6),
    (2, 3),
    (2, 4),
    (2, 5),
    (3, 3),
    (3, 4),
    (4, 5),
    (4, 6),
    (5, 3),
    (5, 5);