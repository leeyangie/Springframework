create database sample;
use sample;

CREATE TABLE sample (
    num INT,
    title VARCHAR(50),
    res TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

select * from sample;

insert into sample values (1, '샘플1', default);
insert into sample values (2, '샘플2', default);
insert into sample values (3, '샘플3', default);

commit;