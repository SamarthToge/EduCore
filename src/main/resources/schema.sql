CREATE TABLE teachers (
                          id INT AUTO_INCREMENT PRIMARY KEY,

                          fname VARCHAR(100) NOT NULL,
                          lname VARCHAR(100) NOT NULL,
                          subject VARCHAR(100),
                          experience INT DEFAULT 0,
                          qualification VARCHAR(255),
                          con_no VARCHAR(20),
                          email VARCHAR(255) UNIQUE,

                          created_by VARCHAR(100),
                          created_at DATE,
                          updated_by VARCHAR(100),
                          updated_at DATE,
                          status VARCHAR(20) DEFAULT 'ACTIVE'
);