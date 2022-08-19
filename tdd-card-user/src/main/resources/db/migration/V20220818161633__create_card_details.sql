create table card_details (
    card_number varchar(19) unique not null,
    pin varchar(6) not null,
    created_time timestamp default current_timestamp,
    last_modified_time timestamp default current_timestamp,
    primary key (card_number)
);
