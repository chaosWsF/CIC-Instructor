
CREATE TABLE Company (
  Name varchar(255) PRIMARY KEY, 
  StockPrice money, 
  Country varchar(255) 
);

CREATE TABLE Product (
  Name varchar(255) PRIMARY KEY, 
  Price money, 
  Category varchar(255), 
  Maker varchar(255)
);

CREATE TABLE Purchase(
  id varchar(255) PRIMARY KEY,
  product varchar(255) NOT NULL, 
  buyer varchar(255) NOT NULL
);

-- Populate with data

INSERT INTO Company VALUES ('GWorks', 25, 'USA');
INSERT INTO Company VALUES ('Canon', 65, 'Japan');
INSERT INTO Company VALUES ('Hitachi', 15, 'Japan');
INSERT INTO Company VALUES ('IBM', 140, 'USA');
 
INSERT INTO Product VALUES ('Gizmo', 19.99, 'Gadgets', 'GizmoWorks');
INSERT INTO Product VALUES ('Powergizmo', 29.99, 'Gadgets', 'GizmoWorks');
INSERT INTO Product VALUES ('SingleTouch', 149.99, 'Photography', 'Canon');
INSERT INTO Product VALUES ('MultiTouch', 203.99, 'Household', 'Hitachi');
 
INSERT INTO Purchase VALUES (1, 'Gizmo', 'Joe Blow');
INSERT INTO Purchase VALUES (2, 'Gizmo', 'Joe Blow');
INSERT INTO Purchase VALUES (3, 'SingleTouch', 'Mr Smith');
INSERT INTO Purchase VALUES (4, 'MultiTouch', 'Mr Smith');
INSERT INTO Purchase VALUES (5, 'Gizmo', 'Mr Smith');
