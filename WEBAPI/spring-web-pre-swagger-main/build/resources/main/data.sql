

INSERT INTO franchise (franchise_name, description) VALUES ('MARVEL_CINEMATIC_UNIVERSE', 'A superhero movie franchise created by Marvel Studios');
INSERT INTO franchise (franchise_name, description) VALUES ('LORD_OF_THE_RINGS', 'A movie trilogy based on the novels of J.R.R. Tolkien');
INSERT INTO franchise (franchise_name, description) VALUES ('STAR_WARS', 'An epic space-opera franchise created by George Lucas');
INSERT INTO franchise (franchise_name, description) VALUES ('HARRY_POTTER', 'A movie franchise based on the novels by J.K. Rowling');
INSERT INTO franchise (franchise_name, description) VALUES ('POKEMON', 'A movie franchise based on the Pokemon video game series');

INSERT INTO character (full_name, alias, gender, picture) VALUES ('Robert Downey Jr.', 'Iron Man', 'MALE', 'https://example.com/iron-man.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Chris Evans', 'Captain America', 'MALE', 'https://example.com/captain-america.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Chris Hemsworth', 'Thor', 'MALE', 'https://example.com/thor.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Scarlett Johansson', 'Black Widow', 'FEMALE', 'https://example.com/black-widow.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Gal Gadot', 'Wonder Woman', 'FEMALE', 'https://example.com/wonder-woman.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Emma Watson', 'Hermione Granger', 'FEMALE', 'https://example.com/hermione.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Daniel Radcliffe', 'Harry Potter', 'MALE', 'https://example.com/harry-potter.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Ash Ketchum', 'Ash', 'MALE', 'https://example.com/ash.jpg');
INSERT INTO character (full_name, alias, gender, picture) VALUES ('Pikachu', 'Pikachu', 'GENDERFLUID', 'https://example.com/pikachu.jpg');

INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (1, 'The Avengers', 'ACTION', '2012', 'Joss Whedon', 'exampleUrl1picture', 'exampleUrl1 trailer', 1);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (2, 'Avengers: Age of Ultron', 'ACTION', '2015', 'Joss Whedon', 'exampleUrl2 picture', 'exampleUrl2 trailer', 1);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (3, 'Avengers: Infinity War', 'ACTION', '2018', 'Anthony and Joe Russo', 'exampleUrl3 picture', 'exampleUrl3 trailer', 1);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (4, 'Avengers: Endgame', 'ACTION', '2019', 'Anthony and Joe Russo', 'exampleUrl4 picture', 'exampleUrl4 trailer', 1);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (5, 'The Fellowship of the Ring', 'FANTASY', '2001', 'Peter Jackson', 'exampleUrl5 picture', 'exampleUrl5 trailer', 2);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (6, 'The Two Towers', 'FANTASY', '2002', 'Peter Jackson', 'exampleUrl6 picture', 'exampleUrl6 trailer', 2);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (7, 'The Return of the King', 'FANTASY', '2003', 'Peter Jackson', 'exampleUrl7 picture', 'exampleUrl7 trailer', 2);
INSERT INTO movie (movie_id, title, genre, release_year, director, picture, trailer, franchise_id) VALUES (8, 'The Return of the Dragon', 'FANTASY', '2005', 'Peter Jackson', 'exampleUrl7 picture', 'exampleUrl7 trailer', 2);

INSERT INTO movie_character (movie_id, character_id) VALUES (1, 1);
INSERT INTO movie_character (movie_id, character_id) VALUES (1, 2);
INSERT INTO movie_character (movie_id, character_id) VALUES (2, 1);
INSERT INTO movie_character (movie_id, character_id) VALUES (2, 2);
INSERT INTO movie_character (movie_id, character_id) VALUES (3, 1);
INSERT INTO movie_character (movie_id, character_id) VALUES (3, 2);
INSERT INTO movie_character (movie_id, character_id) VALUES (4, 1);
INSERT INTO movie_character (movie_id, character_id) VALUES (4, 2);
INSERT INTO movie_character (movie_id, character_id) VALUES (5, 3);
INSERT INTO movie_character (movie_id, character_id) VALUES (5, 4);
INSERT INTO movie_character (movie_id, character_id) VALUES (6, 3);
INSERT INTO movie_character (movie_id, character_id) VALUES (6, 4);
INSERT INTO movie_character (movie_id, character_id) VALUES (7, 3);
INSERT INTO movie_character (movie_id, character_id) VALUES (7, 4);