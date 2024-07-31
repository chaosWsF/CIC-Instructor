
SELECT * FROM Product
WHERE Category='Gadgets';

SELECT Name, Price, Maker
FROM Product
WHERE Price > 100;

SELECT *
FROM Product
WHERE Name LIKE '%gizmo%';

SELECT Category FROM Product;
SELECT DISTINCT Category FROM Product;

SELECT Name, Price, Maker
FROM Product
WHERE Category='Gadgets'
-- ORDER BY Price DESC;
-- ORDER BY Price ASC;
ORDER BY Price;

SELECT * FROM Product
ORDER BY Category DESC, Price DESC;
