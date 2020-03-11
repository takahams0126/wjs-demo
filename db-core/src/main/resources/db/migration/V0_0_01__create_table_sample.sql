--
CREATE TABLE msv_user (
    id               INT(5) NOT NULL AUTO_INCREMENT,
    name             VARCHAR(20) NOT NULL,
    created_at       DATETIME DEFAULT NULL,
    updated_at       DATETIME DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE entry (
    id               INT NOT NULL,
    name             VARCHAR(20) NOT NULL,
    created_at       DATETIME DEFAULT NULL,
    updated_at       DATETIME DEFAULT NULL,
    PRIMARY KEY (id)
);
