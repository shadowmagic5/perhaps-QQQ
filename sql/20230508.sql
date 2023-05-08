CREATE TABLE dd_ask(
id BIGINT,
createdby NVARCHAR(255),
createdon DATETIME2,
modifiedby NVARCHAR(255),
modifiedon DATETIME2,
status NCHAR(1),
phaseid BIGINT,
question NVARCHAR(255)
)

CREATE TABLE dd_phase(
id BIGINT,
createdby NVARCHAR(255),
createdon DATETIME2,
modifiedby NVARCHAR(255),
modifiedon DATETIME2,
status NCHAR(1),
name NVARCHAR(255)
)