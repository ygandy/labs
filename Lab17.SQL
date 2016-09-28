-- #1
SELECT * FROM northwind.customers;



-- #2
SELECT distinct country_region
	from northwind.customers;

-- #3
SELECT last_name FROM northwind.customers WHERE last_name LIKE ('B%');SELECT last_name

--#4
select * from orders limit 100;
--select * from orders limit 5,10;

--5#
select * from northwind.customers where zip_postal_code in (1010, 3012, 12209, 05023);
--select * from northwind.customers where zip_postal_code = '01010'
									--	 or zip_postal_code ='3012'
									--	 or zip_postal_code =, '12209';
--6#
select * from northwind.orders where country_region = (not null); 
--select * from orders where < > null;

--7#
select * from northwind.orders order by country_region, ship_city;

--8#
insert into northwind.customers(company, last_name, first_name, email_address, city) 
values ( 'dd','Martin', 'Gandy', 'Yolanda','yygandy@gmail.com','southfield');

--9#
update northwind.orders set ship_zip_postal_code  '97201' where Ship_City = 'portland';

--10#
delete from order_details where order_details.quantity = '1'; 

--11#
SELECT avg(quantity), max(quantity), min(quantity) from order_details;

--12#
SELECT avg(quantity), max(quantity), min(quantity) from order_details group by order_details.order_id;

--13#
select customer_id from orders where id= 65;

--14#
SELECT * FROM orders INNER JOIN customers 
ON orders.customer_id=customers.id;-- inner join

SELECT * FROM orders LEFT JOIN customers
ON orders.customer_id=customers.id;--left join

SELECT * FROM orders RIGHT JOIN customers 
ON orders.customer_id=customers.id;--right join

-- 15#
select employees.first_name from employees where employees.notes is null;

--16#.
SELECT ship_city FROM Orders o 
INNER JOIN 	Customers c 
ON 		o.customer_id = c.id 
WHERE 	first_name='Francisco';
--select ship_city from orders where ship_name LIKE 'Francisco %' works if data is in same table

