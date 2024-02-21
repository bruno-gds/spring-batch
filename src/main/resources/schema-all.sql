DROP TABLE IF EXISTS person;

CREATE TABLE person
(
    id                  SERIAL,
    nome                VARCHAR(240),
    street_name         VARCHAR(240),
    number              VARCHAR(240),
    city                VARCHAR(240),
    country             VARCHAR(240),
    email               VARCHAR(240),
    phoneNumber         VARCHAR(240),
    created_date_time   TIMESTAMP
);