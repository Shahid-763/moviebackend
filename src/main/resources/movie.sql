CREATE TABLE IF NOT EXISTS movies (
    movieId INT AUTO_INCREMENT PRIMARY KEY,
    movieName VARCHAR(255) NOT NULL,
    movieGenre VARCHAR(255) NOT NULL,
    movieType VARCHAR(255) NOT NULL,
    movie_rating INT,
    movieimage VARCHAR(255)
);
INSERT INTO movies (movieName, movieGenre, movieType, movie_rating, movieimage) VALUES
('Inception', 'Science Fiction', 'Feature', 8, 'inception.jpg'),
('The Godfather', 'Crime', 'Feature', 9, 'godfather.jpg'),
('Spirited Away', 'Animation', 'Feature', 9, 'spirited_away.jpg'),
('Parasite', 'Thriller', 'Feature', 9, 'parasite.jpg'),
('The Dark Knight', 'Action', 'Feature', 9, 'dark_knight.jpg'),
('Amélie', 'Romantic Comedy', 'Feature', 8, 'amelie.jpg'),
('Interstellar', 'Science Fiction', 'Feature', 8, 'interstellar.jpg'),
('Crouching Tiger, Hidden Dragon', 'Martial Arts', 'Feature', 7, 'crouching_tiger.jpg');
