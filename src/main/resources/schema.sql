create table brand_car
(
    id      bigint auto_increment primary key,
    brand    varchar(20) not null,
    created timestamp
);

create table model_car
(
    id              bigint auto_increment primary key,
    brand_car_id    bigint      not null,
    model           varchar(20) not null,
    created         timestamp
);

create table company_car
(
    id                      bigint auto_increment primary key,
    model_car_id            bigint      not null,
    brand_car_id            bigint      not null,
    registration_number     varchar(20),
    rented                  boolean,
    available               boolean,
    created                 timestamp not null default current_timestamp,
    updated                 timestamp not null default current_timestamp on update current_timestamp
);

alter table company_car
    add constraint company_brand_id
    foreign key (brand_car_id) references brand_car(id);

alter table company_car
    add constraint company_model_id
    foreign key (model_car_id) references model_car(id);

alter table model_car
    add constraint model_brand_id
    foreign key (brand_car_id) references brand_car(id);