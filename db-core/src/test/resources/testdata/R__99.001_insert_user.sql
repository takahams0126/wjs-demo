-- テストデータをクリアするDELETE分を最初に必ず書くこと
DELETE FROM msv_user where id in (1, 2);

INSERT INTO msv_user (id, name, created_at, updated_at) VALUES(1, 'Bob', now(), now());
INSERT INTO msv_user (id, name, created_at, updated_at) VALUES(2, 'Nancyおら', now(), now());

