select * from artist;
select * from album where artistid = 1;
select * from track where albumid = 1 or albumid = 4;

--using Sub-Queries we can next select statements inside of select statements
select * from album where artistid = (select artistid from artist where name = 'AC/DC');

select * from track where albumid in
(select albumid from album where artistid in (select artistid from artist where name != 'AC/DC'));

select * from playlisttrack where trackid in (select trackid from track where albumid in
(select albumid from album where artistid = (select artistid from artist where name = 'AC/DC')));

select* from playlisttrack where playlistid in (select playlistid from playlisttrack where trackid in (select trackid from track where albumid in
(select albumid from album where artistid = (select artistid from artist where name = 'AC/DC'))));

select * from track where trackid in 
	((select trackid from playlisttrack where playlistid in 
		(select playlistid from playlisttrack where trackid in 
			(select trackid from track where albumid in
				(select albumid from album where artistid = 
					(select artistid from artist where name = 'AC/DC'))))) 
	and trackid in 
		(select trackid from track where albumid in
			(select albumid from album where artistid in 
				(select artistid from artist where name != 'AC/DC'))));
			
	
-- Solution?
select * from track where trackid in
    ((select trackid from playlisttrack where playlistid in
         (select playlistid from playlisttrack where trackid in
             (select trackid from track where albumid in
                 (select albumid from album where artistid =
                     (select artistid from artist where name = 'AC/DC'))))))
     and not trackid in
    ((select trackid from track where albumid in
        (select albumid from album where artistid in
            ( select artistid from artist where name = 'AC/DC'))));
           
           
drop table acdc_songs;
           
create view acdc_songs as select * from track where albumid in 
	(select albumid from album where artistid in 
		(select artistid from artist where name = 'AC/DC'));
           
	select * from acdc_songs;
           select * from track where trackid = 1;
          
create view acdc_playlists as select * from playlist where playlistid in 
	(select playlistid from playlisttrack where trackid in 
		(select trackid from acdc_songs));
	
select * from acdc_playlists;

create view acdc_playlist_songs as select * from track where trackid in 
	(select trackid from playlisttrack where playlistid in 
		(select playlistid from acdc_playlists));
	
select * from acdc_playlist_songs;

select * from track where trackid in 
	(select trackid from acdc_playlist_songs)
	and not trackid in
		(select trackid from acdc_songs);
	
create table TestTaBLE (
	val int
);

insert into TestTaBLE values(5);
insert into testtable values(12);
insert into TESTTABLE values(24);
select * from testtable;

create table "TestTaBLE" (
	val int
)

insert into "TestTaBLE" values(9);
insert into TestTaBLE values(19);

alter table "TestTaBLE" add column val2 text;

insert into "TestTaBLE" values(4, 'hello');
select * from "TestTaBLE" where val2 = 'Hello';