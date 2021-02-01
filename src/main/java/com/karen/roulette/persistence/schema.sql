-- ----------------------------------------------
-- Table "BET_OPTIONS"
-- ----------------------------------------------
CREATE TABLE IF NOT EXISTS BET_OPTIONS (
    bet_option_id serial NOT NULL,
    opcion VARCHAR ( 10 ) NOT NULL,
    color BOOLEAN NOT NULL,
    PRIMARY KEY(bet_option_id)
    );
-- ----------------------------------------------
-- Table "ROULETTES"
-- ----------------------------------------------
CREATE TABLE IF NOT EXISTS ROULETTES (
    roulette_id INT NOT NULL,
    available BOOLEAN NOT NULL,
    winning_number INT,
    PRIMARY KEY(roulette_id),
    FOREIGN KEY (winning_number)
    REFERENCES BET_OPTIONS (bet_option_id)
    );

-- ----------------------------------------------
-- Table "BETS"
-- ----------------------------------------------
CREATE TABLE IF NOT EXISTS BETS (
    bet_id serial NOT NULL,
    roulette_id INT NOT NULL,
    bet_option_id INT NOT NULL,
    usuario_id VARCHAR (20) NOT NULL,
    dinero INT NOT NULL,
    PRIMARY KEY(bet_id),
    FOREIGN KEY (roulette_id)
    REFERENCES ROULETTES (roulette_id),
    FOREIGN KEY (bet_option_id)
    REFERENCES BET_OPTIONS (bet_option_id)
    );