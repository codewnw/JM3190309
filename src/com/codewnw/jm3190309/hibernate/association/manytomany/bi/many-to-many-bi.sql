CREATE TABLE JM3190309_MTM_BI_PERSON(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3190309_MTM_BI_ADDRESS(
ID BIGINT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR
);

CREATE TABLE JM3190309_MTM_BI_ADDRESS_JM3190309_MTM_BI_PERSON(
ADDRESS_ID BIGINT,
PERSON_ID BIGINT
);

ALTER TABLE JM3190309_MTM_BI_ADDRESS_JM3190309_MTM_BI_PERSON
ADD CONSTRAINT P_FK
FOREIGN KEY(PERSON_ID) REFERENCES JM3190309_MTM_BI_PERSON(ID);

ALTER TABLE JM3190309_MTM_BI_ADDRESS_JM3190309_MTM_BI_PERSON
ADD CONSTRAINT A_FK
FOREIGN KEY(ADDRESS_ID) REFERENCES JM3190309_MTM_BI_ADDRESS(ID);
