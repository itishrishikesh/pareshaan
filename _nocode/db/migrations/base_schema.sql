-- Create the 'hero' table
CREATE TABLE hero (
    id SERIAL PRIMARY KEY,
    password VARCHAR(255),
    email VARCHAR(255),
    name VARCHAR(255)
);

-- Create the 'project' table
CREATE TABLE project (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    poc INT,
    email VARCHAR(255)
);

-- Create the 'bug' table
CREATE TABLE bug (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    steps TEXT,
    attachments TEXT,
    links TEXT,
    project_id INT,
    status VARCHAR(20),
    assigned_to INT,
    resolved BOOLEAN
);

-- Add comments for columns at the bottom
COMMENT ON COLUMN hero.id IS 'Unique identifier for each user';
COMMENT ON COLUMN hero.password IS 'Password for the user (should be stored as a hash, not plain text)';
COMMENT ON COLUMN hero.email IS 'Email address of the user';
COMMENT ON COLUMN hero.name IS 'Name of the user';

COMMENT ON COLUMN project.id IS 'Unique identifier for each project';
COMMENT ON COLUMN project.name IS 'Name of the project';
COMMENT ON COLUMN project.description IS 'Detailed description of the project';
COMMENT ON COLUMN project.poc IS 'Identifier for the user (from the "hero" table) who is the point of contact for this project';
COMMENT ON COLUMN project.email IS 'Email address for the project or point of contact';

COMMENT ON COLUMN bug.id IS 'Unique identifier for each bug';
COMMENT ON COLUMN bug.title IS 'Short summary of the bug';
COMMENT ON COLUMN bug.description IS 'Detailed description of the bug';
COMMENT ON COLUMN bug.steps IS 'Steps to reproduce the bug';
COMMENT ON COLUMN bug.attachments IS 'Any attachments related to the bug (e.g., screenshots)';
COMMENT ON COLUMN bug.links IS 'Any relevant links (e.g., to related bugs or resources)';
COMMENT ON COLUMN bug.project_id IS 'Identifier for the project this bug is associated with';
COMMENT ON COLUMN bug.status IS 'Current status of the bug';
COMMENT ON COLUMN bug.assigned_to IS 'Identifier for the user this bug is assigned to';
COMMENT ON COLUMN bug.resolved IS 'Whether or not the bug has been resolved';