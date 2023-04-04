CREATE TABLE movie (
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(255) NOT NULL DEFAULT 'ACTION',
    duration VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE user (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE saal (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    seats INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ticket (
    id INT NOT NULL AUTO_INCREMENT,
    movie_id INT NOT NULL,
    saal_id INT NOT NULL,
    user_id INT NOT NULL,
    seat INT NOT NULL,
    booking_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (movie_id) REFERENCES movie(id),
    FOREIGN KEY (saal_id) REFERENCES saal(id),
    FOREIGN KEY (booking_id) REFERENCES booking(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE booking (idid
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    booking_date DATETIME NOT NULL,
    status VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE ticket_booking (
    ticket_id INT NOT NULL,
    booking_id INT NOT NULL,
    PRIMARY KEY (ticket_id, booking_id),
    FOREIGN KEY (ticket_id) REFERENCES ticket(id),
    FOREIGN KEY (booking_id) REFERENCES booking(id)
);






