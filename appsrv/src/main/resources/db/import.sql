UPDATE hibernate_sequence set next_val = 1000;
/*
INSERT INTO School(id, name, street) values
    (1, 'HTL-Perg', 'Machlandstr. 48'),
    (2, 'HTL-Leonding', 'Limesstrasse 8-12');
INSERT INTO Course(id, name, school_id) values(1, '4BHIF', 1);

INSERT INTO Person(id, LastName, FirstName, MatNr, course_id) values
    (1, 'Doe', 'John', '1234', 1),
    (2, 'Roe', 'Jane', '5678', 1),
    (3, 'Sixpack', 'Joe', '9012', 1);

insert into db.Bill(bill_id) values (1);
insert into db.Line(bill_id, row_id, amount) values (1, 1, 60);
*/

insert into db.Shop(shopId, name, contactPerson) values (1, 'Faie', 'Faie-Manager');
insert into db.Shop(shopId, name, contactPerson) values (2, 'Test1', 'Faie-Manager');
insert into db.Shop(shopId, name, contactPerson) values (3, 'Test2', 'Faie-Manager');

insert into db.APILink(apiId, url, description, user, password, shopId) values (1, 'https://www.faie.at/backend/export/index/agraraktionen.csv?feedID=68&hash=1bfdc5718d84ebfd191e9ee6617a7764', '', '', '', 1);
insert into db.APILink(apiId, url, description, user, password, shopId) values (2, '', '', 'wdawd', 'awd', 2);
insert into db.APILink(apiId, url, description, user, password, shopId) values (3, '', '', 'awd', 'awd', 2);

insert into db.Price(priceId, timestamp, validFlag) values (1, 'Stamp1', true);
/*
insert into db.Price(priceId, timestamp, validFlag) values (2, 'Stamp2', true);
insert into db.Price(priceId, timestamp, validFlag) values (3, 'Stamp3', true);
 */