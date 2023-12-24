SET search_path TO public;

create table PERSONS (
     name varchar(50),
     surname varchar(50),
     age int,
     phone_number varchar(50),
     city_of_living varchar(50),
     primary key (name, surname, age)
);

insert into persons values ('Roman', 'Novikov', 35, 9851898, 'Voronezh');
insert into persons values ('Maksim', 'Galkin', 47, 98514548, 'Kesaria');
insert into persons values ('Vladimir', 'Putin', 71, 537125378, 'Moscow');
insert into persons values ('Alla', 'Pugacheva', 74, 9851123, 'Kesaria');
insert into persons values ('Vasya', 'Maloy', 26, 9855498, 'Moscow');
insert into persons values ('Petya', 'Pupkin', 27, 9851812, 'Moscow');