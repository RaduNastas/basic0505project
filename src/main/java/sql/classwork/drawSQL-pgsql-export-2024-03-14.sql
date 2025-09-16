CREATE TABLE "Client"(
    "id" SERIAL NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "last_name" VARCHAR(255) NOT NULL,
    "address" VARCHAR(255) NOT NULL,
    "email" VARCHAR(255) NOT NULL,
    "phone_number" BIGINT NOT NULL,
    "client_id" SERIAL NOT NULL
);
ALTER TABLE
    "Client" ADD PRIMARY KEY("id");
CREATE TABLE "Kindergarten"(
    "id" SERIAL NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "address" VARCHAR(255) NOT NULL,
    "phone_number" BIGINT NOT NULL,
    "email" VARCHAR(255) NULL,
    "web_address" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "Kindergarten" ADD PRIMARY KEY("id");
CREATE TABLE "Kind"(
    "id" SERIAL NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "last_name" VARCHAR(255) NOT NULL,
    "age" INTEGER NOT NULL,
    "address" VARCHAR(255) NOT NULL,
    "kind_id" SERIAL NOT NULL
);
ALTER TABLE
    "Kind" ADD PRIMARY KEY("id");
CREATE TABLE "Parents"(
    "id" SERIAL NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "last_name" VARCHAR(255) NOT NULL,
    "address" VARCHAR(255) NOT NULL,
    "phone_number" BIGINT NOT NULL,
    "email" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "Parents" ADD PRIMARY KEY("id");
CREATE TABLE "Restaurant"(
    "id" SERIAL NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    "address" VARCHAR(255) NOT NULL,
    "open_hours" TIME(0) WITHOUT TIME ZONE NOT NULL,
    "phone_number" BIGINT NOT NULL,
    "web_address" VARCHAR(255) NOT NULL,
    "description" TEXT NOT NULL
);
ALTER TABLE
    "Restaurant" ADD PRIMARY KEY("id");
ALTER TABLE
    "Client" ADD CONSTRAINT "client_client_id_foreign" FOREIGN KEY("client_id") REFERENCES "Restaurant"("id");
ALTER TABLE
    "Kind" ADD CONSTRAINT "kind_kind_id_foreign" FOREIGN KEY("kind_id") REFERENCES "Parents"("id");
ALTER TABLE
    "Kind" ADD CONSTRAINT "kind_kind_id_foreign" FOREIGN KEY("kind_id") REFERENCES "Kindergarten"("id");