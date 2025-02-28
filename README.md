# string-tension-app

## Motivation
A project out of interest and two of my hobbies (Tennis and Java Programming). Idea of the app is to create a system to allow users to record the tensions when they string their rackets

## Introduction
Functions:
- Allows users to keep track of string tensions of their rackets 
- Users can put in an order to the website and have their rackets strung

## Tech used
Backend: 
Frontend: Node.js, Vue.js, JavaScript, HTML, CSS

## How to run the backend application
### Database setup
Open up MySQL\
Create a database in MySQL
```script
mysql> CREATE DATABASE equipment_store;
```

Check if database is created using
```script
mysql> show databases;
```

Enter todolist database
```script
mysql> USE equipment_store
```

Create idiom and idiom_example table in the idiom database
```script
mysql> CREATE TABLE user (
    user_id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    address varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    contact_number varchar(255) NOT NULL,
    is_admin TINYINT(1) NOT NULL DEFAULT 0,
    date_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (user_id)
);
```

Check details of table
```script
mysql> DESCRIBE user;
```
