CREATE TABLE task (
    id INTEGER AUTO_INCREMENT,
    name VARCHAR(80) NOT NULL,
    description VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO task (name, description) VALUES
('Docker', 'Complete Docker course'),
('AWS', 'Complete AWS course');