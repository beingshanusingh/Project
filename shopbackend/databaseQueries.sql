create table category(
id int auto_increment,
name varchar(50),
description varchar(255),
image_url varchar(50),
is_active boolean,
constraint pk_category_id primary key(id)
);

