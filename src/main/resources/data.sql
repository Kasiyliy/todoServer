insert into roles (id, created_at, deleted_at, updated_at, name) values (1, '2019-04-06 20:11:24', null, '2019-04-06 20:11:36', 'ROLE_TEACHER');
insert into roles (id, created_at, deleted_at, updated_at, name) values (2, '2019-04-06 20:11:42', null, '2019-04-06 20:11:44', 'ROLE_STUDENT');

insert into users (id, created_at, deleted_at, updated_at, first_name, last_name, login, password, phone_number, role_id) values (1, '2019-04-18 19:59:59', null, '2019-04-18 19:59:59', 'Teacher', 'Teacher', 'admin', '$2a$10$H2PqH5KUkeooBkWeLkKVzOwCcX.6F6Z/HBy4f//rg9/GHiBR8493u', '877777777777', 1);