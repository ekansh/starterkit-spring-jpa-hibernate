truncate category;

insert into category (categoryid, name, parent_categoryid) values (999,'root',null);
insert into category (categoryid, name, parent_categoryid) values (1,'Phones',999);
insert into category (categoryid, name, parent_categoryid) values (101,'Samsung',1);
insert into category (categoryid, name, parent_categoryid) values (102,'iPhones',1);
insert into category (categoryid, name, parent_categoryid) values (103,'LG',1);
insert into category (categoryid, name, parent_categoryid) values (104,'BLACKBERRY',1);
insert into category (categoryid, name, parent_categoryid) values (105,'NOKIA',1);

insert into category (categoryid, name, parent_categoryid) values (911,'rootAChild1',910);
insert into category (categoryid, name, parent_categoryid) values (912,'rootAChild2',910);
insert into category (categoryid, name, parent_categoryid) values (913,'rootAChild3',910);
insert into category (categoryid, name, parent_categoryid) values (9111,'rootAChild1_Child1',911);
insert into category (categoryid, name, parent_categoryid) values (9121,'rootAChild2_Child1',912);
insert into category (categoryid, name, parent_categoryid) values (9131,'rootAChild3_Child1',913);

select * from category;

