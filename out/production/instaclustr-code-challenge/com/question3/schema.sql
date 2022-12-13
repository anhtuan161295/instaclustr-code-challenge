create table candidates (
  id integer primary key,
  name varchar(20) not null unique,
  age integer not null
);

create table reports (
  id integer primary key,
  company varchar(20) not null,
  candidate_id integer not null,
  score integer not null
);

INSERT INTO candidates (id,name,age) VALUES
	 (10,'Lara',19),
	 (25,'Taylor',30),
	 (113,'Paul',21);

INSERT INTO instaclustr.reports (id,company,candidate_id,score) VALUES
	 (1,'Codility',10,20),
	 (2,'ITCompany',10,99),
	 (36,'Soft',113,60),
	 (137,'Codility',10,30);

