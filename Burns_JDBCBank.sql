create database phoenix_bank;

CREATE TABLE customers (
	first_name varchar(60) NULL,
	account_number serial NOT null,
	email varchar(60) NULL,
	username varchar(60) NULL,
	pin serial NOT null,
	balance numeric NULL,
	last_name varchar(60) NULL,
	CONSTRAINT customers_pk PRIMARY KEY (account_number)
);

CREATE TABLE pending_apps (
	account_number serial NOT NULL,
	first_name varchar(60) NULL,
	last_name varchar(60) NULL,
	appid int NULL,
	CONSTRAINT pending_apps_pk PRIMARY KEY (appid),
	CONSTRAINT pending_apps_fk FOREIGN KEY (account_number) REFERENCES public.customers(account_number)
);

ALTER table customers ADD app_approval varchar(60) NULL;

ALTER TABLE customers ALTER COLUMN balance TYPE money USING balance::money;

update public.customers
set balance= balance + 30
WHERE account_number=5;



