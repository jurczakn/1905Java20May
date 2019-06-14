--scalar functions
select upper(firstname) || ' ' || upper(lastname) as fullname from employee;


--aggragate functions
select avg(milliseconds)/60000 as average_length_min from track; -- having average_length_min > 5;

select * from track;

select name, milliseconds/60000 from track where milliseconds = (select max(milliseconds) from track);

--anonymous plsql code block
do $$
	declare
		--define variables you will use
		max_cap integer;
		cap integer;
	begin
		--write code you want to run
		select max(people) into max_cap from bounce_house;
		cap := max_cap + 1;
		insert into bounce_house (bounce_house_id, air, people) values(2, true, cap);
	end; $$ language plpgsql;

--there are 2 types of subroutines in sql...
--Functions and Stored Procedures
create or replace function my_sum(val_a bigint, val_b bigint)
returns integer as $$
declare
	ret int;
begin
	ret := val_a + val_b;
	return ret;
end; $$ language plpgsql;
 
select my_sum(6, 7);

create or replace function employeeCount()
returns integer as $$
declare
	total integer;
begin
	select count(employeeid) into total from employee;
return total;
end;
$$ language plpgsql;

insert into employee(employeeid, firstname, lastname) values(20000, 'Jose', 'A');

select employeeCount();

select * from employee;

update employee set employeeid = 9 where employeeid = 20000;

--sequence: holds a sequence of numbers
create sequence employee_id_seq start 10;

insert into employee(employeeid, firstname, lastname) values((select nextval('employee_id_seq')), 'Mohamad', 'H');

create or replace function insert_into_employee()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
		new.employeeid = (select nextval('employee_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;

create trigger employee_insert
	before insert on employee
	for each row
		execute procedure insert_into_employee();
		
insert into employee(employeeid, firstname, lastname) values(5, 'Aisha', 'H');

select name, unitprice from track where unitprice > .98;

--cursor works like a pointer to a table
--create a cursor, then open it to populate it with a result set
create or replace function expensive_tracks_proc(in cost double precision, out curs refcursor)
as $$
begin 
	open curs for select name, unitprice from track where unitprice > cost;
end;
$$ language plpgsql;

create table proc_table (
	title varchar(200),
	price numeric(10,2)
);

select * from proc_table;

do $$
declare 
	curs refcursor;
	cost numeric(10, 2);
	title varchar(200);
	price numeric(10, 2);
begin
	cost := .99;
	select expensive_tracks_proc(cost, curs) into curs;
	loop
		fetch curs into title, price;
		exit when not found;
	
		insert into proc_table (title, price)
			values(title, price);
	end loop;
end;
$$ language plpgsql;