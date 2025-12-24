create database sonaa;
go

use sonaa;
go


CREATE TABLE people (
    national_id VARCHAR(20) PRIMARY KEY,
    full_name NVARCHAR(100) not null,
    address VARCHAR(200),
   phone varchar(20) ,
role varchar(100) check(role in('board of directores','leader fixed committee','leader unfixed committee')),
    password_hash VARCHAR(255) not null,
    email VARCHAR(100),
    comm_name VARCHAR(100),
);



CREATE TABLE committee (
    name VARCHAR(100) PRIMARY KEY,
    type VARCHAR(50),
    pe_national_id VARCHAR(20),
   constraint co_pe_fk FOREIGN KEY (pe_national_id) REFERENCES people(national_id)
);


CREATE TABLE beneficiaries (
    national_id VARCHAR(20) PRIMARY KEY  not null,
    full_name NVARCHAR(100)  not null,
    age INT not null,
    job NVARCHAR(100)  not null,
    phone VARCHAR(20) not null,
    region NVARCHAR(100)  not null,
    street NVARCHAR(100),
    income int  not null,
    type_of_housing NVARCHAR(100)  not null,
    status NVARCHAR(50)  not null,
    level VARCHAR(20)  not null
);



CREATE TABLE projects (
    name_project  NVARCHAR(100)  PRIMARY KEY,
    nam_committee varchar(100) not null,
 constraint pro_com_fk FOREIGN KEY (nam_committee) REFERENCES committee(name)
);


CREATE TABLE work_on (
    national_id VARCHAR(20),
       name_project  NVARCHAR(100),
    PRIMARY KEY (national_id, name_project ),
   constraint wo_pe_fk  FOREIGN KEY (national_id) REFERENCES people(national_id),
    constraint wor_peo_fk FOREIGN KEY (  name_project) REFERENCES projects(  name_project)
);


CREATE TABLE help (
    national_id VARCHAR(20),
      name_project  NVARCHAR(100)   ,
    PRIMARY KEY (national_id, name_project),
    constraint he_ben_fk  FOREIGN KEY (national_id) REFERENCES beneficiaries(national_id),
     constraint hel_ben_fk FOREIGN KEY (name_project ) REFERENCES projects( name_project)
);


alter table people
add constraint fi_be_fk foreign key(comm_name)references  committee(name);

alter table people
add  user_name varchar(20) ;

alter table help
ADD 
    --  «·’Õ…
    name NVARCHAR(100),
    Examination_Type NVARCHAR(255),
    Medications NVARCHAR(500),
    Medical_Analysis NVARCHAR(500),
    Surgery NVARCHAR(255),
    X_Ray NVARCHAR(255),

    --  «· ⁄·Ì„
    Foundation_Lessons NVARCHAR(500),
    Teachers_Names NVARCHAR(MAX),
    School_Fees NVARCHAR(255),
    School_Books NVARCHAR(255),

    --  «·œÌÊ‰
    Debt_Reason NVARCHAR(MAX),
    Debt_Value NVARCHAR(255),
    Official_Documents NVARCHAR(500),

    --  ⁄—«Ì”
    Wedding_Date NVARCHAR(100),
    Needs_Requirements NVARCHAR(MAX),
    Marriage_Contract NVARCHAR(255),

    -- «‰”«‰ Ê«ÿ⁄«„
    Clothing_Aid NVARCHAR(500),
    Home_Needs NVARCHAR(MAX),
    Project_Type NVARCHAR(255),
    Ready_Meals_Count NVARCHAR(100),
    Unready_Meals_Count NVARCHAR(100);