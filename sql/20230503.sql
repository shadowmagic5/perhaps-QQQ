CREATE TABLE girls
(
    id	BIGINT,
    name	NVARCHAR(50),
    address NVARCHAR(50),
    birthday DATE,
    age INT,
    character NVARCHAR(50),
    high_school NVARCHAR(30),
    face_score	NVARCHAR(30),
    body_score	NVARCHAR(30),
    description NVARCHAR(200),
    status	NCHAR(1),
    create_by NVARCHAR(64),
    create_time DATETIME2,
    update_by NVARCHAR(64),
    update_time DATETIME2
)