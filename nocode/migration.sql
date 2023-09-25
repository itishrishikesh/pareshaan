CREATE TABLE bug (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each bug
    title VARCHAR(255), -- Short summary of the bug
    description TEXT, -- Detailed description of the bug
    steps TEXT, -- Steps to reproduce the bug
    attachments TEXT, -- Any attachments related to the bug (e.g., screenshots)
    links TEXT, -- Any relevant links (e.g., to related bugs or resources)
    project_id INT, -- Identifier for the project this bug is associated with
    status ENUM('OPEN', 'CLOSE', 'IN_PROGRESS', 'REOPEN', 'WAITING_FOR_RESPONSE'), -- Current status of the bug
    assigned_to INT, -- Identifier for the user this bug is assigned to
    resolved BOOLEAN, -- Whether or not the bug has been resolved
    FOREIGN KEY (project_id) REFERENCES project(id),
    FOREIGN KEY (assigned_to) REFERENCES hero(id)
);

CREATE TABLE hero (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each user
    password VARCHAR(255), -- Password for the user (should be stored as a hash, not plain text)
    email VARCHAR(255), -- Email address of the user
    name VARCHAR(255) -- Name of the user
);


CREATE TABLE project (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each project
    name VARCHAR(255), -- Name of the project
    description TEXT, -- Detailed description of the project
    poc INT, -- Identifier for the user (from the 'hero' table) who is the point of contact for this project
    email VARCHAR(255), -- Email address for the project or point of contact
    FOREIGN KEY (poc) REFERENCES hero(id)
);

