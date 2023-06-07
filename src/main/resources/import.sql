INSERT INTO public._group (semester, id, name) VALUES(1, 1, 'Group 1');
INSERT INTO student (id, first_name, last_name, patronymic, position, birthday, credit_number, has_scholarship, email, password) VALUES (1, 'John', 'Doe', 'Johnovych', 'STUDENT', '2000-01-01', '1234567890', true, 'student1@example.com', 'password1');
INSERT INTO group_student(group_id, student_id) VALUES (1, 1);
INSERT INTO Subject (id, name, teacher_name) VALUES (1,'Mathematics', 'John Smith');
INSERT INTO subject_schedule (end_time, is_odd, start_time, group_id, id, subject_id, day) VALUES ('12:00:00.000', true, '10:00:00.000', 1, 1, 1, 'MONDAY');
INSERT INTO subject_group (credits, group_id, number_labs, subject_id, comission_date, exam_date) VALUES (3, 1, 5, 1, '2023-06-01 00:00:00.000', '2023-06-15 00:00:00.000');
INSERT INTO event (end_time, group_id, id, start_time, subject_id, description) VALUES ('2023-06-01 12:00:00.000', 1, 1, '2023-06-01 10:00:00.000', 1, 'Event description');