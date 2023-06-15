CREATE TABLE IF NOT EXISTS student (
    id BIGSERIAL,
    has_scholarship BOOLEAN,
    birthday TIMESTAMP,
    credit_number VARCHAR(20),
    email VARCHAR(64),
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    password VARCHAR(20),
    position VARCHAR(32),
    CONSTRAINT pk_student PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS _group(
    id BIGSERIAL,
    name VARCHAR(128),
    year INTEGER,
    CONSTRAINT pk_group PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS group_student(
    group_id BIGINT,
    student_id BIGINT,
    CONSTRAINT pk_group_student PRIMARY KEY(group_id, student_id)
);

CREATE TABLE IF NOT EXISTS event(
    id BIGSERIAL,
    type VARCHAR(64),
    description TEXT,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    subject_id BIGINT,
    group_id BIGINT,
    CONSTRAINT pk_events PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS subject(
    id BIGSERIAL,
    name VARCHAR(64),
    teacher_name VARCHAR(64),
    CONSTRAINT pk_subject PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS subject_group(
    group_id BIGINT,
    subject_id BIGINT,
    number_labs INTEGER,
    credits INTEGER,
    exam_date TIMESTAMP,
    comission_date TIMESTAMP,
    CONSTRAINT pk_subject_group PRIMARY KEY(group_id, subject_id)
);

CREATE TABLE IF NOT EXISTS subject_schedule(
    id BIGINT,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    isOdd BOOLEAN,
    day VARCHAR(16),
    subject_id BIGINT,
    group_id BIGINT,
    CONSTRAINT pk_subject_schedule PRIMARY KEY(id)
);









