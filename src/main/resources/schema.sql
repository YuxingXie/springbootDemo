CREATE TABLE contacts(
  id VARCHAR(32) PRIMARY KEY,
  firstName VARCHAR(30) not null,
  lastName VARCHAR(50) NOT NULL ,
  phoneNumber VARCHAR(13),
  emailAddress VARCHAR(30)
);