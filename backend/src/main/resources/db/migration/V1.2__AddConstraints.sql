ALTER TABLE student
ADD CONSTRAINT chk_position CHECK ( position in ('STUDENT', 'HEADMAN'));

ALTER TABLE group_student
ADD CONSTRAINT fk_group_group_student FOREIGN KEY(group_id) REFERENCES _group(id),
ADD CONSTRAINT fk_student_group_student FOREIGN KEY(student_id) REFERENCES student(id);

ALTER TABLE event
ADD CONSTRAINT chk_type CHECK ( type in ('LAB', 'BIRTHDAY', 'EXAM', 'GENERAL')),
ADD CONSTRAINT fk_subject_event FOREIGN KEY(subject_id) REFERENCES subject(id),
ADD CONSTRAINT fk_group_event FOREIGN KEY(group_id) REFERENCES _group(id);

ALTER TABLE subject_group
ADD CONSTRAINT fk_subject_subject_group FOREIGN KEY(subject_id) REFERENCES subject(id),
ADD CONSTRAINT fk_group_subject_group FOREIGN KEY(group_id) REFERENCES _group(id);

ALTER TABLE subject_schedule
ADD CONSTRAINT chk_day CHECK ( day in ('MONDAY', 'TUESDAY', 'WEDNESDAY',
                                       'THURSDAY', 'FRIDAY', 'SATURDAY', 'SUNDAY') ),
ADD CONSTRAINT fk_subject_subject_schedule FOREIGN KEY(subject_id) REFERENCES subject(id),
ADD CONSTRAINT fk_group_subject_schedule FOREIGN KEY (group_id) REFERENCES _group(id);





