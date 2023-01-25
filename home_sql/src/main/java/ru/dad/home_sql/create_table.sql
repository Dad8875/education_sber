create table products
(
    id serial primary key ,
    title varchar(50) not null ,
    price integer not null
);

insert into products (title, price) values ('Роза', 100);
insert into products (title, price) values ('Лилия', 50);
insert into products (title, price) values ('Ромашка', 25);

create table customers
(
    id serial primary key ,
    name varchar(50) not null ,
    phone varchar(20) not null
);

insert into customers(name, phone) values ('Александр', '79124556100');
insert into customers(name, phone) values ('Петр', '79621103371');
insert into customers(name, phone) values ('Давид', '79884507129');
insert into customers(name, phone) values ('Евгений', '79132800173');
insert into customers(name, phone) values ('Ольга', '79648732051');

create table orders
(
    id serial primary key ,
    customers_id integer references customers(id),
    products_id integer references products(id),
    amount integer not null check (amount >= 1 AND amount <= 1000),
    date_order date not null
);

insert into orders(customers_id, products_id, amount, date_order) values (3, 1, 21, '2022-09-10');
insert into orders(customers_id, products_id, amount, date_order) values (3, 2, 43, '2022-11-12');
insert into orders(customers_id, products_id, amount, date_order) values (3, 3, 15, '2021-07-10');
insert into orders(customers_id, products_id, amount, date_order) values (2, 1, 21, '2022-11-12');
insert into orders(customers_id, products_id, amount, date_order) values (1, 3, 5, '2022-07-10');
insert into orders(customers_id, products_id, amount, date_order) values (1, 2, 35, '2020-08-03');
insert into orders(customers_id, products_id, amount, date_order) values (2, 2, 23, '2021-12-03');
insert into orders(customers_id, products_id, amount, date_order) values (3, 1, 27, '2022-09-11');
insert into orders(customers_id, products_id, amount, date_order) values (1, 3, 43, '2022-12-12');
insert into orders(customers_id, products_id, amount, date_order) values (4, 1, 29, '2022-12-27');
insert into orders(customers_id, products_id, amount, date_order) values (5, 3, 61, '2022-12-25');
insert into orders(customers_id, products_id, amount, date_order) values (5, 2, 57, '2022-12-28');
insert into orders(customers_id, products_id, amount, date_order) values (1, 3, 23, '2023-01-12');

-- 1. По идентификатору заказа получить данные заказа и данные клиента, создавшего этот заказ
select name, phone, title, amount, price
from customers
inner join orders on customers.id = orders.customers_id
inner join products on orders.products_id = products.id where orders.id = 8;

-- 2. Получить данные всех заказов одного клиента по идентификатору клиента за последний месяц
select title, amount, date_order, name
from orders
inner join customers on orders.customers_id = customers.id
inner join products on orders.products_id = products.id
where date_order between '2022-12-24' and '2023-01-24' and customers_id = 1;

-- 3. Найти заказ с максимальным количеством купленных цветов, вывести их название и количество
select title, amount
from products
inner join orders on products.id = orders.products_id
order by amount desc limit 1;

-- 4. Вывести общую выручку (сумму золотых монет по всем заказам) за все время
select sum(price * orders.amount) as total
from orders
inner join products on orders.products_id = products.id;













