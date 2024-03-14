use ecomerce;
INSERT INTO USERS (USERNAME, EMAIL, PASSWORD, ADDRESS, PHONE_NUMBER)
VALUES 
('john_doe', 'john@example.com', 'password123', '123 Main St, City, Country', '123-456-7890'),
('jane_smith', 'jane@example.com', 'password456', '456 Elm St, Town, Country', '987-654-3210');

INSERT INTO PRODUCTS (NAME, DESCRIPTION, PRICE, STOCK_QUANTITY)
VALUES
('Product 1', 'Description for Product 1', 19.99, 100),
('Product 2', 'Description for Product 2', 29.99, 50),
('Product 3', 'Description for Product 3', 9.99, 200);

INSERT INTO CATEGORIES (NAME)
VALUES
('Category 1'),
('Category 2'),
('Category 3');

INSERT INTO PRODUCT_CATEGORIES (PRODUCT_ID, CATEGORY_ID)
VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 3);

INSERT INTO ORDERS (USER_ID)
VALUES
(1),
(2);

INSERT INTO ORDER_ITEMS (ORDER_ID, PRODUCT_ID, QUANTITY, PRICE_PER_UNIT)
VALUES
(1, 1, 2, 19.99),
(1, 2, 1, 29.99),
(2, 3, 3, 9.99);

INSERT INTO REVIEWS (USER_ID, PRODUCT_ID, RATING, COMMENT)
VALUES
(1, 1, 5, 'Great product!'),
(2, 2, 4, 'Nice quality.'),
(1, 3, 3, 'Average product.');

INSERT INTO WISHLIST (USER_ID, PRODUCT_ID)
VALUES
(1, 2),
(2, 3);
