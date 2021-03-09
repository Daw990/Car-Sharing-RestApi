create table brand_car
(
    id      bigint auto_increment primary key,
    brand    varchar(20) not null,
    created timestamp
);

create table model_car
(
    id           bigint auto_increment primary key,
    brand_car_id bigint      not null,
    model        varchar(20) not null,
    created      timestamp
);

alter table model_car
    add constraint model_brand_id
    foreign key (brand_car_id) references brand_car(id)