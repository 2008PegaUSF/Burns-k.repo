--you said to not use double quotes but that's the only way I got my program to run
--spent a lot of time on this first question

--1.1
--select.....from
select "EmployeeId", "LastName" , "Email"  from "Employee" where "LastName"='King';

--remeber to put is and not =
select "City", "State" from "Employee" where "FirstName"='Andrew' and "ReportsTo" is NULL;

--1.2
--remember to add what the two tables have in common 
select * from "Album" where "AlbumId" in (select "AlbumId" from "Track" where "Composer" ='AC/DC');

--1.3
select * from "Album" order by "Title" desc;

select "FirstName" from "Customer" order by "City";

--1.6
select * from "Invoice" where "BillingAddress" like 'T%';

--1.7
select * from "Invoice" where "Total" between 15 and 50;


--date format year-month-day
select * from "Employee" where "HireDate" between '2003-07-01' and '2004-03-01';

--2.1
--don't need the column names when doing all fields
--insert into.........values
insert into "Genre" values (26, 'Country'), (27, 'Funk');

insert into "Employee" values (9, 'Kong', 'Donkey', 'IT Staff', 1, '1987-02-16', '2004-06-16', '1562 Ellenwood Dr', 'Lethbridge', 'AB', 'Canada','T1k 2N9', '+1(264) 265-1649','+1(321) 613-1656', 'donkey@chinookcorp.com');

insert into "Employee" values (10, 'Avery', 'James', 'IT Manager', 3, '1962-04-26', '2004-08-26', '2353 Westwood Ln', 'Calgary', 'AB', 'Canada','T2P 2N9', '+1(234) 462-2465','+1(654) 953-7513', 'james@chinookcorp.com');

insert into "Customer" values (60, 'Luke', 'Perry', 'Revature','25 Rodel Dr', 'Las Vegas', 'NV', 'USA', '62331', '+1(336) 366-6626','+1(662) 361-5564','luke@revature.net',3);

insert into "Customer" values (61, 'Katy', 'Perry', 'Revature','2564 Riverwalk Dr', 'Las Vegas', 'NV', 'USA', '62345', '+1(654) 985-4652','+1(613) 312-3264','katy@revature.net',5);

--2.2
--update.....set
update "Customer" set "LastName" = 'Walter',"FirstName"='Robert' where "CustomerId" =32;

update "Artist" set "Name" = 'CCR' where "ArtistId" =76;

--2.3
--added back the constraint manually
alter table "Invoice" drop constraint "FK_InvoiceCustomerId";
alter table "Customer" drop constraint "PK_Customer"; 
delete "Customer" where "CustomerId" = 32;


--3.1

select current_time;

select length("Name") from "MediaType";

--3.2

--first i was trying to use int, then i looked at the table on what dataype they was using

create or replace function invoiceaver()
returns numeric 
as $$
select avg("Total") from "Invoice";
$$ language sql;

select invoiceaver();

--

create or replace function expensive()
returns numeric 
as $$
select max("UnitPrice") from "Track";
$$ language sql;

select expensive();

--3.3

create or replace function lineaverage()
returns numeric 
as $$
select avg("UnitPrice") from "InvoiceLine";
$$ language sql;

select lineaverage();

--first what threw me off that it was only going to return one column
--second I had to put the time stamp
--third, I didn't know setof was a thing
create or replace function employ()
returns setof integer   
as $$
select "EmployeeId" from "Employee" where "BirthDate" > '1968-12-31 00:00:00';
$$ language sql;

select employ();

--4.1
--haha, first i thought you wanted us to tell you when people got fired
--and of course i didn't know, had to read that sentence a couple of times
--don't forget to put the period after new
create or replace function employee_fired()
returns trigger as $$
begin
	if(TG_OP ='INSERT') then 
	update "Employee" set
	"Phone" = '867-5309' where new. "EmployeeId" = "Employee"."EmployeeId";
	end if;
	return new;
end; $$ language plpgsql;

create trigger employee_fired	
after insert on "Employee"
for each row execute function employee_fired();

insert into "Employee" values (15,'Jefferson','Alex','IT Manager',3,'1962-04-26 00:00:00',	'2004-08-26 00:00:00',	'2353 Westwood Ln',	'Calgary','AB',	'Canada','T2P 2N9',	'+1(234) 462-2465',	'+1(654) 953-7513',	'jefferson@chinookcorp.com');
	
select * from "Employee";

--4.2
--had to do it a couple of times
--after trigger update table, set the condition, keyword where with with the column and table 
--before trigger just new and the condition
create or replace function customer_company()
returns trigger as $$
begin 
	if(TG_OP = 'INSERT') then
	new."Company"='Revature';
	end if;
	return new;
end; $$ language plpgsql;

create trigger customer_company
before insert on "Customer"
for each row execute function customer_company();

insert into "Customer" values (65,'McGyver','Kyle','Apple',	'2353 Westwood Ln',	'Calgary','AB',	'Canada','T2P 2N9',	'+1(234) 462-2465',	'+1(654) 953-7513',	'mcgyver@chinookcorp.com',4);

select * from "Customer";

--5.1
--shows the mathching values from both table
select "FirstName" ,"LastName" ,"InvoiceId" from "Customer" inner join "Invoice" 
on "Customer"."CustomerId" ="Invoice"."CustomerId"; 

--5.2
--combines both tables but when one table doesn't match the other, it gets null
select "Customer"."CustomerId", "FirstName", "LastName", "InvoiceId", "Total" from "Customer" full join "Invoice"
on "Customer"."CustomerId" ="Invoice"."CustomerId"; 

--5.3
--shows everything from the right table and only what matches from the second
select "Name", "Title" from "Album" right join "Artist" 
on "Album"."ArtistId" = "Artist"."ArtistId";

--5.4
--joining each row from table1 to each row from table2
select * from "Album" cross join "Artist" order by "Name";
on "Album"."ArtistId" = "Artist"."ArtistId" 

--5.5
--self you give aliases to sperate the tables and you can use a lot of columns from the table
select a."EmployeeId" as "EmployeeId" ,a."FirstName" as "FirstName",a."LastName" as "LastName", b."ReportsTo" as "ReportsTo"
from "Employee" a join "Employee" b
on a."EmployeeId" =b."ReportsTo";

--6.1
--Union combines the result set of tables
select "LastName", "FirstName","Phone" from "Employee"
union
select "LastName", "FirstName","Phone" from "Customer";

--6.2
--Except all returns what doesn't appear in the second table
select "City", "State", "PostalCode" from "Customer"
except all
select "City", "State", "PostalCode" from "Employee";


