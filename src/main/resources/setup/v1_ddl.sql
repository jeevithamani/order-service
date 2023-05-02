CREATE TABLE IF NOT EXISTS orders
(
    id              BIGSERIAL PRIMARY KEY,
	quantity           bigint NOT NULL,
    price             bigint,
	customer_id 	bigint NOT NULL,
    productname        varchar(200) NOT NULL,
    ordered_date           timestamp NOT NULL
)
