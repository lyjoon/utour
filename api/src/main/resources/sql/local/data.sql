/* 국가정보(country) */
insert into country (country_Code, country_name, enable) values ('KR', '한국', 'Y');
insert into country (country_Code, country_name, enable) values ('MX', '멕시코', 'Y');
insert into country (country_Code, country_name, enable) values ('TH', '태국', 'Y');
insert into country (country_Code, country_name, enable) values ('US', '미국', 'Y');
insert into country (country_Code, country_name, enable) values ('HW', '하와이', 'Y');
insert into country (country_Code, country_name, enable) values ('JP', '일본', 'Y');
insert into country (country_Code, country_name, enable) values ('MV', '몰디브', 'Y');
insert into country (country_Code, country_name, enable) values ('CH', '중국', 'Y');
insert into country (country_Code, country_name, enable) values ('ID', '인도네시아', 'Y');
insert into country (country_Code, country_name, enable) values ('VN', '베트남', 'Y');
insert into country (country_Code, country_name, enable) values ('PH', '필리핀', 'Y');

/* 지역정보(area) */
insert into area (country_code, area_code, area_name, enable) values ('KR','GMP', '서울', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('KR','PUS', '부산', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('KR','CJU', '제주', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('MX','CUN', '칸쿤', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('MX','MEX', '멕시코시티', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('MX','GDL', '과달라하라', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('TH','BKK', '방콕', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('TH','HKT', '푸켓', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('TH','CNX', '치앙마이', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('TH','PYX', '파타야', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('PH','CEB', '세부', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('PH','MNL', '마닐라', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('PH','KLO', '보라카이', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('PH','TAG', '보홀', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('ID','DPS', '발리', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('ID','JKT', '자카르타', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('ID','SUB', '수라바야', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('ID','BDO', '반둥', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('MV','MLE', '말레(몰디브)', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('HW','HNL', '호놀룰루', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('VN','DAD', '다낭', 'Y');
insert into area (country_code, area_code, area_name, enable) values ('VN','SGN', '호치민', 'Y');

/* 메뉴 */
insert into menu (menu_id, menu_name, order_no, enable, country_code, area_code) values (seq_menu.nextval, '하와이' , 1, 'Y', 'HW', null);
insert into menu (menu_id, menu_name, order_no, enable, country_code, area_code) values (seq_menu.nextval, '몰디브' , 2, 'Y', 'MV', null);
insert into menu (menu_id, menu_name, order_no, enable, country_code, area_code) values (seq_menu.nextval, '칸쿤' , 3, 'Y', 'MX', 'CUN');
insert into menu (menu_id, menu_name, order_no, enable, country_code, area_code) values (seq_menu.nextval, '발리' , 4, 'Y', 'ID', 'DPS');
insert into menu (menu_id, menu_name, order_no, enable, country_code, area_code) values (seq_menu.nextval, '다낭' , 5, 'Y', 'VN', 'DAD');

/* 게시판 */
insert into board (board_id, board_type, title, contents, create_at, writer) values (seq_board.nextval, 'NOTICE','오픈공지', '준비중입니다.', sysdate, 'lyjoon');
insert into board (board_id, board_type, title, contents, create_at, writer) values (seq_board.nextval, 'QNA','q', 'a', sysdate, 'lyjoon');
insert into board (board_id, board_type, title, contents, create_at, writer) values (seq_board.nextval, 'REVIEW','호호', '3점', sysdate, 'lyjoon');

/* 댓글 */
insert into reply (seq, board_id, reply, password, writer) values (seq_reply.nextval, 1, '냉무', '1234', 'lyjoon');
insert into reply (seq, board_id, reply, password, writer) values (seq_reply.nextval, 1, '무플방지', '1234', 'lyjoon');

/* QnA */
insert into qna (board_id, password) values (2, '1234');

/* QnA */
insert into review (board_id, score) values (3, 3);
